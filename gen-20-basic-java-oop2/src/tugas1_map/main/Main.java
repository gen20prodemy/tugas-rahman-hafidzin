package tugas1_map.main;

import tugas1_map.crud.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Crud create = new Create();
    static Crud read = new Read();
    static Crud update = new Update();
    static Crud delete = new Delete();
    public static void run(){
        try{

            Scanner input = new Scanner(System.in);
            System.out.println("\nPilih opsi yang diinginkan:\n1. Tambah data baru.\n" +
                    "2. Lihat semua data\n3. Update data\n4. Delete data\n5. Akhiri program");
            int option = input.nextInt();
            if(option < 1 || option > 6){
                throw new IllegalArgumentException();
            }

            switch (option){
                case 1:
                    System.out.print("Input key: ");
                    int key = input.nextInt();
                    read.getValue(key);
                    create.addMap(key);
                    run();
                case 2:
                    read.getAll();
                    run();
                case 3:
                    update.updateMap();
                    run();
                case 4:
                    delete.deleteData();
                    run();
                case 5:
                    System.err.println("Program berakhir");
                    System.exit(0);
                default:
                    System.out.println();
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
