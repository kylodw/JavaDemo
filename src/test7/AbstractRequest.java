package test7;

public abstract class AbstractRequest {
    private Object object;

    public AbstractRequest(Object object) {
        this.object = object;
    }

    public Object getContent() {
        return object;
    }

    public abstract int getRequestLevel();
}
