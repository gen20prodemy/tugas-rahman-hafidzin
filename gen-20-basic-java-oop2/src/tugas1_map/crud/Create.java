package tugas1_map.crud;

import java.util.Scanner;

import static tugas1_map.main.Main.run;

public class Create implements Crud{

//    final Map<Integer,String> map = new TreeMap<>();
    @Override
    public void addMap(Integer key) {

        try{
            Scanner input = new Scanner(System.in);

            System.out.print("Input value: ");
            String value = input.nextLine();
            if (map.containsKey(key)) {
                throw new IllegalStateException();
            }

            if (value == null) {
                throw new IllegalArgumentException();
            }

            map.put(key, value);
            System.out.println("Data berhasil ditambah.");
        } catch(IllegalStateException e){
            System.err.println(key + " telah mempunyai value, silahkan gunakan update");
        } catch(IllegalArgumentException e){
            System.err.println("key tidak boleh kosong, silahkan isi");
        }

    }
    @Override
    public void updateMap() { }
    @Override
    public void getValue() {  }
    @Override
    public void deleteData() {    }
    public void getAll(){}
    @Override
    public void getValue(Integer key) {}
}
