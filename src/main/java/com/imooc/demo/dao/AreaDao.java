package com.imooc.demo.dao;

import com.imooc.demo.entity.Area;

import java.util.List;

public interface AreaDao {

    /**
     * 查询区域列表
     * @return
     */
    List<Area> queryArea();

    /**
     * 根据ID查询区域
     * @param areaId
     * @return
     */
    Area queryAreaById(int areaId);

    /**
     * 新增区域信息
     * @param area
     * @return
     */
    int insertArea(Area area);

    /**
     * 更新区域
     * @param area
     * @return
     */
    int updateArea(Area area);

    /**
     * 删除区域
     * @param areaId
     * @return
     */
    int deleteArea(int areaId);
}
