public class Selling extends Product{

    private int harga;


    public void selling(String kategori, String produk, int harga ){
        setCat(kategori);
        setProduct(produk);
        setPrice(harga);
    }

    @Override
    public void setCat(String kategori){
        this.category = kategori;
    }
    public void selling(String produk, int harga ){
        setProduct(produk);
        setPrice(harga);
    }
    @Override
    public void display(){
        System.out.println("Kategori produk\t : " + getCategory());
        System.out.println("Nama produk\t\t : " + getProduct());
        System.out.println("Harga asli\t\t : " + getPrice());
        System.out.println("Harga diskon\t : " + getDiscounted());
        System.out.println();
    }
    public void setPrice(int harga){
        this.harga = harga;
    }

    public int getPrice(){
        return this.harga;
    }

    public int getDiscounted(){
       return this.harga - (this.harga * 20/100);
    }



}
