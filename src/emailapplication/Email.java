package emailapplication;

import java.util.Scanner;

public class Email {

    //property variables in the beginning
    //best practice - do not let anyone access these/
    // so making them private
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private int defaultPasswordLength=10;
    private String department;
    private int mailBoxCapacity = 500;
    private String alternateEmail;
    private String companySuffix = "dcompany.com";


    // Creating a constructor to receive the first and the last name.
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;

        System.out.println("Email has been created: "+this.firstName + " " + this.lastName);

        //Now call a method that asks for the department of the employee
        // it would return the department.
        this.department = setDepartment();

        //Now call a method that returns a random passcode.
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("password has been set. "+this.password);

        //Combine firstName.lastName to generate the email-id.
        this.email = firstName.toLowerCase()+lastName.toLowerCase() + "@" +department.toLowerCase()+ "." +companySuffix;
    }

    // Asking the user for which Department the user is from
    private String setDepartment(){
        //ask the IT Admin which department is the employee from.
        System.out.println("New Employee:" + firstName + " \n1 for Sales\n2 for Software Engineering\n3 for Product Manager\n4 for none. \nEnter the department CODE: ");

        Scanner in = new Scanner(System.in);
        int departmentChoice = in.nextInt();
        if(departmentChoice == 1) return "Sales";
        else if (departmentChoice == 2) return "Engineering";
        else if( departmentChoice==3) return "Management";
        else return "";
    }

    // Generate a random password for the email account
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@$%";
        char[] password = new char[length];
        for(int i=0; i<length;i++){
            int rand = (int)(Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }

        return new String(password);
    }
    // set the mailbox capacity
    public void setMailBoxCapacity(int capacity){
        this.mailBoxCapacity = capacity;
    }

    // set the alternate email account
    public void setAlternateEmail(String altEmail){
        this.alternateEmail = altEmail;
    }


    // change the password for the email.
    public void changePassword(String password){
        this.password = password;
    }

    //now getters.
    public int getMailBoxCapacity(){
        return mailBoxCapacity;
    }
    public String getAlternateEmail(){
        return alternateEmail;
    }
    public String getPassword() {
        return password;
    }

    public String showInfo(){
        return "DISPLAY NAME: " + firstName + " " + lastName +
                "\nCOMPANY NAME: " + email + " " +
                "\nMAILBOX CAPACITY: " + mailBoxCapacity + "mb";
    }
}
