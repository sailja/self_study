/**
 * Problem Statement: Display a Menu of food items and calculate the total bill based on the food items picked and the quantity
 */
import java.util.Scanner;
class Menu {
    public static void main(String[] args) {

        int quantity = 0, total = 0, rate = 0;
        boolean condition = true;
        String foodItem = null;
        Scanner sc = new Scanner(System.in);

        while(condition) {

            // Displaying the menu
            System.out.println("--------------MENU-----------------");
            System.out.println("1. Dosa     --Rs 30");
            System.out.println("2. Samosa   --Rs 10");
            System.out.println("3. Bada     --Rs 10");
            System.out.println("4. Idli     --Rs 15");
            System.out.println("5. Uttapam --Rs 30");
            System.out.println("6. Upma     --Rs 30");
            System.out.println("7. Uppam    --Rs 20");
            System.out.println("8. Veg-chop --Rs 10");
            System.out.println("9. Patties  --Rs 20");
            System.out.println("10. Maggi   --Rs 30");
            System.out.println("-----------------------------------");
            System.out.println("Enter 0 to exit and calculate.");

            System.out.println("Enter your choice:");

            // Cleaning the buffer if anything else entered other than Integer
            if(!sc.hasNextInt()) {
                System.out.println("The data entered is not a valid input for the condition.\nPlease enter again.\n\n");
                sc.next();
                continue;
            }
            switch(sc.nextInt()) {
                case 1:
                    foodItem = "Dosa";
                    rate = 30;
                    break;

                case 2:
                    foodItem = "Samosa";
                    rate = 10;
                    break;

                case 3:
                    foodItem = "Bada";
                    rate = 10;
                    break;

                case 4:
                    foodItem = "Idli";
                    rate = 15;
                    break;

                case 5:
                    foodItem = "Uttapam";
                    rate = 30;
                    break;

                case 6:
                    foodItem = "Upma";
                    rate = 30;
                    break;

                case 7:
                    foodItem = "Uppam";
                    rate = 20;
                    break;

                case 8:
                    foodItem = "Veg-chop";
                    rate = 10;
                    break;

                case 9:
                    foodItem = "Patties";
                    rate = 20;
                    break;

                case 10:
                    foodItem = "Maggi";
                    rate = 30;
                    break;

                case 0:
                    condition = false;
                    continue;

                default:
                    System.out.println("The choice made is not a valid choice. \nPlease enter again.\n\n");
                    continue;
            }

            System.out.println("The item chosen is: " + foodItem);
            System.out.println("Enter the number of this item you need: ");

            // Cleaning the buffer if anything else entered other than Integer
            if (! sc.hasNextInt()) {
                System.out.println("The choice made is not a valid choice. \nPlease enter again.\n\n");
                sc.next();
                continue;
            }    
            quantity = sc.nextInt();
            total += (rate * quantity);
            System.out.println("The total right now is: Rs" + total);
        }

        System.out.println("The total is: Rs" + total);
        sc.close();
    }
}
