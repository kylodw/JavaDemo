package test7;

public class Handler1 extends AbstractHandler {
    @Override
    protected int getHandleLevel() {
        return 1;
    }

    @Override
    protected void handle(AbstractRequest abstractRequest) {
        System.out.println("Handler1 处理" + abstractRequest.getRequestLevel());
    }
}
