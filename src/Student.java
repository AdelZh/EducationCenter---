import java.time.LocalDate;
import java.time.Period;

public class Student implements Study{
    private String name;
    private String surname;
    private String gender;
    private LocalDate dateOfStart;
    EducationCenter educationCenter;


    public Student(){

    }

    public Student(String name, String surname, String gender, LocalDate dateOfStart, EducationCenter educationCenter) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.dateOfStart=dateOfStart;
        this.educationCenter = educationCenter;


    }

    @Override
    public void getStudentsEducationCenter() {
        System.out.println("I am studying: "+" "+this.educationCenter);
    }

    @Override
    public void getStudentsStudyingYear() {
        System.out.println("I am studying in general for: "+this.dateOfStart);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }



    public String getGender() {
        return gender;
    }



    public LocalDate getDateOfStart() {
        return dateOfStart;
    }



    public EducationCenter getEducationCenter() {
        return educationCenter;
    }

    public void setEducationCenter(EducationCenter educationCenter) {
        this.educationCenter = educationCenter;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender='" + gender + '\'' +
                ", dateOfStart=" + dateOfStart +
                ", educationCenter=" + educationCenter +
                ", year=" + dateOfStart +
                '}';
    }
}
