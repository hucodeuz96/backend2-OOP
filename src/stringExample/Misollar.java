package stringExample;

import java.util.Random;
import java.util.Scanner;

public class Misollar {
    public static void main(String[] args) {
        Scanner gg = new Scanner(System.in);
        System.out.print("massiv uzunligini kiriting : ");
        int n = gg.nextInt();
        String []str = new String[n];
        // bu holat son kiritlgandan keyin sting kirtilsa muammoni oldini olish uchun
        gg = new Scanner(System.in);
        for (int i = 0; i <str.length; i++) {
            System.out.print(i+1+"-index:");
            str[i]=  gg.nextLine();
        }
        String max=str[0];
        for (int i = 0; i < str.length; i++) {
            if(max.length()<str[i].length()){
                max = str[i];
            }

        }

        System.out.println("max☻ : "+ max);


//        Random random = new Random();
//        for (int i = 0; i < a.length; i++) {
//            a[i] = random.nextInt(100);
//            System.out.println(a[i]);
//        }
//        int max = a[0];
//
//        for (int i = 0; i < a.length; i++) {
//            if(a[i]>max){
//                max = a[i];
//            }
//        }
//        System.out.println("max = "+ max);
    }


}