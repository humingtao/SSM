package org.malajava.entity.enums;

/**
 * 
 * ClassName: YesNoEnum <br/> 
 * Function: 0 是 1 否 <br/> 
 * date: 2017年2月24日 上午9:03:19 <br/> 
 * 
 * @author Administrator 
 * @version  1.0.0
 * @since JDK 1.8
 */
public enum YesNoEnum {

    YES(0,"是"),
    NOT(1,"否");

    
    private final Integer index;
    private final String text;


    private YesNoEnum(Integer index, String text) {
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
