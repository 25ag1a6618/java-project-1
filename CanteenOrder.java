import java.util.Scanner;

class Canteen {
    String[] food = {"Burger", "Pizza", "Sandwich", "Juice"};
    int[] price = {50, 100, 40, 30};

    void showMenu() {
        System.out.println("\n--- CANTEEN MENU ---");
        for (int i = 0; i < food.length; i++) {
            System.out.println((i + 1) + ". " + food[i] + " - Rs." + price[i]);
        }
    }

    void order() {
        Scanner sc = new Scanner(System.in);
        int choice, quantity, total = 0;
        char again;

        do {
            showMenu();

            System.out.print("Enter item number: ");
            choice = sc.nextInt();

            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter quantity: ");
                quantity = sc.nextInt();

                total = total + price[choice - 1] * quantity;

                System.out.println(quantity + " " + food[choice - 1]
                        + " added to order.");
            } else {
                System.out.println("Invalid choice!");
            }

            System.out.print("Order another item? (y/n): ");
            again = sc.next().charAt(0);

        } while (again == 'y' || again == 'Y');

        System.out.println("\n--- FINAL BILL ---");
        System.out.println("Total Amount = Rs." + total);
        System.out.println("Thank you! Visit again.");
    }
}

public class CanteenOrder {
    public static void main(String[] args) {
        Canteen c = new Canteen();
        c.order();
    }
}