package File;

import java.io.File;
import java.io.IOException;

public class CreateNewFile {
    public static void main(String[] args) throws IOException {
        File file=new File("./Demo.txt");
        if(file.exists()){
            System.out.println("文件已存在！！！");
        }
        else {
            file.createNewFile();
            System.out.println("文件已创建！！！！！！！");
        }
        if(file.exists()){
            file.delete();
            System.out.println("文件已删除");
        }else {
            System.out.println("文件不存在");
        }
        File dir1=new File("./a/b/c/d/e/f");
        if(dir1.exists()){
            System.out.println("文件已存在！！！");
        }
        else {
            dir1.mkdirs();
            System.out.println("文件已创建！！！！！！！");
        }
        File dir=new File("./a/b/c/d/e/f");
        if(dir.exists()){
            dir.delete();
            System.out.println("文件已删除");
        }else {
            System.out.println("文件不存在");
        }
    }
}
