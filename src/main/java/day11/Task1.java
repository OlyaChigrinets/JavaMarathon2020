package day11;

public class Task1 {
    public static void main(String[] args) {

        Warehouse warehouse = new Warehouse();
        Picker picker = new Picker(warehouse);
        Courier courier = new Courier(warehouse);

        for (int i = 0; i < 1500; i++) {
            picker.doWork();
            picker.bonus();
        }


        for (int i = 0; i < 1500; i++) {
            courier.doWork();
            courier.bonus();
        }

        System.out.println("Склад 1 " + warehouse);
        System.out.println(picker.getSalary());
        System.out.println(courier.getSalary());

        Warehouse warehouse1 = new Warehouse();
        Picker picker1 = new Picker(warehouse1);
        Courier courier1 = new Courier(warehouse1);

        picker1.doWork();
        courier1.doWork();

        System.out.println("Склад 2  " + warehouse1);
        System.out.println("Склад 1 " + warehouse);
    }
}
