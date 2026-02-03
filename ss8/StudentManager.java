package ss8;

public class StudentManager {
    private Student[] students;
    private int count;

    public StudentManager(int size) {
        students = new Student[size];
        count = 0;
    }

    public boolean addStudent(Student s) {
        if (count == students.length)
            return false;

        for (int i = 0; i < count; i++) {
            if (students[i].getId().equals(s.getId()))
                return false;
        }

        students[count] = s;
        count++;
        return true;
    }

    public void displayAll() {
        if (count == 0) {
            System.out.println("Danh sách trống!");
            return;
        }

        for (int i = 0; i < count; i++) {
            students[i].display();
        }
    }

    public Student findById(String id) {
        for (int i = 0; i < count; i++) {
            if (students[i].getId().equalsIgnoreCase(id))
                return students[i];
        }
        return null;
    }

    public void searchByName(String name) {
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (students[i].getName().toLowerCase().contains(name.toLowerCase())) {
                students[i].display();
                found = true;
            }
        }

        if (!found)
            System.out.println("Không tìm thấy sinh viên!");
    }

    public boolean updateStudent(String id, String name, int age,
                                 double math, double physics, double chemistry) {
        Student s = findById(id);
        if (s == null)
            return false;

        s.setName(name);
        s.setAge(age);
        s.setMath(math);
        s.setPhysics(physics);
        s.setChemistry(chemistry);
        return true;
    }

    public boolean deleteById(String id) {
        for (int i = 0; i < count; i++) {
            if (students[i].getId().equalsIgnoreCase(id)) {
                for (int j = i; j < count - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[count - 1] = null;
                count--;
                return true;
            }
        }
        return false;
    }

    public void sortByAverageDesc() {
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - 1 - i; j++) {
                if (students[j].getAverage() < students[j + 1].getAverage()) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }

    public void statistics() {
        int gioi = 0, kha = 0, tb = 0, yeu = 0;
        double max = students[0].getAverage();
        double min = students[0].getAverage();

        for (int i = 0; i < count; i++) {
            double avg = students[i].getAverage();
            String rank = students[i].getRank();

            if (rank.equals("Giỏi")) gioi++;
            else if (rank.equals("Khá")) kha++;
            else if (rank.equals("Trung bình")) tb++;
            else yeu++;

            if (avg > max) max = avg;
            if (avg < min) min = avg;
        }

        System.out.println("Giỏi: " + gioi);
        System.out.println("Khá: " + kha);
        System.out.println("Trung bình: " + tb);
        System.out.println("Yếu: " + yeu);
        System.out.println("Điểm cao nhất: " + max);
        System.out.println("Điểm thấp nhất: " + min);
    }

}
