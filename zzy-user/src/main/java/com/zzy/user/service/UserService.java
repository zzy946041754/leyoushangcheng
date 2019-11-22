package com.zzy.user.service;

import com.zzy.user.mapper.UserMapper;
import com.zzy.user.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Description TODO
 * @Author zzy
 * @Date 2019/11/22 14:41
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User queryUserById(Long id){
        return this.userMapper.selectByPrimaryKey(id);
    }
    @Transactional()
    public void deleteUserById(Long id){
        this.userMapper.deleteByPrimaryKey(id);
    }
}
