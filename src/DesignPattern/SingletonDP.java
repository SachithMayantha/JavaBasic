package DesignPattern;

public class SingletonDP {
    //variable can't change (private and static) and make instance null
    private static SingletonDP instance = null;

    //make constructor private(can't create instances)
    private SingletonDP(){}

    //instance can get through the getInstance()
    public static SingletonDP getInstance(){
        //create instance when it needed
        if (instance==null){
            instance = new SingletonDP();
        }
        return instance;
    }

}
