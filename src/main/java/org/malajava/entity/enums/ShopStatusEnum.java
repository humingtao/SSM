package org.malajava.entity.enums;


/**
 * 门店状态 
 * ClassName: DeptStatusEnum <br/> 
 * Function: 门店状态  0上架 1下架 <br/> 
 * date: 2017年2月18日 下午5:49:57 <br/> 
 * 
 * @author Administrator 
 * @version  1.0.0
 * @since JDK 1.8
 */
public enum ShopStatusEnum {

    ONLINE(0, "上架"),
    OFFLINE(1, "下架");

	private final Integer index;
    private final String text;


    private ShopStatusEnum(Integer index, String text) {
    	this.index = index;
        this.text = text;
    }

    

    public Integer getIndex() {
        return index;
    }
    public String getText() {
        return text;
    }

}
