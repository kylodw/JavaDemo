package test6;

public class GroupLeader extends Leader {
    @Override
    public int limit() {
        return 1000;
    }

    @Override
    public void handle(int money) {
        System.out.println("组长批复" + money + "元");
    }
}
