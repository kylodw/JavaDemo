package test5;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;
import java.util.concurrent.TimeUnit;

public class FileLocking {
    public static void main(String[] args) throws IOException, InterruptedException {
        FileOutputStream fileOutputStream=new FileOutputStream("file.txt");
        FileLock fl=fileOutputStream.getChannel().tryLock();
        if(fl!=null){
            System.out.println("lock file");
            TimeUnit.MILLISECONDS.sleep(100);
            fl.release();
            System.out.println("release lock");
        }
        fileOutputStream.close();
    }
}
