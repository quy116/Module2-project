package bai_tap_lam_them.quan_ly_cong_viec_map.service;

import bai_tap_lam_them.quan_ly_cong_viec_map.model.Spending;
import bai_tap_lam_them.quan_ly_cong_viec_map.repository.SpendingRepository;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class SpendingService implements ISpendingService{
    Scanner scanner = new Scanner(System.in);
    SpendingRepository spendingRepository = new SpendingRepository();
    @Override
    public void addSpendingService() {
        //String spendingCode, String spendingName, String spendingDate, String spendingMoney, String spendingComment
        System.out.println("Enter Spending Code");
        String spendingCode = scanner.nextLine();

        System.out.println("Enter Spending Name");
        String spendingName = scanner.nextLine();

        System.out.println("Enter Spending Date");
        String spendingDate = scanner.nextLine();

        System.out.println("Enter Spending Money");
        String spendingMoney = scanner.nextLine();

        System.out.println("Enter Spending Comment");
        String spendingComment = scanner.nextLine();

        Spending spending = new Spending(spendingCode,spendingName,spendingDate,spendingMoney,spendingComment);
        spendingRepository.addSpendingRepository(spending);
        System.out.println(spending);
    }

    @Override
    public void editSendingService() {

    }

    @Override
    public void deleteSpendingService() {

    }

    @Override
    public void displaySpendingService() {
        Map<String,Spending> spendingMap = spendingRepository.displaySpendingRepository();
        Set<String>set = spendingMap.keySet();
        for (String key:set) {
            System.out.println(key + ";"+ spendingMap.get(key));
        }
    }

    @Override
    public void searchByNameService() {

    }
}
