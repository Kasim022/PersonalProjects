import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); //Scanner

        String answer1 = " ";
        String answer2 = " ";
        String answer3 = " ";
        String answer4 = " ";
        String answer5 = " ";
        int numbercorrect = 0;
        int question = 4;

        System.out.println("Q1) What is the capital of Spain"); //Question 1
        System.out.println("A - Tossa De Mar");
        System.out.println("B - San Sebastian");
        System.out.println("C - Madrid");
        System.out.println("D - Pamplona");

        answer1 = scan.nextLine();

        if (answer1.equalsIgnoreCase("c")) {
            System.out.println("Correct");
            numbercorrect++;
        } else {
            System.out.println("Incorrect!");

        }
        System.out.println("Q2) What is the capital of England"); //Question 2
        System.out.println("A - Bristol");
        System.out.println("B - Liverpool");
        System.out.println("C - Manchester");
        System.out.println("D - London");

        answer2 = scan.nextLine();

        if (answer2.equalsIgnoreCase("d")) {
            System.out.println("Correct");
            numbercorrect++;
        } else {
            System.out.println("Incorrect!");
        }

        System.out.println("Q3) What is the capital of Pakistan"); //Question 3
        System.out.println("A - Islamabad");
        System.out.println("B - Faisalabad");
        System.out.println("C - Karachi");
        System.out.println("D - Lahore");

        answer3 = scan.nextLine();

        if (answer3.equalsIgnoreCase("a")) {
            System.out.println("Correct");
            numbercorrect++;
        }
        else {
            System.out.println("Incorrect!");
        }

        System.out.println("Q4) Which county isn't from Africa"); //Question 4
        System.out.println("A - South Africa");
        System.out.println("B - Morocco");
        System.out.println("C - Riyadh");
        System.out.println("D - Egypt");

        answer4 = scan.nextLine();

        if (answer4.equalsIgnoreCase("c")) {
            System.out.println("Correct");
        }
        else {
            System.out.println("Incorrect!");
        }

        System.out.println("Q5) Which country is from Asia"); //Question 5
        System.out.println("A - Canada");
        System.out.println("B - Syria");
        System.out.println("C - France");
        System.out.println("D - Germany");

        answer5 = scan.nextLine();

        if (answer5.equalsIgnoreCase("b")) {
            System.out.println("Correct");
        }
        else {
            System.out.println("Incorrect!");
        }

        double grade = numbercorrect/5.0 * 100.0;

        System.out.println("Grade:" + " " + grade);


    }
}
