package org.malajava.dao;

import java.util.List;

public interface IBaseDao<T> {

    //执行增加的方法
    public int save(T t);

    //执行删除的方法
    public int delete(int id);

    //执行修改的方法
    public int update(T t);


    //执行查看的方法
    public List<T> view();

}
