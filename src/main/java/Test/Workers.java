package Test;

public class Workers {
private int id;
private int id_info;
private String name;
private int number;

    public Workers(int id,int id_info, String name, int number) {
        this.id = id;
        this.id_info = id_info;
        this.name = name;
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public int getId_info() {
        return id_info;
    }
}
