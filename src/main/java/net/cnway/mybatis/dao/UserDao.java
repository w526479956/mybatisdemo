package net.cnway.mybatis.dao;

import net.cnway.mybatis.domian.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author john.wang
 * @create 2019-10-16
 */
@Repository
public interface UserDao {
    /**
     * 通过用户id查询用户
     * @param id
     * @return
     */
    public User getUserById(Integer id);

    /**
     * 查询所有用户信息
     * @return
     */
    public List<User> getUsers();
}
