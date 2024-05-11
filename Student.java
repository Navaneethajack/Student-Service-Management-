package model;

public class Student extends Person {
    private List<Course> enrolledCourses;

    public Student(String name, int id) {
        super(name, id);
        this.enrolledCourses = new ArrayList<>();
    }

    public void enrollCourse(Course course, CourseService courseService) {
        if (!enrolledCourses.contains(course)) {
            enrolledCourses.add(course);
            courseService.enrollStudent(this, course);
            System.out.println(getName() + " has been enrolled in " + course.getName());
        } else {
            System.out.println(getName() + " is already enrolled in " + course.getName());
        }
    }

    public void viewEnrolledCourses() {
        if (enrolledCourses.isEmpty()) {
            System.out.println(getName() + " is not currently enrolled in any courses.");
        } else {
            System.out.println(getName() + "'s enrolled courses:");
            for (Course course : enrolledCourses) {
                System.out.println("- " + course.getName());
            }
        }
    }
}
