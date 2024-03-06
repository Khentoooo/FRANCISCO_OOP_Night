package nahida;

import java.util.Scanner;

public class nahidamain {

   public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter test case number: ");
        int caseNum = scan.nextInt();
        scan.nextLine();

            Student student1 = new Student("Jemar Jude", "Maranga", 17);
            Student student2 = new Student("Jose", "Cruz", 19);

            if (caseNum == 1) {
                System.out.println("Test Case "+ caseNum + ": Student under 18");
                System.out.println(student1);
            } else if (caseNum == 2) {
                System.out.println("Test Case "+ caseNum + ": Increase age of student1");
                student1.increaseAge();
                System.out.println(student1);
            } else if (caseNum == 3) {
                System.out.println("Test Case "+ caseNum + ": Student over 18");
                System.out.println(student2);
            } else {
                System.out.println("sorry 3 ra kutob hahaha");
            }
        }
    }
