public class CourseClient {
    public static void main(String[] args) {


        Course course1 = new Course("Data Structures");
        course1.addStudent("Tyler Adams");
        course1.addStudent("Aliasghar Amiri");
        course1.addStudent("Megan Blackwell");
        course1.addStudent("Austin Churchman");
        course1.addStudent("Jaime Clark");

        Course course2 = new Course("Database Systems");
        course2.addStudent("Joshua Donahoe");
        course2.addStudent("Andrew Freiberger");
        course2.addStudent("Jonathon Gleason");
        course2.addStudent("Ethan Johnson");
        course2.addStudent("Melissa Kennedy");
        course2.addStudent("Andrew Lehr");



        Course course3 = new Course("Calculus");
        for (int i = 0;i<5;i++){
            course3.addStudent();
        }

        course3.setCourseName("C201");
        course1.displayNumberOfCourses();

        course1.dropStudent("Austin Churchman");

        course1.displayRoster();
        course2.displayRoster();
        course3.displayRoster();



        /*System.out.println("Number of students in course1: "
                + course1.getNumberOfStudents());
        String[] students = course1.getStudents();
        for (int i = 0; i < course1.getNumberOfStudents(); i++)
            System.out.print(students[i] + ", ");

        System.out.println();
        System.out.println("Number of students in course2: "
                + course2.getNumberOfStudents());

        //4.a printing numberOfCourses
        course1.displayNumberOfCourses();
        course1.getNumberOfStudents();

        course1.setCourseName("Soup");
        System.out.println(course1.getCourseName());
        course1.displayRoster();
        */


    }
}