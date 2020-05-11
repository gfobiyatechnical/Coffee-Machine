package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public void espresso(){
        int water = 250;
        int coffeeBeans = 16;
        int cost = 4;

    }
    public void latte(){
        int milk = 75;
        int water = 350;
        int cost = 7;
        int coffeeBeans = 12;

    }
    public void cappuccino(){
        int milk = 100;
        int water = 200;
        int coffeeBeans = 12;
        int cost = 6;

    }
    public void latte(){
        int coffee = 250;
        int water = 16;
        int cost = 4;

    }
}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //amount of each ingredient per one cup
        System.out.println("The coffee machine has:\n400 of water\n540 of milk\n120 of coffee beans\n9 of disp\n");
        System.out.println("Write action (buy, fill, take):");
        String input = scanner.next();
        switch (input){
            case "take": System.out.println("I gave you $550\n\nThe coffee machine has:\n400 of water\n540 of milk\n120 of coffee beans\n9 of disposable cups\n0 of money");
                break;
            case "fill": System.out.println("");
                break;
            case "buy": System.out.println("");
                break;
            default: System.out.println("");
    }
}