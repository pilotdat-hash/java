package ss7.Btth;

public class Student {
    private int id;
    private String name;
    public static final String schoolName = "ptit";
    private static int studentCount = 0;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        studentCount++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getStudentCount() {
        return studentCount;
    }

    public static void setStudentCount(int studentCount) {
        Student.studentCount = studentCount;
    }
    public void display(){
        System.out.println("-----------------------");
        System.out.println("id: "+id);
        System.out.println("name :"+name);
        System.out.println("schoolName : "+schoolName);
        System.out.println("-----------------------");

    }
    public static void showTotalStudent(){
        System.out.println("total students: "+studentCount);
    }






}

