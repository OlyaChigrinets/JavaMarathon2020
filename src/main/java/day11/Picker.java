package day11;

public class Picker implements Worker {
    private int salary;

    public int getSalary() {
        return salary;
    }

    Warehouse warehouse;

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public void doWork() {
        this.salary += 80;
        warehouse.setCountOrder(warehouse.getCountOrder() + 1);
    }

    @Override
    public void bonus() {
        if (warehouse.getCountOrder() % 1500 == 0) {
            this.salary *= 3;
        }
    }
}
