package sk.stuba.fei.umi.oop;

import java.sql.Array;
import java.util.Arrays;

public class App {
    public static void main(String[] args){
        int [] x = new int[]{1,2,3};
        int [] y= new int[3];
        for(int i=0;i<y.length;i++){
            y[i]=i+1;
        }
        System.out.println(Arrays.equals(x,y));
    }
}
