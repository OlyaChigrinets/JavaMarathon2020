package day11;

public class Warehouse {
    private int countOrder;
    private int balance;

    public int getCountOrder() {
        return this.countOrder;
    }

    public void setCountOrder(int countOrder) {
        this.countOrder = countOrder;
    }

    public int getBalance() {
        return this.balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Заказы: " + this.countOrder + "\n"
                + "Баланас: " + this.balance;
    }
}
