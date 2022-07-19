package Test;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        DBrequest DB = new DBrequest();
        List<Workers> workers = DB.getAllWorcers();
        for (Workers wr : workers) {
            System.out.println(wr.getId() + " " + wr.getName() + " " + wr.getNumber());
        }
    }
}
