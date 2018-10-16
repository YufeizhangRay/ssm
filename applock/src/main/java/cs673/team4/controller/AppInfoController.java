package cs673.team4.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cs673.team4.pojo.AppInfo;
import cs673.team4.service.AppInfoService;

@Controller
@RequestMapping("appInfoController")
public class AppInfoController {

	@Autowired
	private AppInfoService appInfoService;
	
	
	@RequestMapping(value="selectAll",method= {RequestMethod.GET,RequestMethod.POST})
	@ResponseBody
	public Map<String, Object> selectAll(){
		return appInfoService.selectAll();
	}
	
	@RequestMapping(value="selectByPrimaryKey",method= {RequestMethod.GET,RequestMethod.POST})
	@ResponseBody
	public AppInfo selectByPrimaryKey(@RequestParam(value="appId",required=true)int appId) {
		AppInfo appInfo = appInfoService.selectByPrimaryKey(appId);
		return appInfo;
	}
	
	@RequestMapping(value="insert",method= {RequestMethod.GET,RequestMethod.POST})
	public String insert(@RequestParam(value="appId",required=true)Integer appId,
			@RequestParam(value="appName",required=true)String appName) {
		AppInfo appInfo = new AppInfo();
		appInfo.setAppId(appId);
		appInfo.setAppName(appName);
		appInfoService.insert(appInfo);
		return "success";
	}
	
	@RequestMapping(value="updateByPrimaryKey",method= {RequestMethod.GET,RequestMethod.POST})
	public int updateByPrimaryKey(@RequestParam(value="appId",required=true)Integer appId) {
		AppInfo appInfo = new AppInfo();
		appInfoService.updateByPrimaryKey(appInfo);
		return 0 ;
	}
	
	@RequestMapping(value="deleteByPrimaryKey",method= {RequestMethod.GET,RequestMethod.POST})
	@ResponseBody
	public Map<String, Object> deleteByPrimaryKey(@RequestParam(value="appId",required=true)Integer appId) {
		return appInfoService.deleteByPrimaryKey(appId);
	}
}
