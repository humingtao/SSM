package org.malajava.dao;

import org.malajava.entity.ItlbGoodsModel;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("gooddao")
public interface IGoodDao extends  IBaseDao<ItlbGoodsModel>{
    //查询销量前6的商品
    public List<ItlbGoodsModel> getHotSaleGoods();
}
