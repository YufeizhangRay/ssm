package cs673.team4.mapper;

import java.util.List;

import cs673.team4.pojo.AppInfo;

public interface AppInfoMapper {
    int deleteByPrimaryKey(Integer appId);

    int insert(AppInfo record);

    int insertSelective(AppInfo record);

    AppInfo selectByPrimaryKey(Integer appId);
    
    List<AppInfo> selectAll();

    int updateByPrimaryKeySelective(AppInfo record);

    int updateByPrimaryKey(AppInfo record);
}