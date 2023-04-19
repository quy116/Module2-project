package bai_tap_lam_them.quan_ly_cong_viec.repo;

import bai_tap_lam_them.quan_ly_cong_viec.model.Spend;

import java.util.List;

public interface IRepoSpend {
    void addSpand(Spend spend);
    boolean deleteSpand(String id);
    boolean editSpan(String id);
    boolean findIdSpan(String id);
    boolean findNameSpan(String name);
    void display();
}
