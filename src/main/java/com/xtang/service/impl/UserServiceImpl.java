package com.xtang.service.impl;

import com.xtang.dao.UserInfoMapper;
import com.xtang.dao.UsersMapper;
import com.xtang.pojo.Users;
import com.xtang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: xtang-springboot-starter
 * @Date: 2019/6/30 21:03
 * @Author: xTang
 * @Description:
 */
@Service("iUserService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UsersMapper usersMapper;

    @Autowired
    private UserInfoMapper userInfoMapper;

    /**
     * 保存用户
     *
     * @param users
     * @throws Exception
     */
    @Override
    public void saveUser(Users users) throws Exception {
        usersMapper.insert(users);
    }

    /**
     * 更新用户
     *
     * @param users
     */
    @Override
    public void updateUser(Users users) {
        usersMapper.updateByPrimaryKeySelective(users);
    }

    /**
     * 删除用户
     *
     * @param userId
     * @return
     */
    @Override
    public int deleteUser(String userId) {
        int result = usersMapper.deleteByPrimaryKey(userId);
        return result;
    }

    /**
     * 查询用户
     *
     * @param userId
     * @return
     */
    @Override
    public Users queryUserById(String userId) {
        Users newUser = usersMapper.selectByPrimaryKey(userId);
        return newUser;
    }

    /**
     * 查询用户列表
     *
     * @param users
     * @return
     */
    @Override
    public List<Users> queryUserList(Users users) {
        List<Users> usersArrayList = usersMapper.selectAll();
        return usersArrayList;
    }
}
