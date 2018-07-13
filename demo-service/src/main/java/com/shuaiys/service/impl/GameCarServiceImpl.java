package com.shuaiys.service.impl;

import com.shuaiys.dao.GameCarDoMapper;
import com.shuaiys.dataobject.GameCarDO;
import com.shuaiys.dataobject.GameCarDOExample;
import com.shuaiys.entity.GameCarEntity;
import com.shuaiys.service.GameCarService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author shuaiys
 * @Package ${package_name}
 * @Description:
 * @date 2018/6/21  15:33
 */
@Service
public class GameCarServiceImpl implements GameCarService {

    @Resource
    private GameCarDoMapper carDoMapper;

    @Override
    public List<GameCarEntity> getCarInfo(Integer number) {
        GameCarDOExample example = new GameCarDOExample();
        example.createCriteria().andIsDeleteEqualTo(0).andNumberEqualTo(number);
        List<GameCarDO> poList = carDoMapper.selectByExample(example);
        List<GameCarEntity> ens = new ArrayList<>();
        for (GameCarDO p : poList) {
            ens.add(this.do2entity(p));
        }
        return ens;
    }

    private GameCarEntity do2entity(GameCarDO p) {
        GameCarEntity entity = new GameCarEntity();
        BeanUtils.copyProperties(p, entity);
        return entity;
    }

    @Override
    public GameCarEntity getById(Long id) {
        GameCarDO p = carDoMapper.selectByPrimaryKey(id);
        return this.do2entity(p);
    }

    @Override
    public List<GameCarEntity> getCarList() {
        GameCarDOExample example = new GameCarDOExample();
        example.createCriteria().andIsDeleteEqualTo(0).andStatusEqualTo(1);
        List<GameCarDO> poList = carDoMapper.selectByExample(example);
        List<GameCarEntity> ens = new ArrayList<>();
        for (GameCarDO p : poList) {
            ens.add(this.do2entity(p));
        }
        return ens;
    }
}
