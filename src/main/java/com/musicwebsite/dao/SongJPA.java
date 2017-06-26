package com.musicwebsite.dao;

import com.musicwebsite.domain.SongEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

/**
 * Created by KarrySue on 2017/6/22.
 */
public interface SongJPA extends
        JpaRepository<SongEntity, Long>,
        JpaSpecificationExecutor<SongEntity>,
        Serializable {
}
