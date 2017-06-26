package com.musicwebsite.dao;

import com.musicwebsite.domain.AdminEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.io.Serializable;
import java.util.List;

/**
 * Created by KarrySue on 2017/6/22.
 */
public interface AdminJPA extends
        JpaRepository<AdminEntity, Long>,
        JpaSpecificationExecutor<AdminEntity>,
        Serializable
{
    //自定义条件查找名称和密码匹配的管理员
    @Query(value = "select * from admin where admin_name=?1,admin_password=?2",nativeQuery = true)
    public List<AdminEntity> findAdmin(String adminName, String adminPassword);
}