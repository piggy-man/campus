package com.imooc.campus.dao;

import com.imooc.campus.entity.Area;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AreaDao extends JpaRepository<Area,Integer>{

    Area findAreaByAreaId(Integer Id);

}
