import java.util.Scanner;

class Workout {

   public static  void main(String args []) 

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

        break;
        
        //int selection = sc.nextInt();
        }
        else {
            System.out.println("Invalid Username or Password");
            break;
        }
     }

        

        
 
        
       


       /*if(selection == 1) {
        Hotels ne = new Hotels();
        ne.Bhuhari();
        System.out.println();
       }
       else if(selection == 2) {

        S_S_Hydrabhat se = new S_S_Hydrabhat();
        se.Sshydrabhat();

       }

       }
        A
       }*/
    }
}
    
    



