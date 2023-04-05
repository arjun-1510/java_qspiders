import java.util.Scanner;

class Hotels {

    void Bhuhari() {
        System.out.println("Thanks for choosing Bhuhari");
       // System.out.println("briyani");
        //System.out.println("Mutton briyani");

        Scanner sc = new Scanner(System.in);
      int select =  sc.nextInt();

      switch(select) {

      case 1 :  System.out.println("Briyani");
      break;
      case 2 :  System.out.println("Poratta");
      break;
      case 3 :  System.out.println("Chicken_65");
      break;
       case 4 : System.out.println("Noodles");
       default: System.out.println("Not matching");


      }
        

    }
    
}


class S_S_Hydrabhat {

    void Sshydrabhat() 
    {

        System.out.println("Thanks for choosing S.S Hydrabhat Briyani");
        System.out.println("SS.Hydrabhat");
        Scanner sc = new Scanner(System.in);
       int ve = sc.nextInt();


switch(ve) {
    case 1 : System.out.println("Dum Cheicken Briyani ");
    break;
    case 2:  System.out.println("Dum Mutton Briyani ");
    break;
}
       
    }
}


