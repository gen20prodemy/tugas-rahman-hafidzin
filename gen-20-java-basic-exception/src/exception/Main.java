package exception;


import java.util.*;

public class Main {

    public static void validator(String name, int age) throws CustomException {
        if (age < 18){ // cek apakah umur sesuai bayas umur
            // mencoba custom exception dengan super
            throw new CustomException("Umur harus di atas 17 tahun", new ArithmeticException());
        }

        // mengeluarkan hasil input dari method
        System.out.println("Selamat datang "+ name);
        System.out.println("Umur anda: " + age);

        //memanggil scanner
        Scanner input = new Scanner(System.in);

        //melakukan uji coba exception menggunakan input array
        try {
            System.out.print("Masukkan panjang array: ");
            int nilai = input.nextInt();

            System.out.println("Masukkan nilai pada array:");
            // menggunakan looping untuk menginput panjang array sesuai kondisi
            while(nilai > 20 || nilai <= 0){
                System.out.println("nilai tidak sesuai");
                nilai = input.nextInt();
            }
            // mengisi array dengan nama numbers dengan Integer
            Integer[] numbers = new Integer[nilai];
            fillArray(numbers);

        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println(("Tidak sesuai dengan panjang array"));
        }
    }

    static void fillArray(Integer [] numbers) {
        System.out.println(Arrays.toString(numbers));
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
            System.out.println(Arrays.toString(numbers));
        }

        // melihatkan nilai index pada array
        System.out.print("Lihat isi dari index ke-?: ");
        int index = input.nextInt();
        System.out.println("nilai dari index["+index+"] = " + numbers[index]);

    }
    public static void main(String[] args) throws CustomException {

        try{

        Scanner input = new Scanner(System.in);

        System.out.print("Ketik nama anda: ");
        String name = input.nextLine();
        for(char c : name.toCharArray())
            if(!Character.isLetter(c)){
                throw new CustomException("Nama harus huruf semua.");
            }
        System.out.print("Ketik umur anda: ");
        int age = input.nextInt();
        validator(name, age);
        } catch (InputMismatchException e){
            System.out.println("Umur harus dalam angka.");
        } finally{
            System.out.println("Program selesai.");
        }
    }
}
