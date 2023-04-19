package bai_tap_lam_them.quan_ly_cong_viec.repo;

import bai_tap_lam_them.quan_ly_cong_viec.model.Spend;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RepoSpend implements IRepoSpend {
    Scanner sc = new Scanner(System.in);
    public static List<Spend> spendList = new ArrayList<>();
    static {
        Spend spend = new Spend("001","BCS","18/4/2023","100","ngon");
        Spend spend1 = new Spend("002","muc","18/4/2023","500","ngon, bo, suong");
        spendList.add(spend1);
        spendList.add(spend);
    }
    @Override
    public void addSpand(Spend spend) {
        spendList.add(spend);
    }

    @Override
    public boolean deleteSpand(String id) {
        boolean flag = true;
        for (int i = 0; i <spendList.size() ; i++) {
            if (id.equals(spendList.get(i).getId())){
                spendList.remove(i);
                flag = true;
                break;
            }
            flag = false;

        }
        return flag;
    }

    @Override
    public boolean editSpan(String id) {
        boolean check = true;
        for (int i = 0; i < spendList.size(); i++) {
            if (id.equals(spendList.get(i).getId())){
                System.out.println("nhập id vào");
                String inputId = sc.nextLine();
                spendList.get(i).setId(inputId);
                System.out.println("nhập name vào");
                String inputName = sc.nextLine();
                spendList.get(i).setId(inputName);
                System.out.println("nhập ngay  vào");
                String inputDay = sc.nextLine();
                spendList.get(i).setId(inputDay);
                System.out.println("nhập so tien  vào");
                String inputMoney = sc.nextLine();
                spendList.get(i).setId(inputMoney);
                System.out.println("nhập comment vào");
                String inputCmt = sc.nextLine();
                spendList.get(i).setId(inputCmt);
                check = true;
                break;
            }
            check = false;
        }
        return check;
    }

    @Override
    public boolean findIdSpan(String id) {
        return false;
    }

    @Override
    public boolean findNameSpan(String name) {
        return false;
    }

    @Override
    public void display() {
        for (Spend ch:spendList) {
            System.out.println(ch);
        }
    }

}
