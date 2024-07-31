package emailapplication;

public class EmailApp {

    public static void main(String[] args) {

        Email employee_1 = new Email("RohitBhaskar", "Uday");

        //employee_1.setAlternateEmail("rohitbhaskaruday@gmail.com");
        System.out.println(" ----------- ");
        System.out.println(employee_1.showInfo());

    }
}
