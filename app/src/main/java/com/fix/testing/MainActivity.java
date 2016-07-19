package com.fix.testing;

import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import java.io.File;

public class MainActivity extends AppCompatActivity {
    private final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //模拟从服务器加载patch文件,默认已存在
                MyApplication myApplication = (MyApplication) getApplication();
                File patch = new File(Environment.getExternalStorageDirectory(), "patch.jar");
                if (patch.exists()) {
                    myApplication.addPatch(patch.getAbsolutePath());
                } else {
                    Toast.makeText(MainActivity.this, "未加载成功patch.jar",
                            Toast.LENGTH_SHORT).show();
                }

            }
        });

        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //修复此位置的bug
                Toast.makeText(MainActivity.this, "..bug...",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
