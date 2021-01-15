package cn.itcast.service;

import cn.itcast.domain.PageBean;
import cn.itcast.domain.User;

import java.util.List;
import java.util.Map;

/**
 * 用户管理的业务接口
 */
public interface UserService {
    /**
     * 查询所有用户信息
     *
     * @return
     */
    public List<User> findAll();

    /**
     * 用户登录
     *
     * @param user
     * @return
     */
    public User login(User user);


    /**
     * 添加用户
     *
     * @param user
     */
    public void addUser(User user);


    public void delUser(String id);



    User findUserById(String id);

    void updateUser(User user);

    void delSelectedUser(String[] ids);

    /**
     * 分页条件查询
     * @param currentPage
     * @param rows
     * @param condition
     * @return
     */
    PageBean<User> findUserByPage(String currentPage, String rows, Map<String, String[]> condition);
}
