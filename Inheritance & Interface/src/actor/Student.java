package actor;

public class Student implements IAttendant, IAttendee {
    private String nim;
    private String name;
    private String dob;
    
    public Student(String nim, String name, String dob) {
        this.nim = nim;
        this.name = name;
        this.dob = dob;
    }
    
    public String getNim() {
        return nim;
    }
    
    public String getName() {
        return name;
    }
    
    public String getDob() {
        return dob;
    }
    
    public void showCredits(int semester) {
        System.out.println("Student " + name + " has completed 2 credits in semester " + semester);
    }
    
    public void showCourse(int semester) {
        System.out.println("Student " + name + " is enrolled in course for semester " + semester);
    }
    
}
