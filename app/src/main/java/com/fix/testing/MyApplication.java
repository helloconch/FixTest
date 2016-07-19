package com.fix.testing;

import android.app.Application;
import android.util.Log;

/**
 * Created by cheyanxu on 16/7/18.
 */
public class MyApplication extends Application {

    private final String TAG = MyApplication.class.getSimpleName();

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
            Log.i(TAG, "addPatch Complete");
        } catch (Exception e) {
            e.printStackTrace();
            Log.i(TAG, "" + e.toString());
        }
    }

    /**
     * 清除所有补丁文件接口
     */
    public void removeAllPatch() {
        this.fixBugManage.removeAllPatch();
    }
}
