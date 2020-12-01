package com.csdj101.client;

import com.csdj101.pojo.TUser;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "PROJECT-DATA-SERVICE",fallback = TUserClientFeignHystrix.class)
public interface TUserClientFeign {

    @PostMapping("/uc/findTUserController")  //注册数据微服务地址 控制器
    public List<TUser> findTUserServiceFeign(@RequestParam(value = "username",required = false)String username);

    @PostMapping("/uc/addTUserController")  //注册数据微服务地址 控制器
    public int addTUserServiceFeign(TUser objTUser);

    @PostMapping("/uc/updTUserController")  //注册数据微服务地址 控制器
    public int updTUserServiceFeign(TUser objTUser);

    @PostMapping("/uc/findTUserIdController")  //注册数据微服务地址 控制器
    public TUser findTUserIdServiceFeign(@RequestParam(value = "id",required = false)int id);

    @PostMapping("/uc/delTUserController")  //注册数据微服务地址 控制器
    public int delTUserServiceFeign(@RequestParam(value = "id",required = false)int id);
}
