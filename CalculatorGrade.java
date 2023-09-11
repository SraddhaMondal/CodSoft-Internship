import java.util.Scanner;

public class CalculatorGrade 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the num of subjects:");
        int numSubjects = scanner.nextInt();

        if (numSubjects <= 0) {
            System.out.println("Invalid num of subjects. Please enter a positive integer.");
            return;
        }

        int totalMarks = 0;

        for (int i = 1; i <= numSubjects; i++) 
        {
            System.out.print("Enter the marks obtained in subject " + i + ": ");
            int marks = scanner.nextInt();

            if (marks < 0 || marks > 100) 
            {
                System.out.println("Invalid marks. Marks should be between 0 and 100.");
                return;
            }

            totalMarks += marks;
        }

        double averagePercentage = (double) totalMarks / numSubjects;

        String grade;

        if (averagePercentage >= 90) 
        {
            grade = "A+";
        } 
        else if (averagePercentage >= 80) 
        {
            grade = "A";
        } 
        else if (averagePercentage >= 70) 
        {
            grade = "B";
        } 
        else if (averagePercentage >= 60) 
        {
            grade = "C";
        } 
        else if (averagePercentage >= 50)
         {
            grade = "D";
        } 
        else 
        {
            grade = "F";
        }

        System.out.println("\n Total Marks is: " + 100*numSubjects);
        System.out.println("Total Marks Obtained: " + totalMarks);
        System.out.println("Average Percentage Obtained: " + averagePercentage + "%");
        System.out.println("Grade is : " + grade);

        scanner.close();
    }
}
