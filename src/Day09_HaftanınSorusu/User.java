package Day09_Haftan�nSorusu;


import java.time.LocalDateTime;

public class User {

    String name;
    LocalDateTime registerDate;
    public User(){// p'siz cons.

    }

    public User(String name, LocalDateTime registerDate) { //p'li fields li cons.
        this.name = name;
        this.registerDate = registerDate;
    }
}