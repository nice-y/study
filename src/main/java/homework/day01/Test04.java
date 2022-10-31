package homework.day01;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * 要求用在控制台输入一个目录名，然后将当前项目目录下的这个目录删除。（只要求删除Test03创建的空目录）
 */
public class Test04 {
    public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            String str=scanner.next();
            File dir=new File("./"+str);
            if(dir.exists()&&dir.listFiles().length==0){
                dir.delete();
                System.out.println("目录已删除");
            }else if(dir.exists()==false){
                System.out.println("此目录不存在");
        }else {
                System.out.println("目录里有文件，无法删除s");
            }
    }
}
