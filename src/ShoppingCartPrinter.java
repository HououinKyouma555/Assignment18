import java.util.Scanner;

public class ShoppingCartPrinter {
    public static void main(String[] args) throws Exception {
        ItemToPurchase item1 = new ItemToPurchase();
        ItemToPurchase item2 = new ItemToPurchase();

        Scanner scnr = new Scanner(System.in);
        
        System.out.println("Item 1:");
        System.out.println("Enter item name:");
        item1.setName(scnr.nextLine());
        System.out.println("Enter item price:");
        item1.setPrice(scnr.nextInt());
        System.out.println("Enter item quantity:");
        item1.setQuantity(scnr.nextInt());
        scnr.nextLine();

        System.out.println("Item 2:");
        System.out.println("Enter item name:");
        item2.setName(scnr.nextLine());
        System.out.println("Enter item price:");
        item2.setPrice(scnr.nextInt());
        System.out.println("Enter item quantity:");
        item2.setQuantity(scnr.nextInt());

        scnr.close();

        System.out.println("TOTAL COST");
        System.out.println(item1.getName() + " " + item1.getQuantity() + " @ $" + item1.getPrice() + " = $" + item1.getQuantity()*item1.getPrice());
        System.out.println(item2.getName() + " " + item2.getQuantity() + " @ $" + item2.getPrice() + " = $" + item2.getQuantity()*item2.getPrice());
        System.out.println("\nTOTAL: $" + (item1.getPrice()*item1.getQuantity() + item2.getQuantity()*item2.getPrice()));
    }
}
