package task_10_Generics_Example;

public class lesson_01 {
    public static void main(String[] args) {
        Schoolar schoolar1 = new Schoolar("Ivan",13);
        Schoolar schoolar2 = new Schoolar("Anna",15);
        Schoolar schoolar3 = new Schoolar("Ilya",12);
        Schoolar schoolar4 = new Schoolar("Sergey",14);

        Student student1 = new Student("Nikolay",20);
        Student student2 = new Student("Mariya",21);

        Employee employee1 = new Employee("Artem",32);
        Employee employee2 = new Employee("Mariya",30);

        Team<Schoolar> schoolarTeam = new Team<>("Drakoni!");
        Team<Schoolar> schoolarTeam1 = new Team<>("MoveOn!");
        Team<Student> studentTeam = new Team<>("GetUp!");
        Team<Employee> employeeTeam = new Team<>("ComeOn!");

        schoolarTeam.addNewParticipant(schoolar1);
        schoolarTeam.addNewParticipant(schoolar2);
        schoolarTeam1.addNewParticipant(schoolar3);
        schoolarTeam1.addNewParticipant(schoolar4);
        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);
        employeeTeam.addNewParticipant(employee1);
        employeeTeam.addNewParticipant(employee2);
        System.out.println(" ");
        schoolarTeam.playWith(schoolarTeam1);
    }
}
