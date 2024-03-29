package homework.day01;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * 程序启动后，要求用户输入一个文件名，如果文件存在则提示
 * 并要求用户更换，直到该文件还不存在为止，然后将这个文件
 * 在当前目录中创建出来。
 * 
 * 单词记一记:
 * exsits 存在
 * create 创建
 * new    新的
 * 
 * @author Xiloer
 *
 */
public class Test05 {
	public static void main(String[] args) throws IOException {
		Scanner scanner=new Scanner(System.in);
		while (true){
			String str=scanner.next();
			File file=new File(str);
			if(file.exists()){
				System.out.println("此文件存在，请重新输入:");
			}else {
				file.createNewFile();
				break;
			}
		}
	}
}
/*
	提示代码:
	需要用到的语句，尝试按照正确顺序将下列代码并放在main方法中完成需求，
	并在注释中标注每句话的作用，
	//【定义输入值】
	Scanner scanner = new Scanner(System.in);

	//【做一个死循环】
	while(true){

	}

	//【获取输入值】
	String fileName = scanner.nextLine();

	//【创建一个file对象，文件名字为fileName】
	File file = new File(fileName);

	//【提升创建完毕】
	System.out.println("文件创建完毕!");

	//【输入文件名】
	System.out.println("请输入文件名:");

	//【创建文件】
	file.createNewFile();

	//【判断文件是否存在】
	if(file.exists()){

	}else{

	}

	//【提示文件存在】
	System.out.println("该文件已存在，请更换名字");

	//【跳出循环】
	break;


 */








