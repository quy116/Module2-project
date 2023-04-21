package bai_tap_lam_them.quan_ly_cong_viec_3.service;

import bai_tap_lam_them.quan_ly_cong_viec_3.model.Person;
import bai_tap_lam_them.quan_ly_cong_viec_3.repository.PersonRepo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonSv implements IPersonSv {
    PersonRepo personRepo = new PersonRepo();
    Scanner sc = new Scanner(System.in);

    @Override
    public void addPerson() {
        List<String> list = personRepo.displayPerson();

        System.out.println("nhập tên vào");
        String inputName = sc.nextLine();

        System.out.println("nhập tuổi vào");
        String inputAge = sc.nextLine();

        System.out.println("nhập giới tính vào");
        String inputGender = sc.nextLine();
        Person person = new Person(inputName, inputAge, inputGender);
        try {

                if (list.get(Integer.parseInt(inputName))== null){
                    personRepo.addPerson(person);
            }
        } catch (Exception e) {
            System.err.println("da ton tai");;
        }


    }

    @Override
    public void deletePerson() {
        System.out.println("nhập name muốn xoá");
        String inputName = sc.nextLine();
        personRepo.deletePerson(inputName);

    }

    @Override
    public void editPerson() {
        System.out.println("nhập tên muốn đôi tượng bạn muốn thay đổi");
        String inputName = sc.nextLine();
        personRepo.editPerson(inputName);

    }

    @Override
    public void displayPerson() {
        personRepo.displayPerson();

    }
}
