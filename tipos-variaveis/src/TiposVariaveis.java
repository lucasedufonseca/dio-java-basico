public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        double monthSalary = 4500.50;
        String employeeName = "Carlos Piloto";
        int ageOfTheEmployee = 18;
        double riseSalaryValue = 2500.34;
        double newSalary = monthSalary + riseSalaryValue;


        System.out.println("The employee "+ employeeName +" have "+ ageOfTheEmployee + " years old and earns "+ monthSalary +" by month.");
        System.out.println(newSalary);

        //Changeble variables
        int randonNumber = 23;
        System.out.println(randonNumber);
        
        randonNumber = 34;
        System.out.println(randonNumber);

        //constant

        final int ONE_HUNDRED = 100;
        System.out.println(ONE_HUNDRED);
    }
}
