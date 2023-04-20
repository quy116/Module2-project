package bai_tap_lam_them.quan_ly_cong_viec_map.controller;

import bai_tap_lam_them.quan_ly_cong_viec_map.service.SpendingService;

import java.util.Scanner;

public class SpendingController {
    SpendingService sendingService = new SpendingService();
    Scanner scanner = new Scanner(System.in);
     public void displayMenu(){
         boolean check = true;
         do {
             System.out.println("1. Spending Manager \n" +
                     "2. Exit \n" +
                     "Enter your choice:");
             int n = Integer.parseInt(scanner.nextLine());
             switch (n){
                 case 1:
                     sendingManager();
                     break;
                 case 2:
                     check = false;
                     break;
                 default:
                     System.out.println("Enter your choice again");
                     break;
             }

         }while (check);

     }
    public void sendingManager(){
         boolean check = true;
         do {
             System.out.println("1. Display Spending List \n" +
                     "2. Add Spending \n" +
                     "3. Edit Spending \n" +
                     "4. Delete Spending \n" +
                     "5. Search By Name \n" +
                     "6. Search By Amount Spent \n" +
                     "7. Sort By Name \n" +
                     "8. Sort By Amount Spent \n" +
                     "9. Return Menu \n" +
                     "Enter your Choice");
             int n = Integer.parseInt(scanner.nextLine());
             switch (n){
                 case 1:
                     sendingService.displaySpendingService();
                     break;
                 case 2:
                     sendingService.addSpendingService();
                     break;
                 case 3:
                     break;
                 case 4:
                     break;
                 case 5:
                     break;
                 case 6:
                     break;
                 case 7:
                     break;
                 case 8:
                     break;
                 case 9:
                     check = false;
                     break;
                 default:
                     System.out.println("Enter your choice again");
             }
         }while (check);
    }
}
