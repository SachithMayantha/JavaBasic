package DesignPattern.Singleton;

public class Singleton2 {
    public static void main(String[] args) {
        SingletonDP singletonDP = SingletonDP.getInstance();
        singletonDP.msg();
    }
}
