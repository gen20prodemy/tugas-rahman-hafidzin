package tugas2_file.main;


import tugas2_file.crud.CrudClass;
import tugas2_file.pojo.Pojo;

public class Main {
    static CrudClass crud = new CrudClass();
    public static void main(String[] args){

        crud.readFile();

        Pojo data = new Pojo(12312, "kita bisa");
        System.out.println();
        crud.createRow(data);
        System.out.println();
        crud.readFile();

        crud.deleteId();
        crud.readFile();


    }
}
