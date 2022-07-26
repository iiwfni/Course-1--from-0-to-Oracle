package ClassWork.Lessons_1_per_9.L5_Methods;

public class HumanReference {
    String name;
    Car_3 car;
    Bank_Account bA;
    void showInfo() {
        System.out.println("Name: " + name + ", car color: " + car.color + ", bank balance: " + bA.balance);
    }
}

class HumanTest {
    public static void main(String[] args) {
        HumanReference h = new HumanReference();
        h.name = "Artur";
        h.car = new Car_3("White", "V16");
        h.bA = new Bank_Account(3, 1000);

        h.showInfo();
    }
}

class Car_3 {
    Car_3(String colorSet, String engineSet) {
        color = colorSet;
        engine = engineSet;
    }
    String color;
    String engine;
}

class Bank_Account {
    Bank_Account(int idSet, double balanceSet) {
        id = idSet;
        balance = balanceSet;
    }
    int id;
    double balance;
}