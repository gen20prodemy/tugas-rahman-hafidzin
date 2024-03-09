package tugas1_map.crud;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

import static tugas1_map.main.Main.run;

public class CrudClass implements Crud{

    private static Map<Integer,String> map = new TreeMap<>();
    public Map getMap(){
        return this.map;
    }

//    public setMap(){
//
//    }

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
    public void getValue(Integer key) {
        if(map.containsKey(key)){
            System.err.println("Key tersebut telah digunakan, silahkan gunakan update");
        }
    }

    @Override
    public void getValue() {

    }

    @Override
    public void deleteData(){
        try{
            if(map.isEmpty()){
                throw new EmptyStackException();
            }
            Scanner input = new Scanner(System.in);
            System.out.print("Input key yang ingin dihapus: ");
            int key = input.nextInt();
            if(!map.containsKey(key)){
                throw new IllegalAccessException();
            }
            map.remove(key);

            System.out.println("Data berhasil dihapus.");
        } catch (IllegalAccessException e){
            System.err.println("Key tersebut tidak tersedia");
        } catch (InputMismatchException e){
            System.err.println("Harap masukkan angka.");
        } catch (EmptyStackException e){
            System.err.println("Map masih kosong");
        }
    }

    public void getAll(){

        if(map.isEmpty()){
            System.err.println("Map masih kosong.");
        } else {
            System.out.println("Berikut seluruh data dari map :");
            for(Map.Entry<Integer, String> show : map.entrySet() ){
                int key = show.getKey();
                String value = show.getValue();
                System.out.println("key : "+ key + ", mempunyai nilai : " + value);
            }
        }
    }
    public static void uploadText(){
        File file = new File("input.txt");
        BufferedWriter bf = null;

        try {

            bf = new BufferedWriter(new FileWriter(file));

            for (Map.Entry<Integer, String> entry :
                    map.entrySet()) {
                bf.write(entry.getKey() + ":"
                        + entry.getValue());
                // new line
                bf.newLine();
            }

            bf.flush();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                bf.close();
            }
            catch (Exception e) {
            }
        }
    }

}
