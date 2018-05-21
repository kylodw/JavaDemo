package test5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class GetChannel {
    private static final int BSIZE = 1024;
    private static final String FILE_PATH = "C:\\Users\\dw322\\Desktop\\test.txt";

    public static void main(String[] args) throws IOException {
        FileChannel fc = new FileOutputStream(FILE_PATH).getChannel();
        fc.write(ByteBuffer.wrap("Some text".getBytes()));
        fc.close();

        fc = new RandomAccessFile(FILE_PATH, "rw").getChannel();
        fc.position(fc.size());
        fc.write(ByteBuffer.wrap("Some more".getBytes()));
        fc.close();

        fc = new FileInputStream(FILE_PATH).getChannel();
        ByteBuffer byteBuffer = ByteBuffer.allocate(BSIZE);
        fc.read(byteBuffer);
        byteBuffer.flip();
        while (byteBuffer.hasRemaining()) {
            System.out.println((char) byteBuffer.get());
        }
    }
}
