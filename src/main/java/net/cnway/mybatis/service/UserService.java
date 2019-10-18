package net.cnway.mybatis.service;

import net.cnway.mybatis.dao.UserDao;
import net.cnway.mybatis.domian.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author john.wang
 * @create 2019-10-16
 */
@Service
public class UserService {
    @Autowired
    public UserDao userDao;

    public User getUserById(Integer id){

        return  userDao.getUserById(id);
    }

    public List<User>getUsers(){

        return  userDao.getUsers();
    }
}
