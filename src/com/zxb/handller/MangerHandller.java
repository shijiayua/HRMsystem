package com.zxb.handller;

import com.alibaba.fastjson.JSON;
import com.zxb.entity.DeliverRecord;
import com.zxb.entity.Department;
import com.zxb.entity.Job;
import com.zxb.entity.Resume;
import com.zxb.service.DeliverRecordService;
import com.zxb.service.DepartmentService;
import com.zxb.service.JobService;
import com.zxb.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Administrator on 2018/10/17.
 */
@RequestMapping("manger")
@Controller
public class MangerHandller {
    @Autowired
    private DeliverRecordService deliverRecordService;
    @Autowired
    private ResumeService resumeService;
    @Autowired
    private JobService jobService;
    @Autowired
    private DepartmentService departmentService;
    /**
     * 应聘管理
     */
    @RequestMapping("inviteManger")
    public String inviteManger(Model model){
        List<DeliverRecord> deliverRecords =deliverRecordService.queryAll();
        model.addAttribute("delRecords",deliverRecords);
        return "inviteManger";
    }
    /**
     * 查看简历
     */
    @RequestMapping("consult")
    public String consult(Model model,String name){
        Resume resume=resumeService.queryByName(name);
        model.addAttribute("resume",resume);
        return "consult";
    }
    /**
     * 部门职位管理，先查看所有的部门，然后二级联动找到职位
     * @return
     */
    @RequestMapping("deptManger")
    public String deptManger(Model model){
        List<Department> departmentList = departmentService.queryALL();
//        List<Job> jobList =jobService.queryAll();
       model.addAttribute("deplist",departmentList);
        return "deptManger";
    }

    /**
     * ajax获取
     * @param id
     * @return
     */
    @RequestMapping(value = "checkjob",produces={"text/html;charset=UTF-8;","application/json;"})
    @ResponseBody
    public String checkjob(int id){
        List<Job> jobList=jobService.queryById(id);
        String string = JSON.toJSONString(jobList);
        return string;
    }
    @RequestMapping("addmanger")
    public String addmanger(String dept_name,String job_name){
        departmentService.add(new Department(-1,dept_name));
        Department department = departmentService.queryById(dept_name);
        jobService.add(new Job(job_name,department));
        return "forward:deptManger";
    }
}
