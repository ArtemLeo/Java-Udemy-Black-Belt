package task_10_Generics_Example;

public class lesson_01 {
    public static void main(String[] args) {
        Schoolar scholar1 = new Schoolar("Artem",13);
        Schoolar scholar2 = new Schoolar("Anna",15);
        Schoolar scholar3 = new Schoolar("Ilya",12);
        Schoolar scholar4 = new Schoolar("Sergey",14);

        Student student1 = new Student("Nikolay",20);
        Student student2 = new Student("Mariya",21);

        Employee employee1 = new Employee("Artem",32);
        Employee employee2 = new Employee("Mariya",30);

        Team<Schoolar> scholarTeam = new Team<>("Dragoni!");
        Team<Schoolar> scholarTeam1 = new Team<>("MoveOn!");
        Team<Student> studentTeam = new Team<>("GetUp!");
        Team<Employee> employeeTeam = new Team<>("ComeOn!");

        scholarTeam.addNewParticipant(scholar1);
        scholarTeam.addNewParticipant(scholar2);
        scholarTeam1.addNewParticipant(scholar3);
        scholarTeam1.addNewParticipant(scholar4);
        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);
        employeeTeam.addNewParticipant(employee1);
        employeeTeam.addNewParticipant(employee2);
        System.out.println(" ");
        scholarTeam.playWith(scholarTeam1);
    }
}
