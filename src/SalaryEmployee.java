public class SalaryEmployee extends Employee {


    private double baseSalary;

    public SalaryEmployee(int emplyeeid, String department, int age, String fname, String lname, String nationality, double baseSalary) {
        super(emplyeeid, department, age, fname, lname, nationality);
        this.baseSalary = baseSalary;

    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }


    @Override
    public double CalculateGrossPay() {
        return baseSalary;
    }

    @Override
    public double CalculateNetPay() {
        final double medicalbenefit = 3.5;
        final double socialtax = 6.5;
        final double educationlevy= 2.5;
        double ABST = socialtax + medicalbenefit + educationlevy;

        return baseSalary - ABST;
    }

    public String toString() {

            return  super.toString();
    }
}
