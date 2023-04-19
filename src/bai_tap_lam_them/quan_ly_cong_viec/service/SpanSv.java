package bai_tap_lam_them.quan_ly_cong_viec.service;

import bai_tap_lam_them.quan_ly_cong_viec.model.Spend;
import bai_tap_lam_them.quan_ly_cong_viec.repo.RepoSpend;

import java.util.Scanner;

import static bai_tap_lam_them.quan_ly_cong_viec.repo.RepoSpend.spendList;

public class SpanSv implements ISpendSv {
    Scanner sc = new Scanner(System.in);
    RepoSpend repoSpend = new RepoSpend();

    @Override
    public void deleteSpand() {
        System.out.println("nhập ID vào để xoá ");
        String inputID = sc.nextLine();
        boolean check = repoSpend.deleteSpand(inputID);
        if (check) {
            System.out.println("bạn xoá thành công");
        } else {
            System.out.println("tìm không thấy");
        }
    }

    @Override
    public void editSpan() {
        System.out.println("nhập id để tìm sửa ");
        String inputId = sc.nextLine();
        boolean check = repoSpend.editSpan(inputId);
        if (check) {
            System.out.println("bạn đã sửa thabhf công");
        } else{
            System.out.println("không tìm thấy");
        }
    }


    @Override
    public void findIdSpan() {

    }



    @Override
    public void findNameSpan() {

    }

    @Override
    public void inputSpand() {
        System.out.println("nhập mã vào");
        String inputId = sc.nextLine();
        System.out.println("nhập name vào");
        String inputName = sc.nextLine();
        System.out.println("nhập ngày chi tiêu vào");
        String inputDay = sc.nextLine();
        System.out.println("nhập số tiền chi tiêu vào");
        String inputMoney = sc.nextLine();
        System.out.println("nhập comment vào");
        String inputComment = sc.nextLine();
        Spend spend = new Spend(inputId, inputName, inputDay, inputMoney, inputComment);
        repoSpend.addSpand(spend);
        ;
    }

    @Override
    public void display() {
        repoSpend.display();
    }
}
