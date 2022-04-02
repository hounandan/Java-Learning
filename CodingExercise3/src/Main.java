public class Main {

    public static void main(String[] args) {

        int[] studentIdList = new int[]{1001, 1002, 1003};
        char[][] studentsGrades = new char[][]{ {'A', 'B', 'C'},
                {'A', 'B', 'C', 'A', 'B'}, {'A', 'B', 'A', 'A', 'A'} };

        StudentUtil studentUtil = new StudentUtil();
        //double[] resultGPA = studentUtil.calculateGPA(studentIdList,studentsGrades);

        int[] toppers = studentUtil.getStudentsByGPA(3.5,4.0, studentIdList, studentsGrades);

        for(int id: toppers){
            System.out.println(id);
        }

    }

}
