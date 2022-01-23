
public class CriterioDate implements EstrategiaMailbox {

	@Override
	public Boolean before(Email m1, Email m2) {
		return m1.getDate().before(m2.getDate());
	}

}
