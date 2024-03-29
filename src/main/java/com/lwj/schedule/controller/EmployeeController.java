package com.lwj.schedule.controller;

import com.lwj.schedule.dto.RespBean;
import com.lwj.schedule.entity.Employee;
import com.lwj.schedule.service.EmployeeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@Api(tags = "员工管理")
@RequestMapping("/Employee_Management")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @ApiOperation(value = "列出所有员工")
    @GetMapping
    public RespBean listAllEmployee(){
        return employeeService.listAll();
    }

    @ApiOperation(value = "员工查询（根据id）")
    @RequestMapping("/SerchById")
    public RespBean searchEmployeeById(@RequestParam("id") String id){
        return employeeService.searchById(id);
    }

    @ApiOperation(value = "员工查询（根据name）")
    @RequestMapping("/SerchByName")
    public RespBean searchEmployeeByName(@RequestParam("name") String name){
        return employeeService.searchByName(name);
    }

    @ApiOperation(value = "修改员工")
    @RequestMapping("/ModifyEmployee")
    public RespBean modifyEmployee(@RequestParam("id") String id, @RequestParam("name") String name, @RequestParam("mail") String mail, @RequestParam("position") String position, @RequestParam("shop") String shop, @RequestParam("pwd") String pwd){
        return employeeService.modifyById(id, name, mail, position, shop, pwd);
    }

    @ApiOperation(value = "删除员工")
    @RequestMapping("/DeleteEmployee")
    public RespBean deleteEmployee(@RequestParam("id") String id){
        return employeeService.deleteById(id);
    }
}
