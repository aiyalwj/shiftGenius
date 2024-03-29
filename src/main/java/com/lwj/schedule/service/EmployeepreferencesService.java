package com.lwj.schedule.service;

import com.lwj.schedule.dto.RespBean;
import com.lwj.schedule.entity.Employeepreferences;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author wz111
* @description 针对表【EmployeePreferences(员工偏好)】的数据库操作Service
* @createDate 2023-03-01 13:38:26
*/
public interface EmployeepreferencesService extends IService<Employeepreferences> {

    RespBean SearchById(String employee_id);

    RespBean SearchByEPType(String employeePreferences_type);

    RespBean CreateEP(String employeePreferences_type, String employee_id, String employeePreferences_value);

    RespBean ModifyEP(String employeePreferences_type, String employee_id, String employeePreferences_value);

    RespBean DeleteEP(String employeePreferences_type, String employee_id);
}
