package com.csdj101.service;

import com.csdj101.pojo.TUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserService {

    public List<TUser> findTUserService(String username);

    public int addTUserService(TUser objTUser);

    public int updTUserService(TUser objTUser);

    public TUser findTUserIdService(int id);

    public int delTUserService(int id);
}
