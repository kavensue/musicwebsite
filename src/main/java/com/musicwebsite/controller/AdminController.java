package com.musicwebsite.controller;

import com.musicwebsite.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by KarrySue on 2017/6/22.
 */
public class AdminController {
    @Autowired
    private AdminService adminService;

    public void login(String adminname, String adminpassword){
        adminService.adminLogin(adminname,adminpassword);
    }
}
