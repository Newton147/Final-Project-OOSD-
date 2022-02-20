public class SeveranceEmployee extends Employee {
    public int YearsOnJob;
    private double BaseSalary;

    public SeveranceEmployee(int emplyeeid, String department, int age, String fname, String lname, String nationality, int yearsOnJob, double baseSalary) {
        super(emplyeeid, department, age, fname, lname, nationality);
        YearsOnJob = yearsOnJob;
        BaseSalary = baseSalary;
    }

    public int getYearsOnJob() {
        return YearsOnJob;
    }

    public void setYearsOnJob(int yearsOnJob) {
        YearsOnJob = yearsOnJob;
    }


    @Override
    public double CalculateSalary() {
        double SeverancePay = 0;
        if (YearsOnJob >= 20) {
            SeverancePay = BaseSalary * .03;
        } else if (YearsOnJob <= 19){
            SeverancePay = BaseSalary * .05;
        }
        return SeverancePay + BaseSalary;
    }


    public String toString() {
        return  super.toString() +
          String.format("%-20s %d%n", "Years of Service:", +YearsOnJob);
    }

}
