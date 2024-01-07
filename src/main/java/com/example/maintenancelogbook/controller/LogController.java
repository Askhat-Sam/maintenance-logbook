package com.example.maintenancelogbook.controller;

import com.example.maintenancelogbook.repository.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/logs")
public class LogController {
    @Autowired
    LogRepository logRepository;

    @RequestMapping("/list")
    public String getLogList(){
        return "log-list";
    }
}
