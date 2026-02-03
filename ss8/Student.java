package ss8;

public class Student {
    private String id;
    private String name;
    private int age;
    private String gender;
    private double math;
    private double physics;
    private double chemistry;

    public Student(String id, String name, int age, String gender,
                   double math, double physics, double chemistry) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.math = math;
        this.physics = physics;
        this.chemistry = chemistry;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getAverage() {
        return (math + physics + chemistry) / 3;
    }

    public String getRank() {
        double avg = getAverage();

        if (avg >= 8 && math >= 6.5 && physics >= 6.5 && chemistry >= 6.5)
            return "Giỏi";
        if (avg >= 6.5 && math >= 5 && physics >= 5 && chemistry >= 5)
            return "Khá";
        if (avg >= 5 && math >= 3.5 && physics >= 3.5 && chemistry >= 3.5)
            return "Trung bình";
        return "Yếu";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMath(double math) {
        this.math = math;
    }

    public void setPhysics(double physics) {
        this.physics = physics;
    }

    public void setChemistry(double chemistry) {
        this.chemistry = chemistry;
    }

    public void display() {
        System.out.printf(
                "ID: %s | Tên: %s | Tuổi: %d | Giới tính: %s | TB: %.2f | Xếp loại: %s%n",
                id, name, age, gender, getAverage(), getRank()
        );
    }
}
