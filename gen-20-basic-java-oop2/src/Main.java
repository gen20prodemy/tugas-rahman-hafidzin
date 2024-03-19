import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String test = "keluar";
        char[] test2 = test.toCharArray();
        String val = "";
        for(int i = 0; i < test.length(); i++){
            val = test2[i] + val;
            System.out.println(val);
        }
//        StringBuilder value = new StringBuilder(test);
//        String reversed = value.reverse().toString();

        if (val.equals(test)){
            System.out.println("sama");
        }



    }
}

