/*
Посетители имеют национальность, детей, имя, фамилию могут говорить, платить и гулять
 */
public class Visitor {
    private String nationality;
    private int amountOfChildren;
    private String name;
    private String surname;

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getAmountOfChildren() {
        return amountOfChildren;
    }

    public void setAmountOfChildren(int amountOfChildren) {
        this.amountOfChildren = amountOfChildren;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    void canTalk() {
        System.out.println("visitors can talk");
    }

    void canPay() {
        System.out.println("visitors can pay");
    }

    void canWalk() {
        System.out.println("visitors can walk");
    }
}
