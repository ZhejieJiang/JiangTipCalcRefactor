//Imports
import java.util.Scanner; //For Scanners
import java.text.DecimalFormat;//Rounding

public class TipCalculatorRunner
{
    public static void main(String[]args)
    {
        //inputed variables
        DecimalFormat df = new DecimalFormat( "#.##" );
        Scanner scan = new Scanner(System.in);
        System.out.print("How many people are in your group? ");
        int a = scan.nextInt();
        System.out.print("What's the tip percentage? (0-100): ");
        int b = scan.nextInt();
        System.out.print("What is your bill? ");
        double c = scan.nextDouble();


        TipCalculator main = new TipCalculator(a,b);
        main.addMeal(c);


        //Writing out the answers
        System.out.println();
        System.out.println("Total bill before Tip: " + main.getTotalBillBeforeTip());
        System.out.println("Tip Percentage: " + main.getTipPercentage());
        System.out.println("Total Tip: " + df.format(main.tipAmount()));
        System.out.println("The total per person before tip is: " + df.format(main.perPersonCostBeforeTip()));
        System.out.println("The total bill including Tip amount is $" + df.format(main.totalBill()));
        System.out.println("The total tip amount is $" + df.format(main.tipAmount()));
        System.out.println("The total bill including Tip per person is $" + df.format(main.perPersonTotalCost()));
        System.out.println("The total tip per person is $" + df.format(main.perPersonTipAmount()));
    }
}