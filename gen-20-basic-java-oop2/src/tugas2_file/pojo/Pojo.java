package tugas2_file.pojo;

public class Pojo {
    private String data;
    private Integer id;

    public Pojo(Integer id, String data){
        this.id =  id;
        this.data = data;
    }

    public Integer getId(){
        return this.id;
    }
    public String getData(){
        return this.data;
    }
    public void setData(String data){
        this.data = data;
    }
    public void setId(Integer id){
        this.id = id;
    }
    public Pojo(){
    }



}
