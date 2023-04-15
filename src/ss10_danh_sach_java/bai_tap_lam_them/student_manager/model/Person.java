package ss10_danh_sach_java.bai_tap_lam_them.student_manager.model;

public class Person {
    String id;
    String name;
    String date;
    String sex;

    public Person(String id, String name, String date, String sex) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.sex = sex;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
