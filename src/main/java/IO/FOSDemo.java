package IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FOSDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("./fos.dat");
//        fos.write((int)'b');
//        fos.write(121);y
        for (int i = 0; i <128 ; i++) {
            fos.write(i);
        }
        System.out.println("写出完毕");
        fos.close();
    }
}
