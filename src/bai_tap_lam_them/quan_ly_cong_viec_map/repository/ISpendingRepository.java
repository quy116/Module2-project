package bai_tap_lam_them.quan_ly_cong_viec_map.repository;

import bai_tap_lam_them.quan_ly_cong_viec_map.model.Spending;

import java.util.Map;

public interface ISpendingRepository {
    void editSendingRepository();
    void deleteSpendingRepository();
   Map<String,Spending>displaySpendingRepository();
    void searchByNameRepository();

    Map<String,Spending> addSpendingRepository(Spending spending);
}
