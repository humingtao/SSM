package org.malajava.web.controller;

import com.google.code.kaptcha.Constants;
import org.malajava.entity.BaseMembersModel;
import org.malajava.service.IClassInfoService;
import org.malajava.service.UserServie;
import org.malajava.vo.LoginVO;
import org.malajava.vo.MessageVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user")

public class UserController {

    @Autowired
    private IClassInfoService classInfoService;
    @Autowired
    private UserServie servie;

    /**
     * 此方法在所有方法执行前都会执行一次
     *
     * @param model
     */
    @ModelAttribute
    public void prepare(Model model) {
        System.out.println("ModelAttribute");
        model.addAttribute("vo", new LoginVO());
    }

    /**
     * 验证数据非空
     *
     * @param vo
     * @param result
     * @return
     */

    @RequestMapping
    public String loginCheck(@Valid LoginVO vo, BindingResult result) {
        if (result.hasErrors()) {
            return "index";
        }
        return "shouye";
    }

    /**
     * 检查用户名是否存在的方法
     */
    /*@RequestMapping(value = "check")

    /*点击登录按钮*/
    @RequestMapping("login")
    public ModelAndView loginMsg(HttpServletRequest request, @ModelAttribute("login") LoginVO vo, @RequestParam(value = "code", required = true) String kaptchaReceived) {
        ModelAndView modelAndView = new ModelAndView();
        /* 获取用户输入的验证码的值 */
        String kaptchaExpected = (String) request.getSession().getAttribute(Constants.KAPTCHA_SESSION_KEY);
        /* 校验验证码是否正确 */
        if (kaptchaReceived == null || !kaptchaReceived.equals(kaptchaExpected)) {
            modelAndView.addObject("codemessage", "输入验证码错误！");
            modelAndView.setViewName("index");
            return modelAndView;
        }
        /*判断密码是否正确*/
        BaseMembersModel baseMembersModel = servie.getUser(vo.getUsername());
        if (!baseMembersModel.getMemberPassword().equals(vo.getPassword())) {
            modelAndView.addObject("passmessage", "密码输入错误");
            modelAndView.setViewName("index");
            return modelAndView;
        }
        modelAndView.setViewName("shouye");
        return modelAndView;
    }

    /**
     * 检查该用户是否注册
     *
     * @param
     * @return
     */
    /*@RequestMapping(value = "/check", method = RequestMethod.GET)*/
    @RequestMapping("check")
    @ResponseBody
    public MessageVO checkUser(LoginVO vo) {
        boolean flag = servie.checkUserName(vo.getUsername());
        MessageVO message = new MessageVO();
        if (flag) {
            message.setMsg("该手机号码已注册");
            message.setFlag(true);
        } else {
            message.setMsg("该手机号码没有注册，立即注册享受优惠");
            message.setFlag(false);
        }
        System.out.println("Why are you seroius?");
        System.out.println(vo.getUsername());
        return message;
    }

    /*ajax判断验证码是否正确*/
    @RequestMapping("checkcode")
    @ResponseBody
    public MessageVO checkCode(HttpServletRequest request, @RequestParam(value = "code", required = true) String kaptchaReceived) {
        MessageVO message = new MessageVO();
         /* 获取用户输入的验证码的值 */
        String kaptchaExpected = (String) request.getSession().getAttribute(Constants.KAPTCHA_SESSION_KEY);
         /* 校验验证码是否正确 */
        if (kaptchaReceived == null || !kaptchaReceived.equals(kaptchaExpected)) {
            message.setMsg("输入验证码错误！");
            message.setFlag(false);
        }
        return message;
    }

    /*跳转到首页*/
    @RequestMapping("shouye")
    public String shouye() {
        return "shouye";
    }

    /*注册*/
    @RequestMapping("sign")
    public String sign() {
        return "sign";
    }

    /*注册*/
    @RequestMapping("index")
    public String index() {
        return "index";
    }

    @RequestMapping("zhuce")
    /*添加用户*/
    public ModelAndView save(@ModelAttribute("loginvo") LoginVO vo, HttpServletRequest request, BindingResult result, @RequestParam(value = "code", required = true) String kaptchaReceived) {
        ModelAndView modelAndView = new ModelAndView();
        /* 获取用户输入的验证码的值 */
        String kaptchaExpected = (String) request.getSession().getAttribute(Constants.KAPTCHA_SESSION_KEY);
        /* 校验验证码是否正确 */
        if (kaptchaReceived == null || !kaptchaReceived.equals(kaptchaExpected)) {
            modelAndView.addObject("codemessage", "输入验证码错误！");
            modelAndView.setViewName("sign");
            return modelAndView;
        }
        if (result.hasErrors()) {
            List<FieldError> list = result.getFieldErrors();
            for (FieldError error : list) {
                error.getDefaultMessage();
            }
            modelAndView.setViewName("sign");
            //封装错误消息
            return modelAndView;
        }
        //封装数据
        Map<String, String> map = new HashMap<>();
        map.put("memberNumber", vo.getUsername());
        map.put("memberPassword", vo.getPassword());
        map.put("memberName", vo.getUsername());

        int i = servie.save(map);
        if (i == 0) {
            //没有注册成功，请重新注册
            modelAndView.setViewName("sign");
            modelAndView.addObject("message", "注册失败，请重新填写");
        } else {
            //注册成功，请登录
            modelAndView.setViewName("index");
        }
        return modelAndView;
    }

    public UserServie getServie() {
        return servie;
    }

    public void setServie(UserServie service) {
        this.servie = service;
    }

}