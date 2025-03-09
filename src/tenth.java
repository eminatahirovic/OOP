//Ask the user for a year and determine whether it is a leap year.
// To check if a year is a leap year, divide the year by 4. If it is fully divisible by 4, it is a leap year.
// For example, the year 2016 is divisible 4, so it is a leap year, whereas, 2015 is not.
// However, Century years like 300, 700, 1900, 2000 need to be divided by 400 to check whether they are leap years or not.


import java.util.Scanner;
public class tenth {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a year");
        int year = Integer.parseInt(reader.nextLine());
        if(year % 4 == 0) {
            System.out.println(year + "it is a leap year");
        }
        if (year % 400 == 0){
            System.out.println(year + "it is a leap year");
        }
        if (year % 100 != 0 ) {
            System.out.println("it is not a leap year");
        }
    }

}
