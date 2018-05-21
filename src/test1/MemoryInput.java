package test1;

import java.io.*;

public class MemoryInput {
    private static final String PATH = "C:\\Users\\dw322\\Desktop\\test.txt";
    private static final String FILEOUT="Output.txt";

    //从内存中输入
    public static void main(String[] args) throws IOException {

//        initMemoryInput();
//        initDataInput();
//        initEOF();
//        initBasic();
        initFileOutput();
    }

    private static void initFileOutput() throws IOException {
        BufferedReader in=new BufferedReader(new StringReader(BufferedInputFile.read(PATH)));
        PrintWriter out=new PrintWriter(FILEOUT);
        int lineCount=1;
        String s;
        while ((s=in.readLine())!=null){
            out.println(lineCount++ +":"+s);
        }
        out.close();
        System.out.println(BufferedInputFile.read(FILEOUT));
    }

    private static void initBasic() throws IOException {
        BufferedReader in=new BufferedReader(new StringReader(BufferedInputFile.read(PATH)));
        PrintWriter printWriter=new PrintWriter(new BufferedWriter(new FileWriter("BaicFileOutput.java")));
        int lineCount=1;
        String s;
        while ((s=in.readLine())!=null){
            printWriter.println(lineCount++ +":"+s);
        }
        printWriter.close();
        System.out.println(BufferedInputFile.read("BaicFileOutput.java"));
    }

    private static void initEOF() throws IOException {
        DataInputStream inputStream=new DataInputStream(new BufferedInputStream(new FileInputStream(PATH)));
        while (inputStream.available()!=0){
            System.out.print((char) inputStream.readByte());
        }
    }

    private static void initDataInput() throws IOException {
        DataInputStream inputStream = new DataInputStream(new ByteArrayInputStream(BufferedInputFile.read(PATH).getBytes()));
        try {
            while (true) {
                System.out.print((char) inputStream.readByte());
            }
        } catch (EOFException e) {
            e.printStackTrace();
        }
    }

    private static void initMemoryInput() throws IOException {
        StringReader in = new StringReader(BufferedInputFile.read(PATH));
        int c;
        //以int形式返回下一个字节
        while ((c = in.read()) != -1) {
            System.out.print((char) c);
        }
    }
}
