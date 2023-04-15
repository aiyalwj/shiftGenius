package com.lwj.schedule.controller;

import com.lwj.schedule.dto.RespBean;
import com.lwj.schedule.service.EmployeeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@Api(tags = "员工管理")
@RequestMapping("/Employee_Management")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @ApiOperation(value = "列出所有员工")
    @GetMapping()
    public RespBean listAllEmployee(){
        return employeeService.listAll();
    }

    @ApiOperation(value = "增加员工")
    @PostMapping("/AddEmployee")
    public RespBean addEmployee(@RequestParam("name") String name,@RequestParam("mail") String mail,@RequestParam("position") String position,@RequestParam("shop") String shop,@RequestParam("pwd") String pwd){
        return employeeService.addEmployee(name,mail,position,shop,pwd);
    }

    @ApiOperation(value = "员工查询（根据id）")
    @PostMapping("/SearchById")
    public RespBean searchEmployeeById(@RequestBody String id){
        return employeeService.searchById(id);
    }

    @ApiOperation(value = "员工查询（根据name）")
    @PostMapping("/SearchByName")
    public RespBean searchEmployeeByName(@RequestBody String name){
        return employeeService.searchByName(name);
    }

    @ApiOperation(value = "修改员工")
    @PostMapping("/ModifyEmployee")
    public RespBean modifyEmployee(@RequestParam("id") String id, @RequestParam("name") String name, @RequestParam("mail") String mail, @RequestParam("position") String position, @RequestParam("shop") String shop, @RequestParam("pwd") String pwd){
        return employeeService.modifyById(id, name, mail, position, shop, pwd);
    }

    @ApiOperation(value = "删除员工")
    @PostMapping("/DeleteEmployee")
    public RespBean deleteEmployee(@RequestParam("id") String id){
        return employeeService.deleteById(id);
    }

    @ApiOperation(value = "列出某店的员工")
    @GetMapping("/ListSameshopep")
    public RespBean listEmployeeBySameshop(@RequestParam("shop") String shop){
        return employeeService.listEmployeeBySameshop(shop);
    }
}
