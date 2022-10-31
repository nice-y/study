package homework.day01;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * 要求用在控制台输入一个目录名，然后将这个目录创建在当前项目目录下
 */
public class Test03 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String str=scanner.next();
        File dir=new File("./"+str);
        if(dir.exists()){
            System.out.println("目录已存在");
        }else {
            dir.mkdir();
            System.out.println("目录已创建");
        }
    }
}
