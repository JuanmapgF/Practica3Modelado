
public class CriterioPriority implements EstrategiaMailbox {

	@Override
	public Boolean before(Email m1, Email m2) {
		return m1.getPriority().compareTo(m2.getPriority()) > 0;
	}

}
