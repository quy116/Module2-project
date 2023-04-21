package bai_tap_lam_them.quan_ly_cong_viec_3.repository;

import bai_tap_lam_them.quan_ly_cong_viec_3.model.Person;

import java.util.List;

public interface IPersonRepo {
    void deletePerson(String person);
    void editPerson(String person);
    List<String> displayPerson();

    void addPerson(Person person);
}
