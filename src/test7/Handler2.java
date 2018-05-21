package test7;

public class Handler2 extends AbstractHandler {
    @Override
    protected int getHandleLevel() {
        return 2;
    }

    @Override
    protected void handle(AbstractRequest abstractRequest) {
        System.out.println("Handler2处理"+abstractRequest.getRequestLevel());
    }
}
