package sk.stuba.fei.umi.oop;

public class App {
    public static void main(String[] args){
        String a = "a";
        String b= "a";
        String c = Zklavesnice.readString("zadaj text ");
        System.out.println(a==a);
        System.out.println(a==b);
        System.out.println(a==c);
    }
}
