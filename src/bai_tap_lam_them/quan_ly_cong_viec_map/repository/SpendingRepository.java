package bai_tap_lam_them.quan_ly_cong_viec_map.repository;

import bai_tap_lam_them.quan_ly_cong_viec_map.model.Spending;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SpendingRepository implements ISpendingRepository{
    Map<String,Spending>spendingMap = new HashMap<>();
    Spending spending = new Spending();


    @Override
    public void editSendingRepository() {

    }

    @Override
    public void deleteSpendingRepository() {

    }

    @Override
    public Map<String, Spending> displaySpendingRepository() {
        return spendingMap;
    }


    @Override
    public void searchByNameRepository() {

    }

    @Override
    public Map<String, Spending> addSpendingRepository(Spending spending) {
        spendingMap.put(spending.getSpendingCode(),spending);
        return spendingMap;
    }
}
