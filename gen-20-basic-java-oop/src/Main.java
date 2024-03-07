import java.util.*;

public class Main {
    public static void main(String[] args){
        // deklarasi p1, p2, p3 dengan class Selling
        Selling p1 = new Selling();
        Selling p2 = new Selling();
        Selling p3 = new Selling();

        p2.selling("Betadine", 8000);
        p3.selling("Minuman", "Mountea", 2000);

        p1.display();
        p2.display();
        p3.display();

        System.out.println("Silahkan input ulang data!");
        try{
            inputProduk();
            p2.display();
            p3.display();
            } catch (InputMismatchException | NullPointerException e){
            System.err.println("Terjadi error: "+ e);
        }
    }


    public static void inputProduk(){
        Scanner input = new Scanner(System.in);
        System.out.print("Input kategori produk: ");
        String cat = input.nextLine();
        System.out.print("Input nama produk: ");
        String product = input.nextLine();
        System.out.print("Input harga produk: ");
        int price = input.nextInt();

        Selling p1 = new Selling();
        p1.selling(cat, product, price);
        p1.display();


//        System.out.print("Input nama produk : ");
//        input.nextLine();
//        String produk = input.nextLine();
    }

//    public static void inputKategori(){
//        Scanner input = new Scanner(System.in);
//        System.out.print("Input kategori produk : ");
//
//    }
//
//    public static void inputHarga(){
//        Scanner input = new Scanner(System.in);
//        System.out.print("Input harga produk : ");
//
//    }
}
