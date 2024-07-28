
import java.util.ArrayList;


class Main {
    private int rollno;
    private String name;
    private final String schoolName = "TWS DevOps School";
    
    // Parameterized constructor
    public Main(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }
    
    // Default constructor
    public Main() {
        this.rollno = 0;
        this.name = "";
    }
    
    // Getter for rollno
    public int getRollno() {
        return rollno;
    }
    
    // Setter for rollno
    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
    
    // Getter for name
    public String getName() {
        return name;
    }
    
    // Setter for name
    public void setName(String name) {
        this.name = name;
    }
    
    // Getter for schoolName
    public String getSchoolName() {
        return schoolName;
    }
    
    public static void main(String[] args) {
        ArrayList<Main> students = new ArrayList<>();
        
        students.add(new Main(101, "Nikunj"));
        students.add(new Main(102, "DevOps"));
        students.add(new Main(103, "Batch7"));
        
        for (Main student : students) {
            System.out.println("Roll No: " + student.getRollno());
            System.out.println("Name: " + student.getName());
            System.out.println("School Name: " + student.getSchoolName());
            System.out.println();
        }
    }
}

