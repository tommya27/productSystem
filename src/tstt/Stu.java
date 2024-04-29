package tstt;

public class Stu {
    int id;
    String name;
    int math;
    int chin;
    int eng;

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

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getChin() {
        return chin;
    }

    public void setChin(int chin) {
        this.chin = chin;
    }

    public int getEng() {
        return eng;
    }

    public Stu() {
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public Stu(int id) {
        this.id = id;
    }

    public Stu(int id, String name, int math, int chin, int eng) {
        this.id = id;
        this.name = name;
        this.math = math;
        this.chin = chin;
        this.eng = eng;
    }

    public static void main(String[] args){

    }
}