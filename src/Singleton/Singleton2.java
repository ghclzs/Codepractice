package Singleton;

public  class Singleton2 {
    private static Object Singleton2;

    private Singleton2(){

    }
    private  static Singleton2 singleton2 = new Singleton2();
    public Singleton2 getSingleton2(){
        return singleton2;
    }

    public static void main(String[] args) {
        System.out.println(Singleton2);
    }


}
