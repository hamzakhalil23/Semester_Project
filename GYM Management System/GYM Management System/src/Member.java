import java.io.Serializable;
import java.sql.Date;

public class Member implements Serializable{

	String m_name;
	int m_id;
	int m_age;
	int m_fees;
	int due_fees;
	boolean fee_status;

	public Member(String m_name, int m_id, int m_age, int m_fees) {
		this.m_name = m_name;
		this.m_id = m_id;
		this.m_age = m_age;
		this.m_fees = m_fees;
		this.fee_status = false;
		this.due_fees = 0;
	}

	public void showDetail() {
		System.out.println("NAME: " + m_name + "\nID: " + m_id + "\nAGE: " + m_age + "\nFEES: " + m_fees);
	}

	public void dueFee() {
		if (fee_status == false) {
			due_fees = m_fees;
		} else {
			due_fees = 0;
		}
	}
}

//----------------------------------//

class PremiumMember extends Member implements Plan {

	char type;
	String plan;
	String trainerName;

	PremiumMember(String m_name, int m_id, int m_age, int m_fees, String trainerName) {
		super(m_name, m_id, m_age, m_fees);
		this.type = 'p';
		this.plan = "";
		this.trainerName = trainerName;
	}

        @Override
	public void showDetail() {
                System.out.println("====================");
		System.out.println("NAME: " + m_name + "\nID: " + m_id + "\nAGE: " + m_age + "\nFEES: " + m_fees);
		System.out.println("MEMBERSHIP TYPE: " + type + "\nPLAN: " + plan + "\nTRAINER NAME: " + trainerName);
	        System.out.println("====================");
        }

        @Override
	public String getPlan() {
		return this.plan;
	}

        @Override
	public void setPlan(String plan) {
		this.plan = plan;
	}

}

//----------------------------------//

class StandardMember extends Member implements Plan {

	char type;
	String plan;

	public StandardMember(String m_name, int m_id, int m_age, int m_fees) {
		super(m_name, m_id, m_age, m_fees);
		this.type = 's';
		this.plan = "";
	}

        @Override
	public void showDetail() {
                System.out.println("====================");
		System.out.println("NAME: " + m_name + "\nID: " + m_id + "\nAGE: " + m_age + "\nFEES: " + m_fees);
		System.out.println("MEMBERSHIP TYPE: " + type + "\nPLAN: " + plan);
                System.out.println("====================");
	}

        @Override
	public String getPlan() {
		return this.plan;
	}

        @Override
	public void setPlan(String plan) {
		this.plan = plan;
	}
}