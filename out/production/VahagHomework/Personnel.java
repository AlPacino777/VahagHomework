/*
Персонал имеет имя,фамилию, должность и стаж.
Могут ухаживать за животными  и здороваться на трех языках.

 */
public class Personnel {
    private String name;
    private String surname;
    private String position;

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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    private int experience;

    void canCareOfAnimals() {
        System.out.println("Personnel can care of animals");
    }

    void canGreet() {
        System.out.println("Personnel can say Hello in three languages");
    }
}
