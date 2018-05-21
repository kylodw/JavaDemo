package test6;

public class Client {
    public static void main(String[] args) {
        GroupLeader groupLeader = new GroupLeader();
        Director director = new Director();
        Manager manager = new Manager();
        Boos boos = new Boos();

        groupLeader.nextLeader = director;
        director.nextLeader = manager;
        manager.nextLeader = boos;

        groupLeader.handleRequest(50000);
    }
}