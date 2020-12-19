/*
Зоопарк имеет название, площадь, посетителей , животных и персонал.
 */
public class LessonThreeExTwo {
    public static void main(String[] args) {
        LessonThreeExTwo zoo = new LessonThreeExTwo();
        zoo.setName("Kendanabanakan aygi");
        System.out.println(zoo.getName());

    }

    private String name;
    private double area;
    private Visitor visitor;
    private Animal animal;
    private Personnel personnel;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public Visitor getVisitor() {
        return visitor;
    }

    public void setVisitor(Visitor visitor) {
        this.visitor = visitor;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Personnel getPersonnel() {
        return personnel;
    }

    public void setPersonnel(Personnel personnel) {
        this.personnel = personnel;
    }



}
