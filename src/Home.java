import  java.util.Scanner;

class Workout {

   public static void main(String args []) 

    {

        String username = "Arjun-15";

        int password = 123;

       Scanner scn = new Scanner(System.in);
      System.out.println("Enter Your Name");
       String use = scn.nextLine();

       System.out.println("Enter Your Password");
      int ps = scn.nextInt();

     while(true) {

        if(username.equals(use) && password == ps) {
            

        System.out.println("Bhuhari Hotle");
        System.out.println("S.S Hydrabhat Briyani");
        System.out.println("Bismi Briyani");
        System.out.println("Kfc India");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Hotels");
        sc.nextInt();

       
        
        
        }
        else {
            System.out.println("Invalid Username or Password");
            break;
        }
     }

        

        
 
        
       


      
       }

       }
        
       
    

    
    




