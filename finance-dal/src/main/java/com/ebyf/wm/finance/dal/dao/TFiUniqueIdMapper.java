package com.ebyf.wm.finance.dal.dao;

import com.ebyf.wm.finance.dal.mapper.MyMapper;
import com.ebyf.wm.finance.dal.model.TFiUniqueId;
import com.ebyf.wm.finance.dal.model.TFiUniqueIdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TFiUniqueIdMapper extends MyMapper<TFiUniqueId> {
    long countByExample(TFiUniqueIdExample example);

    int deleteByExample(TFiUniqueIdExample example);

    List<TFiUniqueId> selectByExample(TFiUniqueIdExample example);

    int updateByExampleSelective(@Param("record") TFiUniqueId record, @Param("example") TFiUniqueIdExample example);

    int updateByExample(@Param("record") TFiUniqueId record, @Param("example") TFiUniqueIdExample example);
}