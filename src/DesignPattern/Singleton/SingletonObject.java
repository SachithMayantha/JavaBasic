package DesignPattern.Singleton;

public class SingletonObject {
    //variable can't change (private and static) and make instance null
    private static SingletonObject instance = null;

    //make constructor private(can't create instances)
    private SingletonObject(){}

    //instance can get through the getInstance()
    public static SingletonObject getInstance(){
        //create instance when it needed
        if (instance==null){
            instance = new SingletonObject();
            System.out.println("Instance Created");
        }
        return instance;
    }

    public void msg(){
        System.out.println("Message");
    }

}
