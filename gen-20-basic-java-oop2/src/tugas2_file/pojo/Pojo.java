package tugas2_file.pojo;

import java.io.*;
import java.util.Scanner;

public class Pojo {
    private int row;
    private String data;
    final File input = new File("input.txt");
    public String getData() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(input));
            String line;
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
//            e.printStackTrace();
        } catch (IOException e){
            System.out.println("Error read");
        }
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getRow() {
        return row;
    }

    public File input(){
        return input;
    }

    public void setRow(int row) {
        this.row = row;
    }

}
