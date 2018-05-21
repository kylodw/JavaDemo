package test1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 读写随机访问文件
 */
public class UsingRandomAccessFile {
    private static final String FILE_OUT = "random.txt";

    public static void main(String[] args) throws IOException {
        RandomAccessFile rf = new RandomAccessFile(FILE_OUT, "rw");

        for (int i = 0; i < 7; i++) {
            rf.writeDouble(i * 1.414);
        }
        rf.writeUTF("end file");
        rf.close();
        display();
        rf = new RandomAccessFile(FILE_OUT, "rw");
        rf.seek(5 * 8);
        rf.writeDouble(47.0001);
        rf.close();
        display();
    }

    static void display() throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(FILE_OUT, "r");
        for (int i = 0; i < 7; i++) {
            System.out.println("Value" + i + ":" + randomAccessFile.readDouble());
        }
        System.out.println(randomAccessFile.readUTF());
        randomAccessFile.close();
    }
}
