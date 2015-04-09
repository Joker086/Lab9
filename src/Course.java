import java.util.Scanner;

public class Course {

    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    //4.a created variable
    static int numberOfCourses;

    public Course(String courseName) {
        this.courseName = courseName;

        //4.1 increment variable
        numberOfCourses++;
    }

    public void addStudent(String student) {
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public void addStudent(){

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a name to add student to Course:");
        students[numberOfStudents] = scan.nextLine();
        numberOfStudents++;

    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    //4.c
    public void displayNumberOfCourses(){

        System.out.println("There are " + numberOfCourses + " courses.");
    }

    //4.d
    public void displayNumberOfStudents(){
        System.out.println("Total number of students enrolled: " + numberOfStudents);
    }

    public void dropStudent(String student) {
        int index = -1;
        boolean found = false;

        for(int i = 0;i<getNumberOfStudents();i++){
            if(students[i].equals(student)){
                found = true;
                index = i;
                break;
            }
        }

        if(found){
            for(int i = index+1; i<getNumberOfStudents();i++){
                students[i-1]=students[i];

            }
            numberOfStudents--;

        }

    }

    public void setCourseName(String courseName){
          this.courseName = courseName;
    }

    public void displayRoster(){

        System.out.println("___________________________________________");
        System.out.println(courseName);
        for(int i = 0; i<numberOfStudents; i++){
            System.out.println((i+1) + ": " + students[i]);
        }

        displayNumberOfStudents();
    }
}