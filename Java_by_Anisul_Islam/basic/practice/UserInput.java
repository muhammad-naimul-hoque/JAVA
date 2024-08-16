
//Assignmet-3
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        int id;
        String title;
        String price;
        String description;
        String category;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a id: ");
        id = input.nextInt();
        System.out.print("Enter a title: ");
        title = input.nextLine();
        System.out.print("Enter a price: ");
        price = input.nextLine();
        System.out.print("Enter description: ");
        description = input.nextLine();
        System.out.print("Enter category: ");
        category = input.nextLine();

        System.out.println("\nid: " + id);
        System.out.println("title: " + title);
        System.out.println("price: " + price);
        System.out.println("description: " + description);
        System.out.println("category: " + category);

    }
}
/*
 * Assignment-3 (User Input)
 * step 1: create a class called Product
 * step 2: create a main method
 * step 3: declare variables: id, title, price, description, category
 * step 4: get user input for each variables
 * step 5: print the variables
 */
