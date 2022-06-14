package ProgrammingChallenges;

import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

public class DaysLivedChall5 {
    public static void main(String[] args) throws ParseException {


        Scanner scan = new Scanner(System.in);
        System.out.println("please enter your date of birth(dd/mm/yyyy): ");
        String birthDate = scan.nextLine();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        Date newDate = sdf.parse(birthDate);
        System.out.println("Todays date is: " + sdf.format(date));
        System.out.println("Your date of birth is: " + birthDate);

    }
}
