package intro;

// Imports
import java.util.Scanner;

/**
 *
 * @author alvaro.hercol
 */
public class ScannerExercises {

    public static void main(String[] args) {
//      getMomentOfTheDayByHourRange();
//      getWeekDayByWeekNumber();
//      getWeeklyPayCheck();
//      calculateFirstGradeEcuation();
//      System.out.println("Final grade: " + calcMedianGrade());
//      numericGradeToReportCardGrade();
//      calculateSecondGradeEcuation();
    }

    public static void getMomentOfTheDayByHourRange() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter hour with format '12' or '20': ");
        int hour = sc.nextInt();

        if (hour >= 6 && hour <= 12) {
            System.out.println("Dzien dobry");
        } else if (hour > 12 && hour <= 20) {
            System.out.println("Good afternoon");
        } else {
            System.out.println("Buenas noches");
        }
    }

    public static void getWeekDayByWeekNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write the week day number (1-7): ");

        // Output text formating
        String textWhiteBgRed = "\u001B[37m\u001B[41m";

        int weekNumber = sc.nextInt();

        switch (weekNumber) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");

                break;
            case 3:
                System.out.println("Wednesday");

                break;
            case 4:
                System.out.println("Thursday");

                break;
            case 5:
                System.out.println("Friday");

                break;
            case 6:
                System.out.println("Saturday");

                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println(textWhiteBgRed + "Out of range! \nPlease re-run the program and provide a number between 1 and 7");
        }

    }

    public static void getWeeklyPayCheck() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter worked hours this week: ");

        int workedHours = sc.nextInt();
        int payCheck = 0;

        for (int i = 1; i <= workedHours; i++) {
            if (i > 40) {
                payCheck += 16;
            } else {
                payCheck += 12;
            }
        }

        System.out.println("This week pay check is: " + payCheck + " €");
    }

    public static void calculateFirstGradeEcuation() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ax: ");
        int a = sc.nextInt();

        System.out.print("Enter b: ");
        int b = sc.nextInt();

        if (a != 0) {
            System.out.println("Result: " + (float) -b / a); // (float) es para castear el resultado
        } else {
            System.out.println("No possible solution");
        }
    }

    public static int calcMedianGrade() {
        Scanner sc = new Scanner(System.in);
        int result = 0;

        System.out.print("Enter first grade: ");
        int firstGrade = sc.nextInt();
        System.out.print("Enter second grade: ");
        int secondGrade = sc.nextInt();
        System.out.print("Enter last grade: ");
        int lastGrade = sc.nextInt();

        result = (firstGrade + secondGrade + lastGrade) / 3;

        return result;
    }

    public static void numericGradeToReportCardGrade() {
        int grade = calcMedianGrade();

        if (grade < 5) {
            System.out.println("Insuficiente");
        } else if (grade == 5) {
            System.out.println("Suficiente");
        } else if (grade == 6) {
            System.out.println("Bien");
        } else if (grade > 6 && grade < 9) {
            System.out.println("Notable");
        } else {
            System.out.println("Sobresaliente");
        }
    }

    public static void calculateSecondGradeEcuation() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.print("Enter c: ");
        int c = sc.nextInt();

        // +
        System.out.println("First value is: " + (float) (-b + (Math.sqrt(Math.pow(b, 2) - (4 * a * c)))) / (2 * a));
        // -
        System.out.println("Second value is: " + (float) (-b - (Math.sqrt(Math.pow(b, 2) - (4 * a * c)))) / (2 * a));
    }
}
