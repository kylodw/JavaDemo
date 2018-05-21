package test6;

public abstract class Leader {
    protected Leader nextLeader;

    public final void handleRequest(int money) {
        if (money <= limit()) {
            handle(money);
        } else {
            if (null != nextLeader) {
                nextLeader.handleRequest(money);
            }
        }
    }

    public abstract int limit();

    public abstract void handle(int money);
}
