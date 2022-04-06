public class HourlyEmployee extends Employee {
    public double getHourlyRate() {
        return HourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        HourlyRate = hourlyRate;
    }

    public double getHoursWorked() {
        return HoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        HoursWorked = hoursWorked;
    }

    private double HourlyRate;

    public HourlyEmployee(int emplyeeid, String department, int age, String fname, String lname, String nationality, double hourlyRate, double hoursWorked) {
        super(emplyeeid, department, age, fname, lname, nationality);
        HourlyRate = hourlyRate;
        HoursWorked = hoursWorked;

    }

    private double HoursWorked;
private char Insurance;


    public char getInsurance() {
        return Insurance;
    }

    public void setInsurance(char insurance) {
        Insurance = insurance;
    }

    public double CalculateNetPay(){
        double netpay = 0;
        double overtime = 0;
        final double medicalbenefit = 3.5;
        final double socialtax = 6.5;
        final double educationlevy= 2.5;
        double ABST = socialtax + medicalbenefit + educationlevy;

        if (HoursWorked < 10){

        }
        if (HoursWorked>38){
            double hours = HoursWorked - 38;
            HoursWorked = 38;
            overtime = hours * (1.3 * HourlyRate);

        }

            netpay = HourlyRate * HoursWorked;
            ABST = (ABST/100);
            netpay = netpay - ABST;

           /* netpay = netpay - (10/100);*/
        netpay += overtime;
        return netpay;

    }

    @Override
    public double CalculateGrossPay() {
        double grosspay = 0;
        double overtime = 0;

        if (HoursWorked < 10){

        }
        if (HoursWorked>38){
            double hours = HoursWorked - 38;
            HoursWorked = 38;
            overtime = hours * (1.3 * HourlyRate);

        }

        grosspay = HourlyRate * HoursWorked;
        grosspay += overtime;
        return grosspay;

    }

    @Override
    public String toString() {
        return  super.toString();
    }
}
