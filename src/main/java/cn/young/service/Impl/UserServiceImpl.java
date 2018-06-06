package cn.young.service.Impl;

import cn.young.entity.User;
import cn.young.service.AbstractService;
import cn.young.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @Auther: Young
 * @Date: 2018-06-06 21:07
 * @Description:
 */
@Service
public class UserServiceImpl extends AbstractService implements UserService {

    @Override
    public User selectUserByName(String userName) {
        return userMapper.selectUserByName(userName);
    }

    @Override
    public void save(String userName, Integer age, Integer customerid) {
        User user = new User();
        user.setAge(age);
        user.setCustomerid(customerid);
        user.setUsername(userName);
        userMapper.save(user);
    }

    @Override
    public boolean updateUser(String userName, Integer age, Integer id) {
        User user = findUserById(id);
        return userMapper.updateUser(user);
    }

    @Override
    public boolean deleteUser(int id) {
        return userMapper.deleteUser(id);
    }

    @Override
    public User findUserById(int id) {
        return userMapper.findUserById(id);
    }
}
