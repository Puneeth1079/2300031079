package com.base.controller;


import com.base.service.SchedulerService;
import org.springframework.web.bind.annotation.*;

@RestController
public class SchedulerController {

    private final SchedulerService schedulerService;

    public SchedulerController(SchedulerService schedulerService) {
        this.schedulerService = schedulerService;
    }
    
    @GetMapping("/base")
    public static String base()
    {
    	return "this is base case controller paths are working";
    }
    @GetMapping("/schedule")
    public Object schedule() {
        return schedulerService.createSchedule();
    }
}