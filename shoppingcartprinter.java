
import java.util.Scanner;

public class shoppingcartprinter{
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int i = 0;
      String productName;
      int productPrice = 0;
      int productQuantity = 0;
      int cartTotal = 0;
  
      ItemToPurchase item1 = new ItemToPurchase();
      ItemToPurchase item2 = new ItemToPurchase();

      // Get item 1 details from user, create itemToPurchase object
      productName = scnr.nextLine();
      item1.setName(productName);
      System.out.println("Item 1");
      System.out.println("Enter the item name: " + item1.getName());
      productPrice = scnr.nextInt();
      item1.setPrice(productPrice);
      System.out.println("Enter the item price: " + item1.getPrice());
      productQuantity = scnr.nextInt();
      item1.setQuantity(productQuantity);
      System.out.println("Enter the item quantity: " + item1.getQuantity());
      scnr.nextLine();
      
 
      // Get item 2 details from user, create itemToPurchase object
      productName = scnr.nextLine();
      item2.setName(productName);
      System.out.println("Item 1");
      System.out.println("Enter the item name: " + item2.getName());
      productPrice = scnr.nextInt();
      item2.setPrice(productPrice);
      System.out.println("Enter the item price: " + item2.getPrice());
      productQuantity = scnr.nextInt();
      item2.setQuantity(productQuantity);
      System.out.println("Enter the item quantity: " + item2.getQuantity());
      
      
      // Add costs of two items and print total
      // cartTotal = item one price + item two price
      // Totoal Cost
      // item one information
      // item two information
      // Total output
      
      return;
   }
}