package Collections;

import java.util.*;


public class List {

    public static void inputData2(HashSet<String> dataHash, HashMap<String, Integer> hashMap){
        Scanner input =  new Scanner(System.in);
        for(String data : dataHash){
            System.out.print("Masukkan jumlah data dari " + data +": ");
            int jumlah = input.nextInt();
            hashMap.put(data, jumlah);
        }
    }

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
        HashMap<String, Integer> hashMap = new HashMap<>();
        inputData2(dataHash, hashMap);

        // mengeluarkan output dari hashmap method inputData2
        System.out.println("Hasil dari inputData2:");
        for(Map.Entry<String, Integer> map : hashMap.entrySet()){
            String data1 = map.getKey();
            int data2 = map.getValue();
            System.out.println(data1 + " dan " + data2);

        }



    }
}
