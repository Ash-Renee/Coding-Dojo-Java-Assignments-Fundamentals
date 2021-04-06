public class ProjectClassDemo {
    public static void main(String[] args) {
        ProjectClass project = new ProjectClass("First Project", "First Description");
        System.out.println(project.elevatorPitch());

        ProjectClass project2 = new ProjectClass();
        project2.setProjectClassName(" Project_The_Second");
        project2.setProjectClassDescription(" Second verse, same as the first");
        System.out.println(project2.elevatorPitch());

    }
}