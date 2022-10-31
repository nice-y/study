package homework.day01;

import java.io.File;
import java.io.FileFilter;

/**
 * 列出当前目录中所有名字包含s的子项。
 * 
 * 使用匿名内部类和lambda两种写法
 * 
 * 单词记一记:
 * FileFilter   文件过滤器
 * accept       接受
 * 
 * @author Xiloer
 *
 */
public class Test06 {
	public static void main(String[] args) {
		File dir=new File(".");
		File[]files=dir.listFiles(new FileFilter() {
			@Override
			public boolean accept(File file) {
				//判断文件是否包含s
				return file.getName().contains("s");
			}
		});
		for (File file:files) {
			System.out.println(file);
		}
		File dir1=new File(".");
		for (File file:dir1.listFiles(f->f.getName().contains("s"))){
			System.out.println(file);
		}
	}
}
/*
	提示代码:
	需要用到的语句，尝试按照正确顺序将下列代码并放在main方法中完成需求，
	并在注释中标注每句话的作用，
	//【创建一个dir对象，文件位置为当前目录】
	File dir = new File(".");

	//【找到符合条件的文件并加入suns数组中】
	File[] suns = dir.listFiles(new FileFilter() {
		public boolean accept(File file) {

		}
	});

	//【判断是否是目录】
	if(dir.isDirectory()){

	}

	//【输出subs数组下标为i的文件名字】
	System.out.println(subs[i].getName());

	//【返回文件的名字是否包含s】
	return file.getName().contains("s");

	//【遍历数组】
	for(int i=0;i<subs.length;i++){

	}



 */