package day13;

import java.util.Date;

public class Task1 {
    public static void main(String[] args) {
        User u1 = new User("Olya");
        User u2 = new User("Andrey");
        User u3 = new User("Dima");

        u1.sendMessage(u2, "Привет, от u1");
        u1.sendMessage(u2, "Как дела?");

        u2.sendMessage(u1, "Привет от u2");
        u2.sendMessage(u1, "Хорошо, твои как?");
        u2.sendMessage(u1, "ну и пока");

        u1.sendMessage(u3, "Привет от u1");
        u1.sendMessage(u3, "что делаешь?");
        u1.sendMessage(u3, "здорово");

        u3.sendMessage(u1, "Привет от u3, лежу");

        MessageDatabase.showDialog(u1, u3);
    }
}
