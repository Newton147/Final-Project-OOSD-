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

    public HourlyEmployee(int emplyeeid, String department, int age, String fname, String lname, String nationality, double hourlyRate, double hoursWorked, char insurance) {
        super(emplyeeid, department, age, fname, lname, nationality);
        HourlyRate = hourlyRate;
        HoursWorked = hoursWorked;
        Insurance = insurance;
    }

    private double HoursWorked;
private char Insurance;


    public char getInsurance() {
        return Insurance;
    }

    public void setInsurance(char insurance) {
        Insurance = insurance;
    }

    public double CalculateSalary(){
        double salary = 0;
        double overtime = 0;
        if (HoursWorked < 10){

        }
        if (HoursWorked>38){
            double hours = HoursWorked - 38;
            HoursWorked = 38;
            overtime = hours * (1.3 * HourlyRate);


        }

        if (Insurance == 'Y'){
            salary = HourlyRate * HoursWorked - (3.3/100);
            return salary;
        }
        else if (Insurance == 'N'){
            salary = HourlyRate * HoursWorked;
            return salary;
        }
        salary = HourlyRate * HoursWorked;
        salary += overtime;
        return salary;

    }
    @Override
    public String toString() {
        return  super.toString();
    }
}
