import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        EducationCenter educationCenter1 = new School("Peaksoft", "Dubai", LocalDate.of(1990, 3, 11));
        EducationCenter educationCenter2 = new College("Manas", "Japan", LocalDate.of(1990, 11, 15));
        EducationCenter educationCenter3 = new University("Ala Too", "Moscow", LocalDate.of(1990, 11, 15));

        Student student = new Student("Adel", "Zhyldyzbekova", "Female", LocalDate.of(2000, 8, 1), educationCenter1);
        Student student1 = new Student("Alina", "Alibek", "Female", LocalDate.of(2000, 7, 20), educationCenter2);
        Student student2 = new Student("Farida", "Faridabek", "Male", LocalDate.of(2000, 4, 3), educationCenter3);
        Student student3 = new Student("Elina", "Elinabek", "Female", LocalDate.of(2000, 1, 3), educationCenter1);


        Student[] students = {student, student1, student2, student3};

        met(students);

        getAge(students);



    }




    public static Student[] met(Student[] students) {
        for (Student ss : students) {
            ss.getStudentsEducationCenter();
            ss.getStudentsStudyingYear();
        }
        return students;
    }





    public static Student[] getAge(Student[] students) {
        for(int i=0; i<students.length; i++) {
            int e = students[i].getDateOfStart().getYear();
            int num = LocalDate.now().getYear() - e;
            System.out.println(students[i] + " " + num+" "+"years");
        }
        return students;

    }



}



