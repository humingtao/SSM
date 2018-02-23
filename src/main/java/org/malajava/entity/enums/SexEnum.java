package org.malajava.entity.enums;


/**
 * 性别
 * ClassName: SexEnum <br/> 
 * Function:  性别  0 男  1女 <br/> 
 * date: 2017年2月18日 下午5:49:57 <br/> 
 * 
 * @author Administrator 
 * @version  1.0.0
 * @since JDK 1.8
 */
public enum SexEnum {

    MAN(0, "男"),
    WOMAN(1, "女");

	private final Integer index;
    private final String text;


    private SexEnum(Integer index, String text) {
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
