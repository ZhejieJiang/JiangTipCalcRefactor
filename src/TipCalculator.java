import java.lang.Math;
public class TipCalculator {
    private int numPeople;
    private int tipPercentage;
    private double totalBillBeforeTip;

    public TipCalculator(int people, int tip){
        tipPercentage = tip;
        numPeople = people;
        totalBillBeforeTip = 0.0;
    }
    public double getTotalBillBeforeTip(){
        return totalBillBeforeTip;
    }  //getter method that returns the totalBillBeforeTip instance variable

    public int getTipPercentage() {
        return tipPercentage;
    }  //getter method that returns the tipPercentage instance variable

    public void addMeal(double cost){
        totalBillBeforeTip += cost;
    } //method that increments totalBillBeforeTip by cost and returns no value

    public double tipAmount(){
        return Math.round((totalBillBeforeTip * tipPercentage)*100)/100;
    } //method that calculates and returns a double representing the total tip amount added to the bill

    public double totalBill(){
        return totalBillBeforeTip + tipAmount();
    } //method that calculates and returns a double representing the group’s total bill including tip

    public double perPersonCostBeforeTip(){
        return Math.round((totalBillBeforeTip/numPeople)*100)/100;
    } //method that calculates and returns a double representing the per person cost before tip

    public double perPersonTipAmount(){
        return Math.round((tipAmount()/numPeople)*100)/100;
    } //method that calculates and returns a double representing the per person tip amount

    public double perPersonTotalCost(){
        return Math.round((totalBill()/numPeople)*100)/100;
    } //method that calculates and returns a double representing the total cost per person
}
