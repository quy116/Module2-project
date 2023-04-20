package bai_tap_lam_them.quan_ly_cong_viec_map.view;

import bai_tap_lam_them.quan_ly_cong_viec_map.controller.SpendingController;

public class MainMenu {

    public static void main(String[] args) {
        SpendingController spendingController = new SpendingController();
        spendingController.displayMenu();
    }
}
