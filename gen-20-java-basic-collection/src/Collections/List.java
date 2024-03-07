package Collections;

import java.util.*;


public class List {

    public static void inputData(ArrayList<String> listData){
        System.out.print("Input panjang data:");
        Scanner input = new Scanner(System.in);

        Integer panjangData = Integer.parseInt(input.nextLine());

        //input data ke listData sesuai dengan panjang data
        for(int i = 0; i < panjangData; i++){
            System.out.println("Data ke-" + (i + 1) + ": ");
            listData.add(input.nextLine());
        }


    }

    public static void main(String[] args){

        ArrayList<String> listData = new ArrayList<>();
        inputData(listData);

        // mengeluarkan output array list
        System.out.println("Berikut output array list");
        for(String list : listData){
            System.out.println(list);
        }

        // menggunakan hash set
        HashSet<String> dataHash = new HashSet<>(listData);
        System.out.println("Berikut output hash set");
        for(String data : dataHash){
            System.out.println(data);
        }

        // menggunakan tree set
        TreeSet<String> dataTree = new TreeSet<>(listData);
        System.out.println("Berikut output tree set:");
        for (String tree : dataTree){
            System.out.println(tree);
        }


    }
}
