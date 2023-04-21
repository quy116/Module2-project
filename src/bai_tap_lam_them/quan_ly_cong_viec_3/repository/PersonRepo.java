package bai_tap_lam_them.quan_ly_cong_viec_3.repository;

import bai_tap_lam_them.quan_ly_cong_viec_3.model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonRepo implements IPersonRepo {
    Scanner sc = new Scanner(System.in);
    static ArrayList<Person> personList = new ArrayList<>();

    static {
        Person person = new Person("cao", "35", "Nam");
        personList.add(person);
    }

    @Override
    public void deletePerson(String person) {
        System.out.println(personList);
        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i).getName().equals(person)) {
                personList.remove(i);
            }
        }
    }

    @Override
    public void editPerson(String person) {
        System.out.println(personList);
        boolean check = true;
        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i).getName().equals(person)) {
                if (personList.get(i).getName().equals(person)) {
                    do {
                        System.out.println("bạn muốn thay đổi cái nào \n" +
                                "1. tên\n" +
                                "2. tuổi \n" +
                                "3. giới tính \n" +
                                "0 thoát khỏi");
                        String input = sc.nextLine();
                        switch (input) {
                            case "1":
                                System.out.println("nhập tên");
                                String inputName = sc.nextLine();
                                personList.get(i).setName(inputName);
                                break;
                            case "2":
                                System.out.println("nhập tuổi");
                                String inputAge = sc.nextLine();
                                personList.get(i).setAge(inputAge);
                                break;
                            case "3":

                                System.out.println("nhập giới tính");
                                String inputGender = sc.nextLine();
                                personList.get(i).setGender(inputGender);
                                break;
                            case "0":
                                check = false;
                                break;
                            default:
                                System.out.println("nhập không đúng");
                                break;
                        }
                    } while (check);
                } else {
                    System.out.println("không có đối tượng");
                }
            }
        }
    }

    @Override
    public List<String> displayPerson() {
        for (Person e : personList) {
            System.out.println(e);
        }
        return null;
    }

    @Override
    public void addPerson(Person person) {

        personList.add(person);
    }
}
