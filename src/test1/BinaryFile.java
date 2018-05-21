package test1;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class BinaryFile {
    private static final String PATH = "C:\\Users\\dw322\\Desktop\\test.txt";
    public static byte[] raad(File file) throws IOException {
        BufferedInputStream bufferedInputStream=new BufferedInputStream(new FileInputStream(file));
        try {
            byte[] data = new byte[bufferedInputStream.available()];
            bufferedInputStream.read(data);
            return data;
        }finally {
            bufferedInputStream.close();
        }
    }
    public static byte[] read(String file) throws IOException {
        return  raad(new File(file).getAbsoluteFile());
    }

    public static void main(String[] args) throws IOException {
        read(PATH);
    }
}
