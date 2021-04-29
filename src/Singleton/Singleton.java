package Singleton;

public class Singleton {

    private static Singleton singleton;
    private Singleton(){
    }
    public static Singleton getsingleton( ){
        if(singleton==null){
            singleton = new Singleton();
        }
        return singleton;
    }

    public static void main(String[] args) {
        System.out.println(Singleton.getsingleton());
        System.out.println(Singleton.getsingleton());
    }
}
