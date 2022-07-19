package JDBC.clas;

public class Info {
    private int id;
    private String name;
    private int number;

    public Info(int id, String name, int number) {
        this.id = id;
        this.name = name;
        this.number = number;
    }
    public Info() {
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

    @Override
    public String toString() {
        return "Info{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", number=" + number +
                '}';
    }
}
