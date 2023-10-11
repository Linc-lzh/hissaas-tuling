package com.roy.mapper;

import com.roy.entity.Area;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AreaMapper {
    List<Area> findAllArea(Area area);
    int deleteArea(Integer areaId);
    int addArea(Area area);
    int count(Area area);
}
