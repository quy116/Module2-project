package bai_tap_lam_them.quan_ly_cong_viec.model;

public class Spend {
    String id;
    String name;
    String day;
    String money;
    String comment;

    public Spend() {
    }

    public Spend(String id, String name, String day, String money, String comment) {
        this.id = id;
        this.name = name;
        this.day = day;
        this.money = money;
        this.comment = comment;
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

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Spend{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", day='" + day + '\'' +
                ", money='" + money + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }
}
