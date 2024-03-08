package tugas1_map.crud;

import java.util.EmptyStackException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Delete implements Crud {


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
    @Override
    public void addMap(Integer key) {}
    @Override
    public void updateMap() {}
    @Override
    public void getAll() {   }
    @Override
    public void getValue(Integer key) { }
    @Override
    public void getValue() {}
}