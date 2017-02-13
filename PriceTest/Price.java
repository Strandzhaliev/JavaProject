import java.util.Iterator;
import java.util.Scanner;

/**
 * Created by Vladimir on 2/12/2017.
 */
public class Price {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("PLease insert km: ");
        double n = Double.parseDouble(in.nextLine());
        System.out.println("km are: " + n);

        // km are "n"
        System.out.print("Inset hour :");
        double day = Double.parseDouble(in.nextLine());
        in.close();

        Double hour1 = 20.0;
        Double hour2 = 05.0;

        // 1.taxi
        double initialFee = 0.7;
        double dailyRate = 0.79;
        double NightRate = 0.90;
        // 2.bus
        double Rate = 0.09;
        double km = 20;
        // 3.train
        double RateTrain = 0.06;
        double distance = 100;


        if (day < hour1 & day > hour2) {
            System.out.println("Daily Rate");
            double result1 = (dailyRate * n) + initialFee;
            System.out.println(result1 + "lv. on taxi");
            double result22 = (km * Rate);
            System.out.println(result22 + "lv. on bus");
            double result3 = (distance * RateTrain);
            System.out.println(result3 + "lv. on train");


        } else if(day > hour1) {
            System.out.println("Night Rate ");
            double result4 = (NightRate * n) + initialFee;
            System.out.println(result4 + "lv. on taxi");
            double result5 = (Rate * n);
            System.out.println(result5 + "lv. on bus");
            double result6 = (RateTrain * n);
            System.out.println(result6 + "lv. on train");

        }

    }
}
