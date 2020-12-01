package com.csdj101.controller;


import com.csdj101.pojo.TUser;
import com.csdj101.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/uc")
public class UserController {
    //http://localhost:8001/uc/findTUserController

    @Resource
    private UserService objUserService;

    @RequestMapping("/findTUserController")
    @ResponseBody
    public Object findTUserController(@RequestParam(value = "username",
            required = false)String username){

        List<TUser> list=objUserService.findTUserService(username);
        System.out.print("数据微服务list大小："+list.size());
        return list;
    }

    @RequestMapping("/addTUserController")
    @ResponseBody
    public Object addTUserController(@RequestBody TUser objTUser){
        System.out.println("数据服务 姓名:"+objTUser.getUsername());
        return objUserService.addTUserService(objTUser);
    }

    @RequestMapping("/updTUserController")
    @ResponseBody
    public Object updTUserController(@RequestBody TUser objTUser){
        return objUserService.updTUserService(objTUser);
    }

    @RequestMapping("/findTUserIdController")
    @ResponseBody
    public Object findTUserIdController(@RequestParam(value = "id",
            required = false)int id){
        return objUserService.findTUserIdService(id);
    }
    @RequestMapping("/delTUserController")
    @ResponseBody
    public Object delTUserController(@RequestParam(value = "id",
            required = false)int id){
        return objUserService.delTUserService(id);
    }
}
