package ss7.ss1;

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student("SV001", "Nguyễn Văn A");
        Student s2 = new Student("SV002", "Trần Thị B");
        Student s3 = new Student("SV003", "Lê Văn C");

        s1.displayInfo();
        System.out.println();

        s2.displayInfo();
        System.out.println();

        s3.displayInfo();
        System.out.println();

        Student.displayTotalStudent();
    }
}
