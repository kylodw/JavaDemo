package test8;

/**
 * Created by dw322 on 2018/5/21.
 */

public class Test {
    public static void main(String[] args) {
        DevTechFrontier devTechFrontier=new DevTechFrontier();
        Coder coder=new Coder("mr");
        Coder coder1=new Coder("coder-1");
        Coder coder2=new Coder("coder-2");
        Coder coder3=new Coder("coder-3");

        devTechFrontier.addObserver(coder);
        devTechFrontier.addObserver(coder1);
        devTechFrontier.addObserver(coder2);
        devTechFrontier.addObserver(coder3);

        devTechFrontier.postNewPublication("新的一期发布了");
    }
}
