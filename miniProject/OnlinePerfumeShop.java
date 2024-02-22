package miniProject;

import java.lang.*;
import java.util.*;

class CollectCustomerInformation {
    String name;
    String address;
    String contactNumber;
    String emailId;

    public CollectCustomerInformation(String name, String address, String contactNumber, String emailId) {
        this.name = name;
        this.address = address;
        this.contactNumber = contactNumber;
        this.emailId = emailId;
    }

    public void displayCustomerDetailsAndBillInformation(ArrayList<Integer> selectedItems) {

        System.out.println("\n"+"___The Royal Perfume Club___");
        System.out.println("   - : Customer Details :- ");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Contact Information: " + contactNumber + ", " + emailId);

        System.out.println("\n--- Bill Information ---"); // Print bill information header
        System.out.printf("%-30s%-10s%-10s%-10s\n", "Perfume", "Price", "Quantity", "Total");

        double totalPrice = 0.0;

        for (Integer itemId : selectedItems) {
            String itemName = getItemName(itemId);
            double itemPrice = getItemPrice(itemId);
            int quantity = 1; // For simplicity, assuming each item is purchased only once
            double total = itemPrice * quantity;

            System.out.printf("%-30s$%-10.2f%-10d$%-10.2f\n", itemName, itemPrice, quantity, total); // printing the item details ..

            totalPrice += total;
        }
        System.out.println("\nTotal: $" + totalPrice); // printing the total Amount ..
    }

    // Method to get the name of the item based on its ID
    private String getItemName(int itemId) { // Implement logic to retrieve item name based on ID
        switch (itemId) {
            case 1: return "Royal Oud by Creed"; case 2: return "Amber Aoud by Roja Parfums"; case 3: return "Noir de Noir by Tom Ford";
            case 4: return "Mon Guerlain by Guerlain"; case 5: return "Flowerbomb by Viktor & Rolf"; case 6: return "Oud Wood by Tom Ford";
            case 7: return "Sauvage by Dior"; case 8: return "Black Opium by Yves Saint Laurent"; case 9: return "Acqua di Gio by Giorgio Armani";
            case 10: return "Coco Mademoiselle by Chanel"; default: return "Unknown Perfume";
        }
    }
    // Method to get the price of the item based on its ID
    private double getItemPrice(int itemId) { // Implement logic to retrieve item price based on ID
        switch (itemId) {
            case 1: return 100.0; case 2: return 400.0; case 3: return 150.0;
            case 4: return 50.0; case 5: return 250.0; case 6: return 300.0;
            case 7: return 120.0; case 8: return 210.0; case 9: return 20.0;
            case 10: return 250.0; default: return 0.0;
        }
    }
    public void generateBillInformation(ArrayList<Integer>selecteditems){
        double totalPrice = 0.0;
        for(int i = 0 ; i < selecteditems.size(); i ++){
            int items = selecteditems.get(i);
            switch (items){
                case 1: System.out.println("Royal Oud by Creed : $ 100"); totalPrice+= 100;break;
                case 2: System.out.println("Amber Aoud by Roja Parfums : $ 400 "); totalPrice+= 400;break;
                case 3: System.out.println("Noir de Noir by Tom Ford : $ 150"); totalPrice+=150;break;
                case 4: System.out.println("Mon Guerlain by Guerlain : $ 50"); totalPrice+=50;break;
                case 5: System.out.println("Flowerbomb by Viktor & Rolf : $ 250"); totalPrice+= 250;break;
                case 6: System.out.println("Oud Wood by Tom Ford : $ 300"); totalPrice+=300;break;
                case 7: System.out.println("Sauvage by Dior : $ 120"); totalPrice+=120;break;
                case 8: System.out.println("Black Opium by Yves Saint Laurent : $ 210"); totalPrice+=210;break;
                case 9: System.out.println("Acqua di Gio by Giorgio Armani : $ 20"); totalPrice+=20;break;
                case 10: System.out.println("Coco Mademoiselle by Chanel : $ 250"); totalPrice+=250;break;
                default: System.out.println("default value"); totalPrice+=0;
            }
        }
        System.out.println("Total : $"+totalPrice);
    }
}

class GenerateLuckyNumbers {
    public List<Integer>generateLuckyNumbers(ArrayList<Integer> luckyNumbers, int num){
        List<Integer> numbers = new ArrayList<Integer>();
        Random random = new Random();
        for (int i = 0 ; i < num ; i ++){
            int randomNumberIndex = random.nextInt(luckyNumbers.size());
            numbers.add(luckyNumbers.get(randomNumberIndex));
            luckyNumbers.remove(randomNumberIndex);
        }
        return numbers ;
    }

    /* this method will check whether the guessed number is matched with the lucky numbers or not  */
    public void checkResult(ArrayList<Integer> checkLuckynumbers, int numberOfPrice, int numberGuesedByCustomer) {
        int firstLuckyNumber = checkLuckynumbers.get(0);
        int secondLuckyNumber = checkLuckynumbers.get(1);
        int thirdLuckyNumber = checkLuckynumbers.get(2);

        if (numberGuesedByCustomer == firstLuckyNumber) {
            if (numberGuesedByCustomer == secondLuckyNumber && numberGuesedByCustomer == thirdLuckyNumber) {
                System.out.println("Congratulations! You've won the first prize.");
            } else if (numberGuesedByCustomer == secondLuckyNumber || numberGuesedByCustomer == thirdLuckyNumber) {
                System.out.println("Congratulations! You've won the second prize.");
            } else {
                System.out.println("Congratulations! You've won the third prize.");
            }
        } else if (numberGuesedByCustomer == secondLuckyNumber) {
            if (numberGuesedByCustomer == thirdLuckyNumber) {
                System.out.println("Congratulations! You've won the second prize.");
            } else {
                System.out.println("Congratulations! You've won the third prize.");
            }
        } else if (numberGuesedByCustomer == thirdLuckyNumber) {
            System.out.println("Congratulations! You've won the third prize.");
        } else {
            System.out.println("Sorry, you guessed the wrong lucky number.");
            System.out.println("Thank you for visiting our shop.");
        }
    }
}

public class OnlinePerfumeShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CollectCustomerInformation customer1 = new CollectCustomerInformation("ryan Belfort","123 Sheikh Zayed Road\n" +
                "Dubai, United Arab Emirates","101*****43","ryan*****@gmail.com");

        int numberOfAvailableItems = 10;

        System.out.println("~~~~~Welcome To The Royal Perfume Club~~~~~");
        System.out.println("~~~~~~Our Collections~~~~~~ : ");
        System.out.println("1 . Royal Oud by Creed : $ 100 \n" +
                "2 . Amber Aoud by Roja Parfums : $ 400  \n" +
                "3 . Noir de Noir by Tom Ford : $ 150 \n" +
                "4 . Mon Guerlain by Guerlain : $ 50 - $ 100 \n" +
                "5 . Flowerbomb by Viktor & Rolf : $ 250 \n" +
                "6 . Oud Wood by Tom Ford : $ 300 \n" +
                "7 . Sauvage by Dior : $ 120 \n" +
                "8 . Black Opium by Yves Saint Laurent : $ 210 \n" +
                "9 . Acqua di Gio by Giorgio Armani : $ 20 \n" +
                "10. Coco Mademoiselle by Chanel : $ 250 \n");

        System.out.println("How Many items you want to buy : ");
        int num = scanner.nextInt();

        List<Integer> numberOfItems = new ArrayList<Integer>();
        for (int i = 1; i <= num; i++) {
            System.out.print("Enter perfume ID " + i + ": ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a valid integer.");
                System.out.print("Enter perfume ID " + i + ": ");
                scanner.next(); // consume the invalid input
            }
            int perfumeId = scanner.nextInt();
            numberOfItems.add(perfumeId);
        }

        System.out.println("You have selected these items: " + numberOfItems);
        System.out.println("Kindly review your purchase list: Do you need to make any changes? Enter 'Yes' or 'No'.");
        String answer = scanner.next().toLowerCase();

        while (!answer.equals("yes") && !answer.equals("no")) {
            System.out.println("Invalid input! Please enter 'Yes' or 'No'.");
            answer = scanner.next().toLowerCase();
        }

        switch (answer) {
            case "yes":
                System.out.println("Please select the perfume ID and provide the ID of the old perfume you wish to replace. Thank you.");
                int newId = scanner.nextInt();
                int oldId = scanner.nextInt();
                /*Assuming numberOfItems is an ArrayList<Integer> containing perfume IDs -> Replace the old ID with the new ID */
                for (int i = 0; i < numberOfItems.size(); i++) {
                    if (numberOfItems.get(i) == oldId) {
                        numberOfItems.set(i, newId);
                        break;
                    }
                }
                System.out.println("Your Modified shopping list : " + numberOfItems);
                break;

            case "no":
                System.out.println("No changes made to the shopping list.");
                System.out.println("Your Shopping list is : " + numberOfItems);
                break;
        }

        /* This method will display the Customer details and the bill information of the customer */
        customer1.displayCustomerDetailsAndBillInformation((ArrayList<Integer>) numberOfItems);

        List<Integer> luckyNumbers = new ArrayList<Integer>(List.of(1,2,3,4,5,6,7,8,9,10));
        GenerateLuckyNumbers generateLuckyNumbers = new GenerateLuckyNumbers(); /* Creating the object of the generateLuckyNumber class */
        List<Integer> generatedLuckyNumbers = generateLuckyNumbers.generateLuckyNumbers((ArrayList<Integer>)luckyNumbers,3); // this will hold the generated lucky numbers from the particular method .

        System.out.println();
        System.out.println("Welcome to the Super Valentine Sale!");
        System.out.println("Guess the right number and win exciting prizes!");
        System.out.println("Mr/Ms :"+customer1.name+" guess the lucky Number :");
        int guessNumber = scanner.nextInt();
        System.out.println("Your lucky Numbers are : ");
        for (int data : generatedLuckyNumbers){     System.out.print(data+" "); }
        System.out.println();
        generateLuckyNumbers.checkResult((ArrayList<Integer>) generatedLuckyNumbers, 3,guessNumber);
    }
}
