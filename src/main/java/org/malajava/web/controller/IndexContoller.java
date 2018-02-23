package org.malajava.web.controller;

import org.malajava.entity.ItlbGoodsModel;
import org.malajava.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/good")
public class IndexContoller {
    @Autowired
    private GoodsService service;
    @RequestMapping("sal")
    public ModelAndView getHotSaleGoods() {
        ModelAndView modelAndView = new ModelAndView();
        //获取菜单

        //获取焦点图


        //获取热销商品
        List<ItlbGoodsModel> list = service.getHotSaleGoods();
        modelAndView.addObject("hotSale", list);
        for (ItlbGoodsModel g : list) {
            System.out.println(g.getDep_id() + ":" + g.getGood_name());
        }
        modelAndView.setViewName("shouye");

        //获取最新上架商品

        //获取品质商品

        return modelAndView;

    }


}
