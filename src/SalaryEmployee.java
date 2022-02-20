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
    public double CalculateSalary() {

        return baseSalary;
    }



    public String toString() {

            return  super.toString();
    }
}
