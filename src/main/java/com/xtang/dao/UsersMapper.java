package com.xtang.dao;

import com.xtang.pojo.Users;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository(value="usersDao")
public interface UsersMapper {
    int deleteByPrimaryKey(String id);

    int insert(Users record);

    /**
     * 选择性保存数据
     * @param record
     * @return
     */
    int insertSelective(Users record);

    Users selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);

    List<Users> selectAll();
}