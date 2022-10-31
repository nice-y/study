package homework.day01;

import java.io.File;
import java.io.IOException;

/**
 * 在当前项目目录下新建100个文件，名字为:"1.txt"---"100.txt"
 */
public class Test01 {
    public static void main(String[] args) throws IOException {
        for (int i =1; i <= 100; i++) {
            File file = new File("./test" + i + ".txt");
            if (file.exists()) {
                System.out.println("文件已存在");
            } else {
                file.createNewFile();
            }
        }

    }
}
