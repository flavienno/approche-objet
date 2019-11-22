package tri;

import java.util.Comparator;

public class ComparatorHabitant implements Comparator<Pays> {

	@Override
	public int compare(Pays o1, Pays o2) {
		if (o1.getNbHab() > o2.getNbHab()) {
			return 1;
		}
		if (o1.getNbHab() < o2.getNbHab()) {
			return -1;
		} else
			return 0;

	}

}
