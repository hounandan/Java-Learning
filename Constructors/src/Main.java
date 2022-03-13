public class Main {


    public static void main(String[] args) {


        Student student1 = new Student(1, 'M', 22, 7338880103L,
                3.5d, "Nandan R", "B.E");

        Student student2 = new Student(2, 'M', 22, 9952866199L,
                3.8d, "Kumaran MS", "B.E", true);

        Student student3 = new Student(3, 'M', 21, 1234567890L,
                3.6d, "Aravind GK", "B.E", false);


        System.out.println("Compute count : "+Student.computeCount);


    }


}
