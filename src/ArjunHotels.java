
import java.util.*;

public class ArjunHotels {

	static Scanner sc = new Scanner(System.in);
	static boolean user_login_validation = false;
	static int attempt;
	static int ph;
	static int psw;

	public static void main(String[] args) throws Exception {

		System.out.println("\t\tWelcome Swigge");
		System.out.println("1.Signup\n2.Login\n3.exit");
		System.out.println("Select Signup or Login");

		do {

			int user_input1 = sc.nextInt();

			switch (user_input1) {
				case 1: {

					System.out.println("Enter your Contact Number");
					ph = sc.nextInt();

					System.out.println("Enter your Password Number");
					psw = sc.nextInt();
					user_login_validation = true;
					System.out.println("1.Signup\n2.Login\n3.exit");

					break;

				}

				case 2: {

					if (user_login_validation) {

						System.out.println("Welocome to Login Page");
						System.out.println("Enter Your Conntact Number ");
						int login_cont = sc.nextInt();
						System.out.println("Enter Your password ");
						int login_psw = sc.nextInt();

						if (login_cont == ph && login_psw == psw) {

							System.out.println("Select Your Hotels ");
							System.out.println("1.S.S. Hydrabhate\n2.Bhuhari\n3.Arifa");

							// work for Hotel selection

							int Hotel_selection = sc.nextInt();

							switch (Hotel_selection) {

								case 1:
									System.out.println("\t\t Thanks for select S.S Hydrabhat/n");
									System.out.println("\t***********Your Menu**********");
									System.out.println("1.Mutton Briyani\n2.Chicken Briyani\n3.exit");
									System.out.println("Select your Dish");
									int food_selection = sc.nextInt();
									double mutton_price = 380;

									if (food_selection == 1) {

										System.out.println("Mutton Briyani " + mutton_price);
										System.out.println("Enter your Quantity");
										int qun = sc.nextInt();

										double Total = mutton_price * qun;
										System.out.println("Your Total Amount " + Total);

										System.out.println("\t\tSelect your Payment Method");
										System.out.println("1.Google Pay\n2.paytm\n3.exit");

										int pay = sc.nextInt();

										if (pay == 1) {

											System.out.println("Enter you Contact Number");

											int phX = sc.nextInt();

											System.out.println("Waiting For your Otp");

											Thread.sleep(2000);

											int otpNo = (int) (Math.random() * 9000) + 1000;
											System.out.println(otpNo);

											System.out.println("Enter your Otp");

											int otpx = sc.nextInt();

											if (otpx == otpNo) {
												System.out.println("Payment Successfully");

											} else {
												System.out.println("Invalid Otp");
											}

										}

									}
							}

						} else {
							System.out.println("Invalid Password or Contact Number");
						}

					} else {
						System.out.println("Lee Testu potta");
						attempt++;

						if (attempt == 1) {
							System.out.println("Please Signup first");
						}
						if (attempt == 2) {
							System.out.println("Daii Signup Pandra Baaduu");
							if (attempt == 3) {
								System.out.println("Get Lost");
								user_login_validation = false;

							}
						}
					}
				}

			}

		} while (true);

	}
}
