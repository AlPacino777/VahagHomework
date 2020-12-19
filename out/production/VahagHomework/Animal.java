/*
Животные имеют породу, имя, возраст, вес и могут бегать, издавать характерный голос и питаться.
 */
public class Animal {
    private String breed;
    private String name;
    private int age;
    private double weight;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    void canRun() {
        System.out.println("animals can run");
    }

    void toVoice() {
        System.out.println("animals can utter voice");
    }

    void canEat() {
        System.out.println("animals can eat");
    }
}
