package org.malajava.web.controller;

import com.google.code.kaptcha.Constants;
import com.google.code.kaptcha.Producer;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;

@Controller
public class KaptchaController {
    private Producer kaptchaProducer = null;
    private Logger logger = Logger.getLogger(KaptchaController.class);

    @Autowired
    public void setCaptchaProducer(Producer kaptchaProducer) {
        this.kaptchaProducer = kaptchaProducer;
    }

    @RequestMapping("/kaptcha")
    public void getKapthcha(HttpServletRequest request, HttpServletResponse response) throws Exception {
        // Set to expire far in the past.
        response.setDateHeader("Expires", 0);
        //设置图片不缓存  Set standard HTTP/1.1 no-cache headers.
        response.setHeader("Cache-control", "no-store, no-cache, must-revalidate");
        // Set IE extended HTTP/1.1 no-cache headers (use addHeader).
        response.addHeader("Cache-Control", "post-check=0, pre-check=0");
        // Set standard HTTP/1.0 no-cache header.
        response.setHeader("Pragma", "no-cache");

        //设置响应的类型
        response.setContentType("image/jpg");

        //生成验证码

        String text = kaptchaProducer.createText();

        //打印验证码
        logger.info("验证码为====================================" + text);
        //在session中保存验证码
        request.getSession().setAttribute(Constants.KAPTCHA_SESSION_KEY, text);
        //生成验证码图片
        BufferedImage bufferedImage = kaptchaProducer.createImage(text);
        //用流向客户端发送验证码

        ServletOutputStream outputStream = response.getOutputStream();

        ImageIO.write(bufferedImage, "jpg", outputStream);

        outputStream.flush();
        outputStream.close();

    }
}
