public class MVCPatternTest {
    public static void main(String[] args) {
        Student model = new Student("1", "Meghadri Gautami", "A");
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);
        controller.updateView();
        controller.setStudentName("Ananya Arya");
        controller.setStudentGrade("B");
        controller.updateView();
    }
}