import java.text.DecimalFormat;
public class TipCalculator {
    private int numPeople;
    private int tipPercentage;
    private double totalBillBeforeTip;
    DecimalFormat df = new DecimalFormat( "#.##" );

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
        return (totalBillBeforeTip * (tipPercentage/100.0));
    } //method that calculates and returns a double representing the total tip amount added to the bill

    public double totalBill(){
        return totalBillBeforeTip + tipAmount();
    } //method that calculates and returns a double representing the group’s total bill including tip

    public double perPersonCostBeforeTip(){
        return ((totalBillBeforeTip/numPeople));
    } //method that calculates and returns a double representing the per-person cost before tip

    public double perPersonTipAmount(){
        return (tipAmount()/numPeople);
    } //method that calculates and returns a double representing the per-person tip amount

    public double perPersonTotalCost(){
        return ((totalBill()/numPeople));
    } //method that calculates and returns a double representing the total cost per person
}
