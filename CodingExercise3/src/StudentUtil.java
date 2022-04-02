import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class StudentUtil {

    private static final int[] GRADES = new int[]{4,3,2};


    public  static double[] calculateGPA(int[] studentIdList, char[][] studentsGrades){

        int studentIdLength = studentIdList.length;
        int numberOfGradesPresent = studentsGrades.length;

        if(studentIdLength == numberOfGradesPresent){
            double[] resultGPA = new double[studentIdLength];
            for(int i=0; i<studentIdLength; i++){
                double gpa;
                int points = 0;
                for(int j=0; j<studentsGrades[i].length; j++){
                    if('A' == studentsGrades[i][j] || 'B' == studentsGrades[i][j] ||
                            'C' == studentsGrades[i][j]) {
                        int gradePoint = studentsGrades[i][j] - 65;
                        points += GRADES[gradePoint];
                    }else{
                        System.out.println("Invalid Grades Provided");
                        return new double[]{};
                    }
                }
                gpa =(double) points / studentsGrades[i].length;
                resultGPA[i] = gpa;
            }
            return resultGPA;

        }else {
            System.out.println("Grades are missing. Please provide" +
                    " Grades properly");
            return new double[]{};
        }
    }


    public static int[] getStudentsByGPA(double lower, double higher, int[] studentList, char[][] studentsGrades){

        if(lower<0 || higher<0 || lower > higher) return null;

        double[] resultGPA = calculateGPA(studentList, studentsGrades);

        ArrayList<Integer> d = new ArrayList<>();
        for (int i = 0; i < resultGPA.length; i++) {

            if(resultGPA[i] >= lower && resultGPA[i] <= higher){
                d.add(studentList[i]);
                System.out.println(studentList[i]);
            }

        }
        return d.stream().mapToInt(i -> i).toArray();

    }


}
