import java.text.BreakIterator;
import java.util.Scanner;
public class Main {
    public static Scanner TerminalInput = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("|--------------------------------|");
        System.out.println("| Welcome to Leap Year Detector! |");
        System.out.println("|--------------------------------|");
        System.out.print("Please Enter The Year You\nWould Like To Check Here: ");
        int year = Integer.parseInt(TerminalInput.nextLine());
        boolean isLeapYear = checkYear(year);
        printResult(isLeapYear, year);
    }

    private static void printResult(boolean isLeapYear, int year) {
        if(isLeapYear){
            System.out.println(year + " is leap year!");
        }else{
            System.out.println(year + " is not leap year!");
        }
    }

    private static boolean checkYear(int year) {
        if (year < 1582){
            System.out.println("Leap Years Did Not Exist Before 1582!");
            return false;
        }
        boolean isDivisibleBy4 = divisibleBy4(year);
        boolean isDivisibleBy100 = divisibleBy100(year);
        boolean isDivisibleBy400 = divisibleBy400(year);
        if(isDivisibleBy4 && !isDivisibleBy100){
            return true;
        } else if(isDivisibleBy4 && isDivisibleBy100 && isDivisibleBy400) {
            return true;
        } else{
            return false;
        }
    }
    private static boolean divisibleBy4(int year) {
        if (year%4 == 0){
            return true;
        }else{
            return false;
        }
    }
    private static boolean divisibleBy100(int year) {
        if (year%100 == 0){
            return true;
        }else{
            return false;
        }
    }
    private static boolean divisibleBy400(int year) {
        if (year%400 == 0){
            return true;
        }else{
            return false;
        }
    }

}