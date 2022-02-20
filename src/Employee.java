public abstract class Employee {
    private int emplyeeid;
    private String Department;
    private int Age;
    private String Fname;
    private String Lname;
    private String Nationality;

    public int getEmplyeeid() {
        return emplyeeid;
    }

    public void setEmplyeeid(int emplyeeid) {
        this.emplyeeid = emplyeeid;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getFname() {
        return Fname;
    }

    public void setFname(String fname) {
        Fname = fname;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String lname) {
        Lname = lname;
    }

    public String getNationality() {
        return Nationality;
    }

    public void setNationality(String nationality) {
        Nationality = nationality;
    }

    public Employee(int emplyeeid, String department, int age, String fname, String lname, String nationality) {
        this.emplyeeid = emplyeeid;
        Department = department;
        Age = age;
        Fname = fname;
        Lname = lname;
        Nationality = nationality;
    }



    public abstract double CalculateSalary();
    @Override
    public String toString() {
        return  String.format("%-20s %d%n", "Employee ID:", emplyeeid) +
                String.format("%-20s %s%n", "Employee Name: ", Fname + " " + Lname)+
                String.format("%-20s %s%n ", "Age: ", +Age)+
                String.format("%-20s %s%n", "Department: ", Department)+
                String.format("%-20s %s%n", "Nationality: ", Nationality)+
                String.format("%-20s %.2f%n", "Salary:", CalculateSalary());

    }

}
