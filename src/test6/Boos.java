package test6;

public class Boos extends Leader {
    @Override
    public int limit() {
        return Integer.MAX_VALUE;
    }

    @Override
    public void handle(int money) {
        System.out.println("Boos批复" + money + "元");
    }
}
