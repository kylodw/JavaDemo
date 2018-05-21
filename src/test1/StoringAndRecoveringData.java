package test1;

import java.io.*;

/**
 * 存储和恢复数据
 */
public class StoringAndRecoveringData {
    private static final String PATH = "C:\\Users\\dw322\\Desktop\\test.txt";
    public static void main(String[] args) throws IOException {
        DataOutputStream out=new DataOutputStream(new BufferedOutputStream(new FileOutputStream(PATH)));
        out.writeDouble(3.1415926);
        out.writeUTF("我爱java编程");
        out.writeDouble(1.151689);
        out.writeUTF("我也爱android");
        out.close();
        DataInputStream inputStream=new DataInputStream(new BufferedInputStream(new FileInputStream(PATH)));
        System.out.println(inputStream.readDouble());
        System.out.println(inputStream.readUTF());
        System.out.println(inputStream.readDouble());
        System.out.println(inputStream.readUTF());
    }
}
