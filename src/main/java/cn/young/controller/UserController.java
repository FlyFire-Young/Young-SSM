package cn.young.controller;

import cn.young.entity.User;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @Auther: Young
 * @Date: 2018-06-06 20:46
 * @Description:
 */
@RestController
@RequestMapping("/y/user")
public class UserController extends AbstractController {

    /**
     * 查询用户
     *
     * @param request
     * @return
     */
    @RequestMapping(value = "/cs")
    public User cs(HttpServletRequest request) {
        String username = ServletRequestUtils.getStringParameter(request, "username", null);
        //调用dao层
        User user = userService.selectUserByName(username);
        return user;
    }

    /**
     * 保存用户
     *
     * @param request
     * @return
     */
    @RequestMapping(value = "/create")
    public void create(HttpServletRequest request) {
        String username = ServletRequestUtils.getStringParameter(request, "username", null);
        Integer age = ServletRequestUtils.getIntParameter(request, "age", 0);
        Integer customerId = ServletRequestUtils.getIntParameter(request, "customerId", 0);
        userService.save(username, age, customerId);
    }
}
