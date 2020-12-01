package com.csdj101.service.impl;

import com.csdj101.dao.UserMapper;
import com.csdj101.pojo.TUser;
import com.csdj101.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper objUserMapper;

    @Override
    public List<TUser> findTUserService(String username) {
        return objUserMapper.findTUser(username);
    }

    @Override
    public int addTUserService(TUser objTUser) {
        return objUserMapper.addTUser(objTUser);
    }

    @Override
    public int updTUserService(TUser objTUser) {
        return objUserMapper.updTUser(objTUser);
    }

    @Override
    public TUser findTUserIdService(int id) {
        return objUserMapper.findTUserId(id);
    }

    @Override
    public int delTUserService(int id) {
        return objUserMapper.delTUser(id);
    }
}
