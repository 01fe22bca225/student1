import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

 class Student {
    private String name;
    private Date dob;

    public Student(String name, String dob) throws ParseException {
        this.name = name;
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy"); // Assuming date format is DD-MM-YYYY
        this.dob = sdf.parse(dob);
    }

    public void displayStudentName() {
        System.out.println("Student Name: " + name);
    }

    public void displayAge() {
        Date currentDate = new Date();
        long diffInMillies = Math.abs(currentDate.getTime() - dob.getTime());
        long ageInMillis = diffInMillies;
        long age = ageInMillis / (1000L * 60 * 60 * 24 * 365);
        System.out.println("Age: " + age + " years");
    }

    public static void main(String[] args) throws ParseException {
        Student student = new Student("John Doe", "01-01-2000");
        student.displayStudentName();
        student.displayAge();
    }
}
