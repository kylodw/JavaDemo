package test7;

public class Handler3 extends AbstractHandler {
    @Override
    protected int getHandleLevel() {
        return 3;
    }

    @Override
    protected void handle(AbstractRequest abstractRequest) {
        System.out.println("handler3 处理" + abstractRequest.getRequestLevel());
    }
}
