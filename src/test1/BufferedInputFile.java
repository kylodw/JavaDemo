package test1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedInputFile {
    public static String read(String filename) throws IOException {
        StringBuilder sb;
        BufferedReader in;
        in = new BufferedReader(new FileReader(filename));
        String s;
        sb = new StringBuilder();
        while ((s = in.readLine()) != null) {
            sb.append(s + "\n");
        }
        in.close();

        return sb.toString();
    }
    public static void main(String[] args) throws IOException {
        System.out.print(read("C:\\Users\\dw322\\Desktop\\test.txt"));
    }
}
