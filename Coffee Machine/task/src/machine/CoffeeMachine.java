package machine;
import java.util.*;

public class CoffeeMachine {

    public static void main(String[] args) {
        String input;
        Scanner sc = new Scanner(System.in);
        int[] coffeeMachine = {400, 540, 120, 9, 550};                   // water, milk, coffee, cups, money

        boolean running = true;
        showSupply(coffeeMachine);
        System.out.println("Write action (buy, fill, take):");
        while (running) {
            try{
                input = sc.nextLine();
            }
            catch (NoSuchElementException noSuchElementException){
                System.out.println(noSuchElementException);
                break;
            }
            switch (input) {
                case "buy" :
                    buy(coffeeMachine);
                    showSupply(coffeeMachine);
                    break;
                case "fill" :
                    fill(coffeeMachine);
                    showSupply(coffeeMachine);
                    break;
                case "take" :
                    take(coffeeMachine);
                    showSupply(coffeeMachine);
                    break;
                default: System.out.println("NoSuchEntryFound");
            }
        }
    }
    public static void showSupply(int arr[]) {
        System.out.println("The coffee machine has:");
        System.out.println(arr[0] + " of water");
        System.out.println(arr[1] + " of milk");
        System.out.println(arr[2] + " of coffee beans");
        System.out.println(arr[3] + " of disposable cups");
        System.out.println(arr[4] + " of money");
        System.out.println();
    }

    public static void buy(int arr[]) {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        Scanner scanner = new Scanner(System.in);
        switch (scanner.nextInt()) {
            case 1 :
                if (arr[0] < 250) {
                    System.out.println("Sorry, not enough water!");
                    break;
                }
                if (arr[2] < 16) {
                    System.out.println("Sorry, not enough coffee beans!");
                    break;
                }
                if (arr[3] < 1) {
                    System.out.println("Sorry, not enough cups!");
                    break;
                }
                System.out.println("I have enough resources, making you a coffee!");
                arr[0] -= 250;
                arr[2] -= 16;
                arr[3] -= 1;
                arr[4] += 4;

                break;
            case 2 :
                if (arr[0] < 350) {
                    System.out.println("Sorry, not enough water!");
                    break;
                }
                if (arr[0] < 75) {
                    System.out.println("Sorry, not enough milk!");
                    break;
                }
                if (arr[2] < 20) {
                    System.out.println("Sorry, not enough coffee beans!");
                    break;
                }
                if (arr[3] < 1) {
                    System.out.println("Sorry, not enough cups!");
                    break;
                }
                System.out.println("I have enough resources, making you a coffee!");
                arr[0] -= 350;
                arr[1] -= 75;
                arr[2] -= 20;
                arr[3] -= 1;
                arr[4] += 7;
                break;
            case 3 :
                if (arr[0] < 200) {
                    System.out.println("Sorry, not enough water!");
                    break;
                }
                if (arr[0] < 200) {
                    System.out.println("Sorry, not enough milk!");
                    break;
                }
                if (arr[2] < 12) {
                    System.out.println("Sorry, not enough coffee beans!");
                    break;
                }
                if (arr[3] < 1) {
                    System.out.println("Sorry, not enough cups!");
                    break;
                }
                System.out.println("I have enough resources, making you a coffee!");
                arr[0] -= 200;
                arr[1] -= 100;
                arr[2] -= 12;
                arr[3] -= 1;
                arr[4] += 6;

                break;
            default :
                break;
        }
    }

    public static void fill(int arr[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water do you want to add:");
        arr[0] += scanner.nextInt();
        System.out.println("Write how many ml of milk do you want to add:");
        arr[1] += scanner.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add:");
        arr[2] += scanner.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add:");
        arr[3] += scanner.nextInt();

    }

    public static void take(int arr[]) {
        System.out.println("I gave you $" + arr[4]);
        arr[4] = 0;
        System.out.println();
    }
}