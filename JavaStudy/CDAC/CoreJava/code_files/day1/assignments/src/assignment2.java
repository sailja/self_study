/**
 * Problem Statement: Accept two numbers as input from the command line and display the average.    
 */
class Average {
    public static void main(String[] args) {
        if(args.length < 2) {
            System.out.println("You've not entered appropriate number of inputs. \nExiting the program execution.");
            System.exit(0);
        }
        double average = (Double.parseDouble(args[0]) + Double.parseDouble(args[1])) / 2;
        System.out.println("The average is: " + average);
    }
}