package sk.stuba.fei.umi.oop;

import java.sql.Array;
import java.util.Arrays;

public class App {
    public static void main(String[] args){
        int x = 5;
        int [] y = new int[]{1,2,3};
        FakeStruktura z = new FakeStruktura();

        System.out.println(x);
        pokusRaw(x);
        System.out.println(x);

        System.out.println(Arrays.toString(y));
        pokusArray(y);
        System.out.println(Arrays.toString(y));

        System.out.println(z.x);
        z.x=7;
        System.out.println(z.x);
        pokusObject(z);
        System.out.println(z.x);
    }
    public static void pokusRaw(int cislo){
        cislo = 7;
        System.out.println(cislo);
    }

    public static void pokusArray(int[] array){
        array[0]=10;
        System.out.println(Arrays.toString(array));
    }

    public static void pokusObject(FakeStruktura struktura){
        struktura.x= 10;
        System.out.println(struktura.x);
    }
}
