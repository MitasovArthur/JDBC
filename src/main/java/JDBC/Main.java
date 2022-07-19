package JDBC;

import JDBC.clas.Info;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        JDBC jd = new JDBC();
        List<Info> infos = jd.getAllInfo();
        for (Info in : infos) {
            System.out.println(in.getId() + " " + in.getName() + " " + in.getNumber());
        }

    }
}
