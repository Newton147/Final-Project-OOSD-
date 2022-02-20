public class Main {
    public static void main(String[] args) {
        Employee employees [] = new Employee[5];

        employees[0] = new HourlyEmployee(12332,"Sales Department", 26, "Jonathan",
                                    "Kaminga", "Jamaican", 30,32,'Y');
        employees[1] = new HourlyEmployee(12211,"Medical Department",21,"Jimmy", "Butler", "American"
        , 30,32,'N');
        employees[2] = new SalaryEmployee(12322, "Sales Department",22, "Stephen", "Curry",
                            "American",123,300);
        employees[3] = new SetCommission(2121,"Sales Department", 23, "Jonathan",
                "Kaminga", "Jamaica", 30,32,1000);
        employees[4] = new SeveranceEmployee(12122,"Cleaning Department",68, "Duncan", "Robinson","Nigerian",15,2000);
        for (int i = 0; i<employees.length; i++){
            System.out.println(employees[i]);
            System.out.println("\n");
        }

    }

}
