package test8;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by dw322 on 2018/5/21.
 */

public class Coder implements Observer {
    public String name;

    public Coder(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Hi" + name + "我更新了，内容：" + arg);
    }

    @Override
    public String toString() {
        return "码农hah{" +
                "name='" + name + '\'' +
                '}';
    }
}
