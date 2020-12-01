package com.csdj101.client;

import com.csdj101.pojo.TUser;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TUserClientFeignHystrix implements TUserClientFeign{


    @Override
    public List<TUser> findTUserServiceFeign(String username) {
        List<TUser> list=new ArrayList<>();
        TUser objTUser=new TUser();
        objTUser.setUsername("查询数据服务暂时不可用");
        list.add(objTUser);
        return list;
    }

    @Override
    public int addTUserServiceFeign(TUser objTUser) {
        return -1;
    }

    @Override
    public int updTUserServiceFeign(TUser objTUser) {
        return -1;
    }

    @Override
    public TUser findTUserIdServiceFeign(int id) {
        TUser objTUser=new TUser();
        objTUser.setUsername("查询一条数据服务暂时不可用");
        return objTUser;
    }

    @Override
    public int delTUserServiceFeign(int id) {
        return -1;
    }
}
