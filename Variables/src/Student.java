public class Student {


        byte rank = 123;
        short id = 12345;
        int number = 1234567890;
        long phone = 7338880103L;

        boolean isInternationalStudent = true;

        double tutionFee = 15000d;
        double internationalTutionFee = 2000d;


        void compute(){

                System.out.println("Rank : "+rank);
                System.out.println("Id : "+id);
                System.out.println("Number : "+number);
                System.out.println("Phone : "+phone);

                if (isInternationalStudent){
                        tutionFee = tutionFee + internationalTutionFee;
                }

                System.out.println("Tuition Fee : "+tutionFee);



        }


        public static void main(String[] args) {

                Student student = new Student();

                student.compute();

        }

}
