package com.zxb.handller;

import com.zxb.entitys.Resume;
import com.zxb.entitys.User;
import com.zxb.service.ResumeService;
import com.zxb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2018/10/11.
 */
@Controller
public class UserHandller {
    @Autowired
    private UserService userService;
    @Autowired
    private ResumeService resumeService;
    @RequestMapping("add")
    public String add(User user){
        userService.add(user);
        return "login";
    }
    @RequestMapping("input")
    @ResponseBody
    public String input(String name) {
        User user =userService.queryByName(name);
        if(user!=null){
            return "111";
        }
        return "123";
    }
    @RequestMapping("login")
    public String login(Model model,User user){
        User user1=userService.queryByNameAndPass(user);
        model.addAttribute("user",user1);
        return "show";
    }
    @RequestMapping("addresume")
    public String addresume(Model model){

        return "addResume";
    }
    @RequestMapping("save")
    public String save(Resume resume){
        resumeService.save(resume);
        return "forward:addresume";
    }
}
