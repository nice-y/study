package File;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        File file=new File("./Test.txt");
        System.out.println(file.length());
        System.out.println("是否可读："+file.canRead());
        System.out.println("是否可写："+file.canWrite());
        System.out.println("是否隐藏："+file.isHidden());
        for (int i = 1; i <= 10; i++) {
            File file1=new File("./Test"+i+".txt");
            if(file1.exists()){
                System.out.println("文件已存在！！！");
            }
            else {
                file1.createNewFile();
                System.out.println("文件已创建！！！！！！！");
            }
//            if(file1.exists()){
//                file1.delete();
//                System.out.println("文件已删除");
//            }else {
//                System.out.println("文件不存在");
//            }
        }
    }
}
