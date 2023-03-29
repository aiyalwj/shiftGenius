package com.lwj.schedule.controller;

import com.lwj.schedule.dto.RespBean;
import com.lwj.schedule.service.EmployeeService;
import com.lwj.schedule.utils.CORSConfig;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@RestController
@Slf4j
@Api(tags = "管理者登录")
@RequestMapping("/Verification")
public class LoginController {
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private CORSConfig corsConfig;


    @ApiOperation(value="用户登录")
    @GetMapping("/Login")
    public RespBean Login(@RequestParam("Employee_id") String Employee_id, @RequestParam("Employee_pwd") String Employee_pwd){
        corsConfig.addCorsMappings(new CorsRegistry());
        return employeeService.Login(Employee_id, Employee_pwd);
    }

}
