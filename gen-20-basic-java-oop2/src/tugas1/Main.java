package tugas1;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int limit = input.nextInt();
        for(int i = 0; i < limit; i++){
            int b = input.nextInt();
            int w = input.nextInt();
                int bc = input.nextInt();
                int wc = input.nextInt();
                int z  = input.nextInt();
                int sum = 0;
                if(bc + z < wc){
                    sum = (b * bc) + (w * wc) + (b * z);
                    System.out.println(sum);
                }
                if(wc + z < bc){
                    sum = (b * wc) + ( w * wc) + (b * z);
                    System.out.println(sum);
                }
                if(bc == wc) {
                    sum = (b * bc) + (w * wc);
                    System.out.println(sum);
                } else {
                    sum = (b * bc) + (w * wc);
                    System.out.println(sum);
                }

//            if(bc + z < wc){
//                // harusnya diganti ke harga black
//                sum = (b * bc) + (w * bc) + (w * z);
//                System.out.println(sum);
//            } else
//            if(wc + z < bc){
//                sum = (b * wc) + ( w * wc) + (b * z);
//                System.out.println(sum);
//            } else {
//                sum = (b * bc) + (w * wc);
//                System.out.println(sum);
//            }

        }

        }

    }

