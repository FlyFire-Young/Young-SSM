package cn.young.service;

import cn.young.entity.User;

/**
 * @Auther: Young
 * @Date: 2018-06-06 21:06
 * @Description:
 */
public interface UserService {

    /**
     * 查询用户
     * @param userName
     * @return
     */
    User selectUserByName(String userName);

    /**
     * 新建用户
     * @param userName
     * @param age
     * @param customerid
     */
    void save(String userName, Integer age, Integer customerid);

    /**
     * 更新用户
     * @param userName
     * @param age
     * @param id
     * @return
     */
    boolean updateUser(String userName, Integer age, Integer id);

    /**
     * 删除用户
     * @param id
     * @return
     */
    boolean deleteUser(int id);

    /**
     * 查询用户
     * @param id
     * @return
     */
    User findUserById(int id);
}
