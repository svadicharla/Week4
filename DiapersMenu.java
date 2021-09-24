import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DiapersMenu implements DiapersMenuInterface {

	List<Diapers> diaperMenu;

	public DiapersMenu() {
		diaperMenu = new ArrayList<Diapers>();
	}

	@Override
	public void addDiapers(Diapers Diapers) {
		diaperMenu.add(Diapers);
	}

	@Override
	public Iterator<Diapers> iterator() {
		return new MenuIterator();
	}

	class MenuIterator implements Iterator<Diapers> {
		int indexValue = 0;

		@Override
		public boolean hasNext() {
			if (indexValue >= diaperMenu.size()) {
				return false;
			} else {
				return true;
			}
		}

		@Override
		public Diapers next() {
			return diaperMenu.get(indexValue++);
		}

	}

}