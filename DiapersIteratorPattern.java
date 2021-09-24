import java.util.Iterator;

public class DiapersIteratorPattern{

	public static void main(String[] args) {
		Diapers d1 = new Diapers("Cloth or Reusable Diapers", 50);
		Diapers d2 = new Diapers("Disposable Diapers", 60);
		Diapers d3 = new Diapers("All-in-one Diapers", 100);

		DiapersMenuInterface DiapersMenu = new DiapersMenu();
		DiapersMenu.addDiapers(d1);
		DiapersMenu.addDiapers(d2);
		DiapersMenu.addDiapers(d3);

		System.out.println("Displaying Diapers Menu:");
		Iterator<Diapers> iterator = DiapersMenu.iterator();
		while (iterator.hasNext()) {
			Diapers Diapers = iterator.next();
			System.out.println(Diapers);
		}
	}

}