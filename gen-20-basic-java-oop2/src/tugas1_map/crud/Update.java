package tugas1_map.crud;

import java.util.*;

import static tugas1_map.main.Main.run;

public class Update implements Crud {

//    final Map<Integer,String> map = new TreeMap<>();

    @Override
    public void updateMap() {

        try{
            if(map.isEmpty()){
                throw new EmptyStackException();
            }
            Scanner input = new Scanner(System.in);
            System.out.print("Input key: ");
            int key = input.nextInt();
            if (!map.containsKey(key)) {
                throw new IllegalStateException();
            }
            System.out.print("Input value: ");
            input.nextLine();
            String value = input.nextLine();
                if (value.isEmpty()) {
                    throw new IllegalArgumentException();
                }
                map.put(key, value);
            System.out.println("Data berhasil diperbarui.");
        } catch(IllegalStateException e){
            System.err.println("key tersebut belum mempunyai nilai");
            run();
        } catch(IllegalArgumentException e){
            System.err.println("Anda harus mengisi isi data");
            run();
        } catch(EmptyStackException e){
            System.err.println("Map masih kosong");
            run();
        }
    }
    @Override
    public void getValue(Integer key) { }
    @Override
    public void getValue() { }
    @Override
    public void deleteData() {  }
    @Override
    public void getAll() { }
    @Override
    public void addMap(Integer key) {}
}

