public class SetCommission extends Employee {
    private double CommissionRate;
    private int TotalSales;
    private double baseSalary;

    public SetCommission(int emplyeeid, String department, int age, String fname, String lname, String nationality, double commissionRate, int totalSales, double baseSalary) {
        super(emplyeeid, department, age, fname, lname, nationality);
        CommissionRate = commissionRate;
        TotalSales = totalSales;
        this.baseSalary = baseSalary;
    }

    public double getCommissionRate() {
        return CommissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        CommissionRate = commissionRate;
    }

    public int getTotalSales() {
        return TotalSales;
    }

    public void setTotalSales(int totalSales) {
        TotalSales = totalSales;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }/*
public double Commission(){
       return TotalSales * CommissionRate;
}
*/
    @Override
    public double CalculateSalary() {

        return (TotalSales * CommissionRate) + baseSalary;
    }

    public String toString() {
            return  super.toString();

    }

}

