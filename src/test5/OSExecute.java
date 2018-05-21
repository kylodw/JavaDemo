package test5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OSExecute {
    public static void command(String command) throws IOException {
        boolean error=false;
        Process process=new ProcessBuilder(command.split(" ")).start();

        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(process.getInputStream()));
        String s;
        while ((s=bufferedReader.readLine())!=null){
            System.out.println(s);
        }
        BufferedReader errors=new BufferedReader(new InputStreamReader(process.getErrorStream()));
        while ((s=errors.readLine())!=null){
            System.out.println(s);
            error=true;
        }
    }

    public static void main(String[] args) throws IOException {
        OSExecute.command("javap OSExecuteDemo");
    }

}
