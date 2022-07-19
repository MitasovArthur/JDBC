package JDBC.clas;

import java.util.Date;

public class Statemens {
    private int id;
    private int workers_id;
    private String place;
    private Date date_birthday;
    private String marital;

    public Statemens(int id, int workers_id, String place, Date date_birthday, String marital) {
        this.id = id;
        this.workers_id = workers_id;
        this.place = place;
        this.date_birthday = date_birthday;
        this.marital = marital;
    }
}
