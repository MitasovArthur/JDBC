package Test.UserTicet.entity;

public class User {
    private int id;
    private String name;
    private String pwd;
    private String secretWord;

    public User(int id, String name, String pwd, String secretWord) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
        this.secretWord = secretWord;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPwd() {
        return pwd;
    }

    public String getSecretWord() {
        return secretWord;
    }
}

