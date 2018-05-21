package test8;

import java.util.Observable;

/**
 * Created by dw322 on 2018/5/21.
 */

public class DevTechFrontier extends Observable {
    public void postNewPublication(String content){
        setChanged();
        notifyObservers(content);
    }
}
