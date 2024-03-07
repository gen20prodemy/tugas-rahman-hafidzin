public class ProductCategory {
    protected String category = "Produk Jualan";
//    private int index;

    void display(){
        System.out.println("Kategori = " + category);
    }

    String setCat(){
       return this.category;
    }

//    int productIndex(){
//        this.index = 1;
//        return index;
//    }
//
//    void addIndex(){
//        this.index++;
//    }

    public String getCategory(){
        return this.category;
    }

}
