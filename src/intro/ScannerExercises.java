package intro;

// Imports
import java.util.Scanner;

/**
 *
 * @author alvaro.hercol
 */
public class ScannerExercises {

    public static void main(String[] args) {
//        getMomentOfTheDayByHourRange();
//        getWeekDayByWeekNumber();
//        getWeeklyPayCheck();
//        calculateFirstGradeEcuation();
//        System.out.println("Final grade: " + calcMedianGrade());
//        numericGradeToReportCardGrade();
//        calculateSecondGradeEcuation();
//        calculateHoroscope();
        getRemainingSecondsOfDayByHour();
//        sortThreeNumbers();

    }

    // Utility methods
    public static Scanner getNewScanner() {
        Scanner sc = new Scanner(System.in);
        return sc;
    }

    public static void getMomentOfTheDayByHourRange() {
        Scanner sc = getNewScanner();
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
        Scanner sc = getNewScanner();
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
        Scanner sc = getNewScanner();
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
        Scanner sc = getNewScanner();
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
        Scanner sc = getNewScanner();
        int result;

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
        Scanner sc = getNewScanner();
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.print("Enter c: ");
        int c = sc.nextInt();

        // Discriminante (Δ)
        double sqrt = (Math.sqrt(Math.pow(b, 2) - (4 * a * c)));

        if (sqrt > 0) {
            System.out.println("There's two possible solutions because sqrt > 0");

            // +
            System.out.println("First value is: " + (float) (-b + sqrt) / (2 * a));
            // -
            System.out.println("Second value is: " + (float) (-b - sqrt) / (2 * a));
        } else if (sqrt == 0) {
            System.out.println("There's one possible solution because sqrt = 0");

            // +
            System.out.println("First value is: " + (float) (-b + sqrt) / (2 * a));
        } else {
            System.out.println("There's no real solution because sqrt < 0");
        }
    }

    public static void calculateHoroscope() {
        Scanner sc = getNewScanner();

        System.out.print("Enter your birth day: ");
        int day = sc.nextInt();

        System.out.print("Enter your birth month (1-12): ");
        int month = sc.nextInt();

        if ((month == 3 && day >= 21) || (month == 4 && day <= 20)) {
            System.out.println("Aries");
        } else if ((month == 4 && day >= 21) || (month == 5 && day <= 20)) {
            System.out.println("Taurus");
        } else if ((month == 5 && day >= 21) || (month == 6 && day <= 20)) {
            System.out.println("Gemini");
        } else if ((month == 6 && day >= 21) || (month == 7 && day <= 22)) {
            System.out.println("Cancer");
        } else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
            System.out.println("Leo");
        } else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
            System.out.println("Virgo");
        } else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
            System.out.println("Libra");
        } else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) {
            System.out.println("Scorpio");
        } else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) {
            System.out.println("Sagittarius");
        } else if ((month == 12 && day >= 22) || (month == 1 && day <= 19)) {
            System.out.println("Capricorn");
        } else if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) {
            System.out.println("Aquarius");
        } else if ((month == 2 && day >= 19) || (month == 3 && day <= 20)) {
            System.out.println("Pisces");
        } else {
            System.out.println("Out of range! \n Please re-run and enter valid date"); // If the date is invalid
        }
    }

    public static void getRemainingSecondsOfDayByHour() {
        Scanner sc = getNewScanner();

        System.out.print("Enter hour (24h format): ");
        int hour = sc.nextInt();
        System.out.print("Enter minute (0-59): ");
        int minute = sc.nextInt();

        int secondsElapsed = (hour * 3600) + (minute * 60);
        int secondsUntilMidnight = (24 * 3600) - secondsElapsed;

        System.out.println(secondsUntilMidnight + "''" + " until midnight");
    }

    public static void sortThreeNumbers() {
        Scanner sc = getNewScanner();

        int auxiliar;

        System.out.print("Enter number 1: ");
        int n1 = sc.nextInt();
        System.out.print("Enter number 2: ");
        int n2 = sc.nextInt();
        System.out.print("Enter number 3: ");
        int n3 = sc.nextInt();

        if (n1 > n2) {
            auxiliar = n1;
            n1 = n2;
            n2 = auxiliar;
        }
        if (n2 > n3) {
            auxiliar = n2;
            n2 = n3;
            n3 = auxiliar;
        }
        if (n1 > n2) {
            auxiliar = n1;
            n1 = n2;
            n2 = auxiliar;
        }

        System.out.println("Sorted numbers: " + n1 + ", " + n2 + ", " + n3 + ".");
    }
}
