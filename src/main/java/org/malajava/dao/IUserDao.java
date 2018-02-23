package org.malajava.dao;

import org.malajava.entity.BaseMembersModel;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public interface IUserDao extends IBaseDao {
    /**
     * 检查用户名是否存在
     *
     * @param userName
     * @return
     */
    public BaseMembersModel checkUserName(String userName);

    public int save(Map<String,String> map);
}
