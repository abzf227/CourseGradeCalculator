package CourseGrades;
import java.util.ArrayList;
import java.util.Scanner;
public class CourseGrades {
    private double grade;
    public CourseGrades() {
        grade = 0;
    }
    public void gradeFunc(double[] difGrade, String[] difGradeName) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> grades = new ArrayList<>(0);
        for(int i = 0; i < difGrade.length; i++) {
            boolean n = true; double average = 0; int values = 0;
            do {
                System.out.print("Please enter " + difGradeName[i] + " grades (enter '999' if done) (Worth " + difGrade[i] + "): ");
                    double individualGrade = sc.nextDouble();
                    if(individualGrade < 999) {
                        values++;
                        average += individualGrade;
                    }
                    else n = false;
            }
            while(n);
            if(values > 0) {
                average /= values;
            }
            grades.add(average*difGrade[i]);
        }
        System.out.println(grades);
        grade = readGradeList(grades, difGrade);
        
    }
    private double readGradeList(ArrayList<Double> grades, double[] difGrade) {
        double totalAvg = 0;
        double totalValues = 1;
        for(int i = grades.size()-1; i >= 0; i--) {
            if(grades.get(i)==0) {
                totalValues -= difGrade[i]; grades.remove(i);
            }
        }
        for(int j = 0; j < grades.size(); j++) {
            totalAvg += grades.get(j)/totalValues;
        }
        return totalAvg;
    }
    public double getGrade() {
        return grade;
    }
}
