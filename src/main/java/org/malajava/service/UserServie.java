package org.malajava.service;


import org.malajava.dao.IUserDao;
import org.malajava.entity.BaseMembersModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service
public class UserServie {
    @Autowired
    private IUserDao dao;

    public boolean checkUserName(String username) {
        boolean flag = false;
        BaseMembersModel membersModel = dao.checkUserName(username);
        //判断是否有该用户
        if (membersModel != null && membersModel.getMemberName() != null) {
            //证明该用户存在
            flag = true;
        }
        return flag;
    }

    /**
     * 查询用户
     *
     * @return
     */
    public BaseMembersModel getUser(String username) {
        return dao.checkUserName(username);
    }

    /*添加用户*/
    public int save(Map<String,String> map) {
        return dao.save(map);
    }

    public IUserDao getDao() {
        return dao;
    }

    public void setDao(IUserDao dao) {
        this.dao = dao;
    }
}
