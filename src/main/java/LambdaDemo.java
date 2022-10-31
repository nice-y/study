import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;

public class LambdaDemo {
    public static void main(String[] args) {
        /* 原式子，函数是接口的匿名内部类 */
        FileFilter f1 = new FileFilter() {
            @Override
            public boolean accept(File file) {
                return file.getName().endsWith(".txt");
            }
        };
        /* lambda表达式 原接口只有一个方法可以省去方法和new对象*/
        FileFilter f2=(File file) ->{
            System.out.println(" ");
            return file.getName().endsWith(".txt");
            };
        /* 方法体一行可以忽略大括号，参数列表只有一个函数可以忽略小括号 */
        FileFilter f3=f-> f.getName().endsWith(".txt");
        File file=new File(".");
        /*
        可直接将参数带入
        FileFilter f4=f->f.getName().startsWith("test");
        file.listFiles(f4);
        */
        File dir=new File(".");
        dir.listFiles(f->f.getName().startsWith("test"));
        //File[] file1=dir.listFiles(f-> f.isFile());
        System.out.println(Arrays.toString(dir.listFiles(f-> f.isFile())));
        for (File f :dir.listFiles(f-> f.isFile())) {
            System.out.println(f);
        }
    }
}
