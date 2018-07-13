package com.shuaiys.dao;

import com.shuaiys.dataobject.GameCarDO;
import com.shuaiys.dataobject.GameCarDOExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GameCarDoMapper {
    long countByExample(GameCarDOExample example);

    int deleteByExample(GameCarDOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(GameCarDO record);

    int insertSelective(GameCarDO record);

    List<GameCarDO> selectByExample(GameCarDOExample example);

    GameCarDO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") GameCarDO record, @Param("example") GameCarDOExample example);

    int updateByExample(@Param("record") GameCarDO record, @Param("example") GameCarDOExample example);

    int updateByPrimaryKeySelective(GameCarDO record);

    int updateByPrimaryKey(GameCarDO record);
}