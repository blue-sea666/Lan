package com.lan.mapper;

import com.lan.pojo.Leave;
import com.lan.pojo.LeaveExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LeaveMapper {
    int countByExample(LeaveExample example);

    int deleteByExample(LeaveExample example);

    int deleteByPrimaryKey(Integer leaveId);

    int insert(Leave record);

    int insertSelective(Leave record);

    List<Leave> selectByExampleWithBLOBs(LeaveExample example);

    List<Leave> selectByExample(LeaveExample example);

    Leave selectByPrimaryKey(Integer leaveId);

    int updateByExampleSelective(@Param("record") Leave record, @Param("example") LeaveExample example);

    int updateByExampleWithBLOBs(@Param("record") Leave record, @Param("example") LeaveExample example);

    int updateByExample(@Param("record") Leave record, @Param("example") LeaveExample example);

    int updateByPrimaryKeySelective(Leave record);

    int updateByPrimaryKeyWithBLOBs(Leave record);

    int updateByPrimaryKey(Leave record);
}