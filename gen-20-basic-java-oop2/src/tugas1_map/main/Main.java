package tugas1_map.main;

import tugas1_map.crud.*;


import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    static CrudClass crud = new CrudClass();
    public static void run(){
        try{

            Scanner input = new Scanner(System.in);
            System.out.println("""
                    Pilih opsi yang diinginkan:
                    1. Tambah data baru.
                    2. Lihat semua data
                    3. Update data
                    4. Delete data
                    5. Akhiri program
                    6. Upload ke text file""");

            int option = input.nextInt();
            if(option < 1 || option > 6){
                throw new IllegalArgumentException();
            }
            switch (option){
                case 1:
                    System.out.print("Input key: ");
                    int key = input.nextInt();
                    crud.getValue(key);
                    crud.addMap(key);
                    run();
                case 2:
                    crud.getAll();
                    System.out.println(crud.getMap());
                    run();
                case 3:
                    crud.updateMap();
                    run();
                case 4:
                    crud.deleteData();
                    run();
                case 5:
                    System.err.println("Program berakhir");
                    System.exit(0);
                case 6:
                    CrudClass.uploadText();
                    run();
                default:
                    System.out.println("Terjadi kesalahan");
                    run();

        }
            } catch (InputMismatchException | NullPointerException e){
            System.err.println("Mohon input berupa angka.");
            run();
        } catch (IllegalArgumentException e){
            System.err.println("Opsi tidak tersedia.");
            run();
        }
    }

    public static void main(String[] args){
        run();
    }

}
