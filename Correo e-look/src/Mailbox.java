import java.util.ArrayList;
import java.util.List;

public class Mailbox {
	
	private List<Email> emails;
	private EstrategiaMailbox estrategiaMailbox;
	
	public Mailbox() {
		emails = new ArrayList<Email>();
	}
	
	public void show() {
		if(estrategiaMailbox != null) {
			this.sort();
		}
		System.out.print(emails.toString());
	}
	
	public List<Email> getEmails() {
		return emails;
	}

	public void setEmails(List<Email> emails) {
		this.emails = emails;
	}
	
	private void sort() {
		for (int i = 2; i <= emails.size(); i++) {
			for (int j = emails.size(); j >= i; j--) {

				if (before(emails.get(j), emails.get(j - 1))) {
					Email aux = emails.get(j - 1);
					emails.set(j - 1, emails.get(j));
					emails.set(j, aux);
				}

			}

		}
	}
	
	private Boolean before(Email m1, Email m2) {
		return estrategiaMailbox.before(m1, m2);
	}
	
	

	public EstrategiaMailbox getEstrategiaMailbox() {
		return estrategiaMailbox;
	}

	protected void setEstrategiaMailbox(EstrategiaMailbox estrategiaMailbox) {
		this.estrategiaMailbox = estrategiaMailbox;
	}

}
