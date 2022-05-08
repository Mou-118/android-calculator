package branch;

public class Sample_Branch_From_B1 {
    String name, id;
    float cgpa;
     int number_of_classes;
    public Sample_Branch_From_B1(String name, String id , float cgpa,int number_of_classes) {

        this.name = name;
        this.id=id;
        this.cgpa=cgpa;
        this.number_of_classes=number_of_classes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getCgpa() {
        return cgpa;
    }

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }

    public int getNumber_of_classes() {
        return number_of_classes;
    }

    public void setNumber_of_classes(int number_of_classes) {
        this.number_of_classes = number_of_classes;
    }
}
