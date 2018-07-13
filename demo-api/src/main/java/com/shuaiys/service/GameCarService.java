package com.shuaiys.service;

import com.shuaiys.entity.GameCarEntity;

import java.util.List;

/**
 * @author shuaiys
 * @Package ${package_name}
 * @Description:
 * @date 2018/6/21  15:32
 */
public interface GameCarService {

    /**
     * 根据编号获取车辆信息
     * @param number
     * @return
     */
    public List<GameCarEntity> getCarInfo(Integer number);

    public GameCarEntity getById(Long id);

    /**
     * 查询所有的车
     * @return
     */
    public List<GameCarEntity> getCarList();

}
