package com.zxb.handller;

import com.zxb.entity.DeliverRecord;
import com.zxb.entity.Resume;
import com.zxb.service.DeliverRecordService;
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
@Controller("manger")
public class MangerHandller {
    @Autowired
    private DeliverRecordService deliverRecordService;
    @Autowired
    private ResumeService resumeService;
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

}
