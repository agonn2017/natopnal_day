package com.csdj101.service.impl;

import com.csdj101.client.TUserClientFeign;
import com.csdj101.pojo.TUser;
import com.csdj101.service.TUsetFeignService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class TUsetFeignServiceImpl implements TUsetFeignService {

    @Resource
    private TUserClientFeign objTUserClientFeign;

    @Override
    public List<TUser> findFeignTUserService(String username) {
        return objTUserClientFeign.findTUserServiceFeign(username);
    }

    @Override
    public int addFeignTUserService(TUser objTUser) {
        return objTUserClientFeign.addTUserServiceFeign(objTUser);
    }

    @Override
    public int updFeignTUserService(TUser objTUser) {
        return objTUserClientFeign.updTUserServiceFeign(objTUser);
    }

    @Override
    public TUser findFeignTUserIdService(int id) {
        return objTUserClientFeign.findTUserIdServiceFeign(id);
    }

    @Override
    public int delFeignTUserService(int id) {
        return objTUserClientFeign.delTUserServiceFeign(id);
    }
}
