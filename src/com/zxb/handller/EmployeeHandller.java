package com.zxb.handller;

import com.zxb.entity.Employee;
import com.zxb.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2018/10/18.
 */
@Controller("employee")
public class EmployeeHandller {
    @Autowired
    private EmployeeService employeeService;
    @RequestMapping("persondetails")
    public String persondetails(Model model,String name){
        Employee employee =employeeService.queryByName(name);
        model.addAttribute("employee",employee);
        return "persondetails";
}
}
