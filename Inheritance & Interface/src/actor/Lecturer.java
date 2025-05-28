package actor;

public class Lecturer {
    private String lecturerCode;
    private String name;
    private String dob;
    
    public Lecturer(String lecturerCode, String name, String dob) {
        this.lecturerCode = lecturerCode;
        this.name = name;
        this.dob = dob;
    }
    
    public String getLecturerCode() {
        return lecturerCode;
    }
    
    public String getName() {
        return name;
    }
    
    public String getDob() {
        return dob;
    }
    
    public void showCourse(int semester) {
        System.out.println("Lecturer " + name + " is teaching course for semester " + semester);
    }
}
