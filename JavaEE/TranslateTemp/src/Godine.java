import java.util.Scanner;

public class Godine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int god;

		System.out.println("Unesite godinu: ");
		Scanner s = new Scanner(System.in);
		god = s.nextInt();

		if ((god > 1990) && (god < 2019)) {

			if (god % 2 == 0) {

				System.out.println("Rodjeni ste " + god + " i ta godina je parna!");
			} else {

				System.out.println("Rodjeni ste " + god + " i ta godina je neparna!");
			}
			
			
			
		} else {
			System.out.println("Godine nisu u zadatom rasponu!!!");
		}
	}
}