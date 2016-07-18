# FixTest
参考http://blog.csdn.net/qxs965266509/article/details/50390325

######FixBugManage
######MyApplication
######在APP合适位置添加从服务器加载patch方法(本例子中是将patch文件提前放在SD卡中,模拟服务器)
######编写需要更改的类及代码,然后进行修复，build工程(工具也会自动build)，把java编译成class文件。
######在app/build/intermediates/classes/debug/com/fix/testing中找到MainActivity$1.class,MainActivity$2.class,MainActivity$.class
将这3个.class放到新建的文件夹fixbugdex下(在fixbugdex下有对应的文件夹依次com/fix/testing)
######使用命令行进入到fixbugdex下
然后执行命令 jar cvf fixbug.jar com/* 
######成功后生成fixbug.jar文件
######使用DX工具,位于sdk/build-tools/24.0.0 ,直接拖动到Terminal,进行命令行操作
######使用命令dx --dex --output patch.jar fixbug.jar
######使用命令行将patch.jar adb push /Users/cheyanxu/Desktop/patch.jar /mnt/sdcard/
                      


  
