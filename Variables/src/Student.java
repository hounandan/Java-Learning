public class Student {

        static int computeCount = 0;

        short id;
        char gender;
        int age;
        long phone;
        double gpa;

        String name;
        String degree;
        boolean isInternationalStudent;


        double tutionFee = 15000d;
        double internationalTutionFee = 2000d;

        void compute(){

                int nextId = id + 1;
                computeCount++;

                if(isInternationalStudent){
                        tutionFee = tutionFee + internationalTutionFee;
                }

                System.out.println("Id : "+id);
                System.out.println("Next Id : "+nextId);
                System.out.println("Name : "+name);
                System.out.println("Gender : "+gender);
                System.out.println("Age : "+age);
                System.out.println("Phone : "+phone);
                System.out.println("GPA : "+gpa);
                System.out.println("Degree : "+degree);
                System.out.println("Tuition Fee : "+tutionFee);
                System.out.println("Compute Count : "+computeCount);
                System.out.println();

        }

/*
        public static void main(String[] args) {

                Student student1 = new Student();
                student1.id = 1;
                student1.name = "Nandan";
                student1.gender = 'M';
                student1.age = 22;
                student1.phone = 7338880103L;
                student1.gpa = 3.5d;
                student1.degree = "B.E";
                student1.isInternationalStudent = false;
                student1.compute();

                Student student2 = new Student();
                student2.id = 2;
                student2.name = "Kumaran";
                student2.gender = 'M';
                student2.age = 22;
                student2.phone = 9952866199L;
                student2.gpa = 3.8d;
                student2.degree = "M.S";
                student2.isInternationalStudent = true;
                student2.compute();

                Student student3 = new Student();
                student3.id = 3;
                student3.name = "Aravind GK";
                student3.gender = 'M';
                student3.age = 21;
                student3.phone = 1234567890L;
                student3.gpa = 3.6d;
                student3.degree = "B.E";
                student3.isInternationalStudent = false;
                student3.compute();

                System.out.println("Compute count : "+Student.computeCount);

        }

 */

}
