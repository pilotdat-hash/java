package HN_KS24_CNTT5_PhamTienDat_BtthSs8;

public class Student{
    private String id;
    private String name;
    private double score;

    public Student() {

    }

    public Student(String id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getRank(){
        if(score >= 8){
            return "gioi";
        }else if (score >=6.5){
            return "kha";
        }else{
            return "trung binh";
        }
    }

    public String toString(){
        return "ma : "+id + "ten: " + name + "diem: " + score + "hoc luc : " + getRank();
    }

}