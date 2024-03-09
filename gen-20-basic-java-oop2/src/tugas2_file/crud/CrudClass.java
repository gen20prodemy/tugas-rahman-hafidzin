package tugas2_file.crud;


import tugas2_file.pojo.Pojo;

import java.io.*;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;
public class CrudClass extends Crud {

    @Override
    public void createRow(Pojo data) {
        Map<Integer, Pojo> dataMap = readDataFromFile();
        if(dataMap.containsKey(data.getId())){
            System.out.println("Data sudah ada.");
        } else {
            dataMap.put(data.getId(), data);
            writeDataToFile(dataMap);
            System.out.println("Data berhasil ditambah");
        }
    }

    @Override
    public void readRow(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan ID yang ingin ditampilkan: ");
        Scanner fileScan;
        try {
            int searchId = input.nextInt();
            fileScan = new Scanner(new File("input.txt"));
            while (fileScan.hasNextLine()) {
                String line = fileScan.nextLine();
                String[] parts = line.split(":");
                int id = Integer.parseInt(parts[0]);

                if (id == searchId) {
                    System.out.println(line);
                }
                if(id != searchId){
                    throw new IndexOutOfBoundsException();
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File tidak ditemukan");
        } catch (IndexOutOfBoundsException e){
            System.out.println("Id tidak ditemukan");
        } catch (InputMismatchException e){
            System.out.println("Mohon masukkan angka");
        }

    }
    public void readFile() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("input.txt"));
            String line;
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File tidak ada");
        } catch (IOException e){
            System.out.println("Terjadi Error");
        }
    }

    public Map<Integer, Pojo> readDataFromFile() {
        Map<Integer, Pojo> dataMap = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    Pojo data = new Pojo();
                    data.setId(Integer.parseInt(parts[0].trim()));
                    data.setData(parts[1].trim());
                    dataMap.put(data.getId(),data);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File tidak ditemukan. Membuat file baru.");
        } catch (IOException e) {
            System.out.println("Terjadi Error");
        }
        return dataMap;
    }
    public void writeDataToFile(Map<Integer, Pojo> dataMap) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("input.txt"))) {
            for (Pojo data : dataMap.values()) {
                writer.write(String.format("%d, %s%n", data.getId(), data.getData()));

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void deleteRow(Pojo data) {
        Map<Integer, Pojo> dataMap = readDataFromFile();
        if(!dataMap.containsKey(data.getId())){
            System.out.println("Data tidak ditemukan");
        } else {
            dataMap.remove(data.getId());
            writeDataToFile(dataMap);
            System.out.println("Data Berhasil dihapus");
        }

    }
    public void deleteId(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan ID yang akan dihapus: ");
        int id = input.nextInt();
        Pojo data = new Pojo();
        data.setId(id);
        deleteRow(data);
    }
}
