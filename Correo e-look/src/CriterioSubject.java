
public class CriterioSubject implements EstrategiaMailbox {

	@Override
	public Boolean before(Email m1, Email m2) {
		return m1.getSubject().compareTo(m2.getSubject()) > 0;
	}

}
