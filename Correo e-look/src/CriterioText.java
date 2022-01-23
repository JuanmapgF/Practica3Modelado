
public class CriterioText implements EstrategiaMailbox {

	@Override
	public Boolean before(Email m1, Email m2) {
		return m1.getText().compareTo(m2.getText()) > 0;
	}

}
