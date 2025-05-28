package academic;

public class Class {
    private String classCode;
    private int semester;
    private String year;
    private Course course;
    private ArrayList<Student> students;
    private ArrayList<Lecturer> lecturers;
    private ArrayList<IAttendant> attendants;
    private ArrayList<IAttendee> attendees;

    public Class(String classCode, int semester, String year) {
        this.classCode = classCode;
        this.semester = semester;
        this.year = year;
    }

    public void addCourse(Course course) {
        this.course = course;
    }

    public void addStudent(Student student) {
        if (students == null) {
            students = new ArrayList<>();
        }
        students.add(student);
    }
    public void addLecturer(Lecturer lecturer, Course course) {
        if (lecturers == null) {
            lecturers = new ArrayList<>();
        }
        lecturers.add(lecturer);
        this.course = course;
    }

    public void attend(IAttendant attendant) {
        if (attendants == null) {
            attendants = new ArrayList<>();
        }
        attendants.add(attendant);
    }
    public void takeAttendance(IAttendee attendee) {
        if (attendees == null) {
            attendees = new ArrayList<>();
        }
        attendees.add(attendee);
    }
}
