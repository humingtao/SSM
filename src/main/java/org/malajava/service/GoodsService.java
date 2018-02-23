package org.malajava.service;

import org.malajava.dao.IGoodDao;
import org.malajava.entity.ItlbGoodsModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GoodsService {
    @Autowired
    private IGoodDao dao;

    public List<ItlbGoodsModel> getHotSaleGoods(){
        return dao.getHotSaleGoods();
    }
}
