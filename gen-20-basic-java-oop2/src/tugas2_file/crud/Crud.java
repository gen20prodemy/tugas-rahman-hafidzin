package tugas2_file.crud;

import tugas2_file.pojo.Pojo;

abstract class Crud {
    public abstract void createRow(Pojo data);
    public abstract void readRow();
    public abstract void deleteRow(Pojo data);

}
