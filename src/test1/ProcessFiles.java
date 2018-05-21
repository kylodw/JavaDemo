package test1;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;

public class ProcessFiles {
    public interface Strategy {
        void process(File file);
    }

    private Strategy strategy;
    private String ext;

    public ProcessFiles(Strategy strategy, String ext) {
        this.strategy = strategy;
        this.ext = ext;
    }

    public void start(String[] args) {
        if (args.length == 0) {
            processDirectoryTree(new File("."));
        }else {
            for (String arg:args){
                File fileArg=new File(arg);
                if(fileArg.isDirectory()){
                    processDirectoryTree(fileArg);
                }else {
                    if(!arg.endsWith("."+ext)){
                        arg+="."+ext;
                    }
                    try {
                        strategy.process(new File(arg).getCanonicalFile());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    private void processDirectoryTree(File file) {
    }
}
