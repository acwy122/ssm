package com.mashibing.controller;


import com.mashibing.bean.Emp;
import com.mashibing.dao.EmpDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SSMController {

    @Autowired
    EmpDao empDao;

    @RequestMapping("/test")
    public String test(){
        System.out.println("test");
        Emp emp = empDao.selectEmpByEmpno(1);
        System.out.println(emp);
        return "success";
    }

}
