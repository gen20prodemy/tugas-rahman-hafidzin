package tugas2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        int d = input.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        int count = 0;
        for(int i = 0; i < length; i++){
            arr.add(input.nextInt());
            System.out.println(arr);
        }

        for(Integer list : arr){
            if(arr.contains(list + d) && arr.contains(list+(2*d))){
                count++;
            }
        }
        System.out.println(count);

    }
}
