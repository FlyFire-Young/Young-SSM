package cn.young.dao;

import cn.young.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @Auther: Young
 * @Date: 2018-06-06 20:39
 * @Description:
 */
@Mapper
@Repository
public interface UserMapper {

    User selectUserByName(String name);

    void save(User user);

    boolean updateUser(User user);

    boolean deleteUser(int id);

    User findUserById(int id);
}
