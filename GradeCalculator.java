package CourseGrades;
import java.util.Scanner;
import java.util.ArrayList;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CourseGrades chemGrade = new CourseGrades();
        CourseGrades calcGrade = new CourseGrades();
        double[] calcDifGrades = {0.06,0.04,0.6,0.06,0.028,0.2,0.012};
        String[] calcDifNames = {"assignments","prep assignments","midterms","quizzes","python labs","final exam","python quizzes"};
        double[] chemDifGrades = {0.1,0.1,0.15,0.65};
        String[] chemDifNames = {"clicker/participation","homework","quizzes","exams"};

        System.out.println();
        for(int i = 0; i < 3; i++) {
        System.out.println("########################################################################");
        }
        System.out.println("########################### GRADE CALCULATOR ###########################");
        System.out.println("############################ BY ANDREW FENG ############################");
        for(int i = 0; i < 3; i++) {
            System.out.println("########################################################################");
        }
        System.out.print("\nPlease enter the course name ('chem' or 'calc'): ");
        String course = sc.nextLine();
        if(course.equals("chem")) {
            chemGrade.gradeFunc(chemDifGrades, chemDifNames);
            System.out.println("\nYour current CHEM 107 grade is: " + chemGrade.getGrade());
        }
        else if(course.equals("calc")) {
            calcGrade.gradeFunc(calcDifGrades, calcDifNames);
            System.out.println("\nYour current MATH 151 grade is: " + calcGrade.getGrade());
        }
        else {
            System.out.println("I am NOT coding another do-while function just restart the program");
        }
        System.out.print("\nWould you like to calculate your other grade? ('y'/'n'): ");
        String input = sc.nextLine();
        if(input == "y") {
            if(course.equals("chem")) {
                calcGrade.gradeFunc(calcDifGrades, calcDifNames);
                System.out.println("\nYour current MATH 151 grade is: " + calcGrade.getGrade());
            }
            else {
                chemGrade.gradeFunc(chemDifGrades, chemDifNames);
                System.out.println("\nYour current CHEM 107 grade is: " + chemGrade.getGrade());
            }
        }
        else {
            System.out.println("\nHave a nice day!");
        }
    }
}
