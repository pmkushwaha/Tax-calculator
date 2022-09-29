import java.util.Scanner;

public class Tax{
    public static void main(String[] args) {
        int i;
        System.out.println("Tax Calculator App ");
        System.out.println("-----WELCOME-----");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter total person count:");
       int count = sc.nextInt();

        // string array for the user name

        String[] name = new String[count];

        // int array for salary
        long salary[] = new long[count];

        for (i = 0; i < count; i++) {

            Scanner bt = new Scanner(System.in);

            System.out.println("Enter Name:"+(i+1));
            name[i] = bt.nextLine();

            System.out.println("Enter " + name[i] + "'s Income:");
            salary[i] = bt.nextInt();
        }
        for (i = 0; i < count; i++) {
            System.out.println(name[i]);
            System.out.println(salary[i]);
        }

        // method to calculate the tax
        System.out.println("Name with  liable taxes");
        System.out.println("-----------------------");
 
        for  (i = 0; i<= count; i++) {
        calculateTax(name[i], salary[i]);
        }
    }

    static void calculateTax(String name, long  salary) {
      
 
      
            if (salary >= 300000) {
                float tax = 0.2f * salary;
                System.out.println(name + ":" + " $ " + tax);
            }

            else if (salary>= 100000) {
                float tax = 0.1f * salary;
                System.out.println(name + ":" + " $ " + tax);
            }

            else {
                float tax = 0.0f;
                System.out.println(name + ":" + " $ " + tax);
            }

         
    
    }

}
