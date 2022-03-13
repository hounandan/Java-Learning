public class Main {


    public static void main(String[] args) {


        Student student1 = new Student(1, 'M', 22, 7338880103L,
                3.5d, "Nandy R", "B.E");

        Student student2 = new Student(2, 'M', 22, 9952866199L,
                3.8d, "Kumaran MS", "B.E", true);

        Student student3 = new Student(3, 'M', 21, 1234567890L,
                3.6d, "Aravind GK", "B.E", false);


        System.out.println("Compute count : "+Student.computeCount);

        System.out.println("Name of Student 1: "+student1.name);
        System.out.println("Name of Student 2: "+student2.name);
        System.out.println("Name of Student 3: "+student3.name);

        student1.updateName("Nandan R");
        System.out.println("Updated Name of Student 1: "+student1.name);


    }


}
