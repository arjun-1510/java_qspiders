import java.util.Scanner;

class Workout {

   public static  void main(String args []) 

    {
        System.out.println("Bhuhari Hotle");
        System.out.println("S.S Hydrabhat Briyani");
        System.out.println("Bismi Briyani");
        System.out.println("Kfc India");

        Scanner sc = new Scanner(System.in);
        int selection = sc.nextInt();

        

        
       


       if(selection == 1) {
        Hotels ne = new Hotels();
        ne.Bhuhari();
        System.out.println();
       }
       else if(selection == 2) {

        S_S_Hydrabhat se = new S_S_Hydrabhat();
        se.Sshydrabhat();

       }

       }
        
       }
    
    



