package tugas2_file.crud;

import tugas2_file.pojo.Pojo;

import java.io.File;
import java.nio.file.Files;

public class CrudClass extends Crud {
    static Pojo pojo = new Pojo();
    @Override
    public void createRow() {
        File dir = pojo.input();
//        Files.writeString(dir, "kelas" );
    }

    @Override
    public void readRow() {

    }

    @Override
    public void updateRow() {

    }

    @Override
    public void deleteRow() {

    }
}
