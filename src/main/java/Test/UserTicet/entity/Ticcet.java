package Test.UserTicet.entity;

public class Ticcet {
    private int  id;
    private int user_id;
    private String ticketName;
    private double price;

    public Ticcet(int id, int user_id, String ticketName, double price) {
        this.id = id;
        this.user_id = user_id;
        this.ticketName = ticketName;
        this.price = price;
    }
    public Ticcet() {
    }

    public int getId() {
        return id;
    }

    public int getUser_id() {
        return user_id;
    }

    public String getTicketName() {
        return ticketName;
    }

    public double getPrice() {
        return price;
    }

}
