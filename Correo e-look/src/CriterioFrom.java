
public class CriterioFrom implements EstrategiaMailbox {

	@Override
	public Boolean before(Email m1, Email m2) {
		return m1.getFrom().compareTo(m2.getFrom()) > 0 ;
	}

}
