package org.example;

public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();

        long price = 12_000;
        boolean registered = true;

        long bonus = service.calculate(price, registered);

        System.out.println((int)bonus);
    }
}