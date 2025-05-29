public class TestCantec {

	public static void main(String args[]) {
		
		Cantec Song1 = new Cantec("Knee Socks", "Arctic Monkeys", "Arcric Monkeys", 250 );
		System.out.println(Song1.toString());
		Cantec Song2 = new Cantec("Drama Queen", "The Motans", "Denis Robes", 195 );
		System.out.println(Song2.toString());
		Cantec Song3 = new Cantec("Valentine", "Maneskin", "Damiano David", 201 );
		System.out.println(Song3.toString());
		
		Cantec songs[] = new Cantec[3];
		
		songs[0] = Song1;
		songs[1] = Song2;
		songs[2] = Song3;
		
		int j;
		for(j = 0; j < 3; j++) {
			System.out.println(songs[j].toString());
			songs[j].TransformareDurata();
		}
	}
}
