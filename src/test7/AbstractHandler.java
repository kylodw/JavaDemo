package test7;

public abstract class AbstractHandler {
    protected AbstractHandler abstractHandler;

    public final void handlerRequest(AbstractRequest request) {
        if (getHandleLevel() == request.getRequestLevel()) {
            handle(request);
        } else {
            if (abstractHandler != null) {
                abstractHandler.handlerRequest(request);
            } else {
                System.out.println("所有的处理者都不能处理该请求");
            }
        }
    }

    protected abstract int getHandleLevel();

    protected abstract void handle(AbstractRequest abstractRequest);
}
