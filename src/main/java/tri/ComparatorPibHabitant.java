package tri;

import java.util.Comparator;

public class ComparatorPibHabitant implements Comparator<Pays> {

	@Override
	public int compare(Pays o1, Pays o2) {
		if (o1.getPibHab() > o2.getPibHab()) {
			return 1;
		}
		if (o1.getPibHab() < o2.getPibHab()) {
			return -1;
		} else
			return 0;
	}
}