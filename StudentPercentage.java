import java.util.Scanner;

public class StudentPercentage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter marks for Subject 1 : ");
        int subject1Marks = scanner.nextInt();

        System.out.println("Enter marks for Subject 2 : ");
        int subject2Marks = scanner.nextInt();

        System.out.println("Enter marks for Subject 3 : ");
        int subject3Marks = scanner.nextInt();

        System.out.println("Enter marks for Subject 4 : ");
        int subject4Marks = scanner.nextInt();

        System.out.println("Enter marks for Subject 5 : ");
        int subject5Marks = scanner.nextInt();

        int totalMarks = subject1Marks + subject2Marks + subject3Marks + subject4Marks + subject5Marks;
        double percentage = totalMarks / 5; 

        System.out.println("The student's percentage is: " + percentage + "%");

    }
}
