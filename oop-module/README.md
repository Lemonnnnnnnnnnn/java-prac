###	打包过程：
1.	新建module-info.java文件，申明依赖的所有包，相当于package.json
2.	通过javac编译java源文件
3.	通过jar --create命令把编译后的文件打包成jar包（compile，可直接运行）
4.	通过jmod create命令把jar包转换成模块（不带依赖包，不可直接运行）
5.	通过jlink命令将jmod转换为jre（在命令中添加依赖包）
6.	得到最终运行文件库jre（带依赖包，可以直接运行，不需要java环境）
