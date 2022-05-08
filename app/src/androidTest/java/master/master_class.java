package master;

public class master_class {
    int roll;
    String name;

    public master_class(String a, int r) {
        this.name = a;
        this.roll=r;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }
}
