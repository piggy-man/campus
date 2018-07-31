package com.imooc.campus.service.impl;

import com.imooc.campus.dao.AreaDao;
import com.imooc.campus.entity.Area;
import com.imooc.campus.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Id;
import java.util.List;

@Service
public class AreaServiceImpl implements AreaService{

    @Autowired
    private AreaDao areaDao;

    @Override
    public List<Area> getAreaList() {
        return areaDao.findAll();
    }

    }

