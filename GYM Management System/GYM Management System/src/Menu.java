import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Menu {

	Gym golds_gym = new Gym("GOLD'S GYM", "123-Street,abc-Town,London");

	public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {

		System.out.println("1: Add Premium Member\n2: Add Standard Member\n3: Members Details"
				+ "\n4: Collect Fee\n5: Member Fee Status\n6: Fee Defaulters"
				+ "\n7: Estimated Income\n8: Current Income\n9: Reset Fee Status\n10: Save Data\n11:Load Data\n0: Exit");
		Menu m = new Menu();
		m.mainMenu();
	}

	public void mainMenu() throws IOException, FileNotFoundException, ClassNotFoundException {
		boolean run = true;
		while (run == true) {
			Scanner inp = new Scanner(System.in);
			System.out.print("\nEnter Your Choice:");
			int choice = inp.nextInt();
			switch (choice) {
			case 1: {
				// add premium member
				System.out.print("Enter Member's Name:");
				String m_name = inp.next();
				System.out.print("Enter Member's Age:");
				int m_age = inp.nextInt();
				System.out.print("Enter Member's Fees:");
				int m_fees = inp.nextInt();
				System.out.print("Enter Trainer's Name:");
				String t_name = inp.next();
				golds_gym.addPremiumMember(m_name, m_age, m_fees, t_name);
				break;
			}

			case 2: {
				// add standard member
				System.out.print("Enter Member's Name:");
				String m_name = inp.next();
				System.out.print("Enter Member's Age:");
				int m_age = inp.nextInt();
				System.out.print("Enter Member's Fees:");
				int m_fees = inp.nextInt();
				golds_gym.addStandardMember(m_name, m_age, m_fees);
				break;
			}
			case 3: {
				// member details
				System.out.print("Enter Member's Id:");
				int m_id = inp.nextInt();
				golds_gym.viewMemberDetails(m_id);
				break;
			}
			case 4: {
				// collect fee
				System.out.print("Enter Member's Id:");
				int m_id = inp.nextInt();
				golds_gym.collectFee(m_id);
				break;
			}
			case 5: {
				// member fee status
				System.out.print("Enter Member's Id:");
				int m_id = inp.nextInt();
				golds_gym.showFeeStatus(m_id);
				break;
			}
			case 6: {
				// fee defaulters
				golds_gym.showDefaulters();
				break;
			}
			case 7: {
				// estimated income
				System.out.println(golds_gym.getEstimatedIncome());
				break;
			}
			case 8: {
				// current income
				System.out.println(golds_gym.getCurrentIncome());
				break;
			}
			case 9: {
				// reset fee status
				golds_gym.resetAllFeeStatus();
				break;
			}
                        case 10: {
				// reset fee status
				golds_gym.saveData();
				break;
			}
                        case 11: {
				// reset fee status
				golds_gym.readData();
				break;
			}
			case 0: {
				run = false;
				System.out.println("Exitting !!!");
				break;
			}
			default: {
				run = false;
				System.out.println("Exitting !!!");
				break;
			}
			}

		}
	}
}