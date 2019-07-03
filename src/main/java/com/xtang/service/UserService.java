package com.xtang.service;

import com.xtang.pojo.Users;

import java.util.List;

/**
 * @program: xtang-springboot-starter
 * @Date: 2019/6/30 20:56
 * @Author: xTang
 * @Description:
 */
public interface UserService {

    /**
     * 保存用户
     * @param users
     * @throws Exception
     */
    public void saveUser(Users users)throws Exception;

    /**
     * 更新用户
     * @param users
     */
    public void updateUser(Users users);

    /**
     * 删除用户
     * @param userId
     * @return
     */
    public int deleteUser(String userId);

    /**
     * 查询用户
     * @param userId
     * @return
     */
    public Users queryUserById(String userId);

    /**
     * 查询用户列表
     */
    public List<Users> queryUserList(Integer pageNum,Integer pageSize);
}
