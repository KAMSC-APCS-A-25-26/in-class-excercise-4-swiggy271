import java.util.Scanner;
import java.text.DecimalFormat;
public class ShoppingCart {
    public static void main(String[] args) {
        // TODO: Ask the user how many items they are purchasing
        // TODO: Use a for loop to read each item's price (double)
        // TODO: Accumulate the total cost
        // TODO: Print the final summary line with item count and total
        // TODO: Use Scanner for input

        int numItems;
        double input, priceTotal;
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        priceTotal = 0;
        System.out.print("How many items are you purchasing? ");
        numItems = sc.nextInt();

        for(int i = 0; i < numItems; i++)
        {
            System.out.print("\nPrice of item" + i + "? ");
            priceTotal += sc.nextDouble();
        }

        System.out.print("Your cart has " + numItems + " with a total cost of $" + priceTotal);
    }
}
