package com.fix.testing;

import android.app.Application;

/**
 * Created by cheyanxu on 16/7/18.
 */
public class MyApplication extends Application {

    public FixBugManage fixBugManage;

    @Override
    public void onCreate() {
        super.onCreate();
        this.fixBugManage = new FixBugManage(this);
        this.fixBugManage.init("1.0");
    }

    /**
     * 添加新补丁接口
     *
     * @param path
     */
    public void addPatch(String path) {
        try {
            this.fixBugManage.addPatch(path);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 清除所有补丁文件接口
     */
    public void removeAllPatch() {
        this.fixBugManage.removeAllPatch();
    }
}
