package tugas1_map.crud;


import java.util.Map;
import java.util.TreeMap;

public interface Crud {

        Map<Integer,String> map = new TreeMap<>();
        void addMap(Integer key);
        void updateMap() ;
        void getAll();
        void getValue(Integer key);
        void getValue();
        void deleteData();
}


