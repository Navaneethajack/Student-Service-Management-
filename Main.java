public class Main {
    public static void main(String[] args) {
        CourseService courseService = new StudentService(); // Assuming StudentService implements CourseService

        // Create students and courses
        Student alice = new Student("Alice", 1001);
        Student bob = new Student("Bob", 1002);

        Course introProgramming = new Course("Introduction to Programming", "Prof. Smith");
        Course dataStructures = new Course("Data Structures and Algorithms", "Prof. Jones");

        // Enroll students in courses
        alice.enrollCourse(introProgramming, courseService);
        alice.enrollCourse(dataStructures, courseService);
        bob.enrollCourse(introProgramming, courseService);

        // Students view their enrolled courses
        alice.viewEnrolledCourses();
        bob.viewEnrolledCourses();
    }
}
