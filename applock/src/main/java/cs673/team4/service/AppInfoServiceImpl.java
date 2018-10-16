package cs673.team4.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cs673.team4.mapper.AppInfoMapper;
import cs673.team4.pojo.AppInfo;

@Service
public class AppInfoServiceImpl implements AppInfoService{
	
	private Map<String, Object> map = null;
	private List<AppInfo> list = null;

	@Autowired
	private AppInfoMapper appInfoMapper;

	@Override
	public AppInfo selectByPrimaryKey(Integer appId) {
		return appInfoMapper.selectByPrimaryKey(appId);
	}

	@Override
	public void insert(AppInfo appInfo) {
		appInfoMapper.insert(appInfo);
	}

	@Override
	public Map<String, Object> selectAll() {
		map =new HashMap<String, Object>();
		list = appInfoMapper.selectAll();
		map.put("list", list);
		map.put("error", 0);
		return map;
	}

	@Override
	public int updateByPrimaryKey(AppInfo appInfo) {
		appInfoMapper.updateByPrimaryKey(appInfo);
		return 0;
	}

	@Override
	public Map<String, Object> deleteByPrimaryKey(Integer appId) {
		map = new HashMap<String, Object>();
		AppInfo appInfo = appInfoMapper.selectByPrimaryKey(appId);
		if(appInfo!=null) {
			appInfoMapper.deleteByPrimaryKey(appId);
			map.put("error", 0);
		}else {
			map.put("error", 1);
		}
		return map;
	}

}
