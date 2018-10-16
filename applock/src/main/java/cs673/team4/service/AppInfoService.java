package cs673.team4.service;

import java.util.List;
import java.util.Map;

import cs673.team4.pojo.AppInfo;

public interface AppInfoService {

	public AppInfo selectByPrimaryKey(Integer appId);
	
	public void insert(AppInfo appInfo);
	
	public Map<String, Object> selectAll();
	
	int updateByPrimaryKey(AppInfo appInfo);
	
	Map<String,Object> deleteByPrimaryKey(Integer appId);
}
