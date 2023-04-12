import java.util.Scanner;

public class Pages3 {

    public static void main (String [] args) throws Exception {

        Pages2 no = new Pages2();
        no.bhuharihotel();
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose Payment Mode");
        int num = sc.nextInt();

        if(num ==1) {

            System.out.println("\t\t***********Please Enter Your Phone number***********");
            Scanner opp = new Scanner(System.in);
          String ph = opp.nextLine();

         

          
            




           

                System.out.println("Waiting for Your  OTP");

                Thread.sleep(2000);

                int otpno = (int) (Math.random() * 9000) + 1000;

                System.out.println("Your otp is " + otpno);

                Scanner otpg= new Scanner(System.in);
            System.out.println("Enter your OTP number");
           int otpval =  otpg.nextInt();


            if(otpno == otpval) { 

                Thread.sleep(2000);

                System.out.println("Your Order is Booked Almost");

            }
            else {
                System.out.println("Invalid Otp");
            }




            }
            
        } 
        }
    
    

