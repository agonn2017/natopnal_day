package com.csdj101.controller;

import com.csdj101.pojo.TUser;
import com.csdj101.service.TUsetFeignService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("tfc")
public class TUserFeignController {
    //http://localhost:8012/tfc/findPage
    //http://localhost:8040/api-view/tfc/findPage
    @Resource
    private TUsetFeignService objTUsetFeignService;

    @RequestMapping("find")
    @ResponseBody
    public Object find(@RequestParam(value="username",required = false) String username){
        System.out.print("username:"+username);
        List<TUser> list=objTUsetFeignService.findFeignTUserService(username);
         System.out.print("View-Feign数据："+list.size());
        return list;
    }

    @RequestMapping("findPage")
    public String findPage(){
        return "find";
    }


    @RequestMapping("/add")
    @ResponseBody
    public Object add(TUser objTUser){

        System.out.println("姓名："+objTUser.getUsername());
        System.out.println("姓名："+objTUser.getPassword());
        System.out.println("姓名："+objTUser.getCreateDate());
        return objTUsetFeignService.addFeignTUserService(objTUser);
    }

    @RequestMapping("addPage") //打开添加页面
    public String addPage(){
        return "add";
    }

    @RequestMapping("/upd")
    @ResponseBody
    public Object upd(TUser objTUser){
        return objTUsetFeignService.updFeignTUserService(objTUser);
    }

    @RequestMapping("updPage") //打开修改页面
    public String updPage(@RequestParam(value = "id", required = false)int id,Model model){
        model.addAttribute("id",id);
        return "upd";
    }

    @RequestMapping("/findId")
    @ResponseBody
    public Object findId(@RequestParam(value = "id",
            required = false)int id){
        return objTUsetFeignService.findFeignTUserIdService(id);
    }
    @RequestMapping("/del")
    @ResponseBody
    public Object del(@RequestParam(value = "id",
            required = false)int id){
        return objTUsetFeignService.delFeignTUserService(id);
    }
}
