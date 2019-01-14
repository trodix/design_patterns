package fr.oroger;

public class Main {

    public static void main(String[] args) {
        User user = new User("TOTO");

        UserDebugger debugger = new UserDebugger();
        user.accept(debugger);
    }
}
