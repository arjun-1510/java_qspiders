import java.util.Scanner;

public class Pages2 {

     void bhuharihotel() {

        Pages p2 = new Pages();
        p2.bhuhari();
        Scanner no = new Scanner(System.in) ;
        System.out.println("Select your Dish Number");
        int bhu = no.nextInt();

        if(bhu == 1) {
            System.out.println("\t\t*********Choose your Payment Method ************\n1.Google pay\n2.OR code\n3.Cash");
        }

    }
    
}
