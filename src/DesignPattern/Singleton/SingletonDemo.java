package DesignPattern.Singleton;

public class SingletonDemo {
    public static void main(String[] args) {
        SingletonObject singletonDP = SingletonObject.getInstance();
        singletonDP.msg();
    }
}
