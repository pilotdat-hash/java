package ss7.ss1;

public class Student {
    private String id;
    private String name;

    public static int totalStudent = 0;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
        totalStudent++;
    }

    public void displayInfo() {
        System.out.println("Mã SV: " + id);
        System.out.println("Tên SV: " + name);
    }

    public static void displayTotalStudent() {
        System.out.println("Tổng số sinh viên đã tạo: " + totalStudent);
    }
}
