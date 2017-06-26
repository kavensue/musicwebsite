package com.musicwebsite.service;

import com.musicwebsite.dao.AdminDAO;
import com.musicwebsite.domain.AdminEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by KarrySue on 2017/6/22.
 */
@Service
public class AdminService {
    @Autowired
    private AdminDAO adminDAO;

    public Boolean adminLogin(String adminName, String adminPassword)
    {
        List<AdminEntity> adminEntities=adminDAO.find(adminName, adminPassword);
        if(adminEntities.size()==0)
            return false;
        else
            return true;
    }

}
