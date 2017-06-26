package com.musicwebsite.dao;

import com.musicwebsite.domain.AdminEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by KarrySue on 2017/6/22.
 */
@Service
public class AdminDAO {
    @Autowired
    private AdminJPA adminJPA;

    //使用接口的方法查找信息匹配的管理员并返回
    public List<AdminEntity> find(String adminName, String adminPassword){
        List<AdminEntity> adminEntities=adminJPA.findAdmin(adminName,adminPassword);
        return adminEntities;
    }

}
