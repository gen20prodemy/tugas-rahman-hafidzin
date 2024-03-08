package tugas1_map.pojo;

import tugas1_map.crud.Crud;

import java.util.Map;
import java.util.TreeMap;

public abstract class DataSiswa implements Crud {
    private int id ;
    private String nama;
    public int getNim(){
        return id;
    }
    public void setId(){
        this.id = id;
    }

    public String getNama(){
        return nama;
    }
    public void setNama(){
        this.nama = nama;
    }

    public DataSiswa(String nama, int id){
        this.nama = nama;
        this.id = id;
    }
}
