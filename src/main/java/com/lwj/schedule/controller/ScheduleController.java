package com.lwj.schedule.controller;

import com.lwj.schedule.dto.RespBean;
import com.lwj.schedule.service.EmployeeScheduleService;
import com.lwj.schedule.service.RecordService;
import com.lwj.schedule.utils.ReadExcelFileToList;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

@RestController
@Slf4j
@Api(tags = "排班管理")
@RequestMapping("/Schedule_Management")
public class ScheduleController {
//    @Autowired
//    private RecordService recordService;
    @Autowired
    private EmployeeScheduleService employeeScheduleService;

    @ApiOperation(value = "一键排班")
    @GetMapping("/Schedule")
//    HSSFWorkbook
    public RespBean Schedule(@RequestParam("passenger_flow") MultipartFile passenger_flow, @RequestParam("shop_id") String shop_id, @RequestParam("start_date") Date start_date) throws ParseException, IOException {
        //将MultipartFile转化为HSSFWorkbook
        HSSFWorkbook workbook = new HSSFWorkbook(new POIFSFileSystem(passenger_flow.getInputStream()));
        ArrayList<ArrayList<Double>> PreModel = (new ReadExcelFileToList()).ReadExcel(workbook);
        return employeeScheduleService.Schedule(PreModel, shop_id, start_date);
    }
}