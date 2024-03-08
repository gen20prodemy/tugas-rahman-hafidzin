package tugas1_map.crud;

import java.util.Map.Entry;

public class Read implements Crud {

    public void getAll(){

        if(map.isEmpty()){
            System.err.println("Map masih kosong.");
        } else {
            System.out.println("Berikut seluruh data dari map :");
            for(Entry<Integer, String> show : map.entrySet() ){
                int key = show.getKey();
                String value = show.getValue();
                System.out.println("key : "+ key + ", mempunyai nilai : " + value);
            }
        }
    }

    @Override
    public void getValue(Integer key) {
            if(map.containsKey(key)){
                System.err.println("Key tersebut telah digunakan, silahkan gunakan update");
            }
    }

    public void getValue(){}
    @Override
    public void deleteData() {   }
    @Override
    public void addMap(Integer key) {}
    @Override
    public void updateMap() { }


}

