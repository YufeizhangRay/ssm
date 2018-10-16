package cs673.team4.pojo;

public class AppInfo {
    private Integer appId;

    private String appName;

    public AppInfo(Integer appId, String appName) {
        this.appId = appId;
        this.appName = appName;
    }

    public AppInfo() {
        super();
    }

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName == null ? null : appName.trim();
    }
}