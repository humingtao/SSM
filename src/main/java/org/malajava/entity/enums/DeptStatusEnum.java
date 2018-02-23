package org.malajava.entity.enums;


/**
 * 部门状态
 * ClassName: DeptStatusEnum <br/> 
 * Function:  使用状态 （0：正常；1禁用）<br/> 
 * date: 2017年2月18日 下午5:49:57 <br/> 
 * 
 * @author Administrator 
 * @version  1.0.0
 * @since JDK 1.8
 */
public enum DeptStatusEnum {

    NORMAl(0, "正常"),
    DISABLE(1, "禁用");

	private final Integer index;
    private final String text;


    private DeptStatusEnum(Integer index, String text) {
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
