package com.csdj101.service;

import com.csdj101.pojo.TUser;

import java.util.List;

public interface TUsetFeignService {

    public List<TUser> findFeignTUserService(String username);

    public int addFeignTUserService(TUser objTUser);

    public int updFeignTUserService(TUser objTUser);

    public TUser findFeignTUserIdService(int id);

    public int delFeignTUserService(int id);
}
