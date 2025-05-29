public class Cantec {

	public String titlu;
	private String interpret;
	public String compozitor;
	private int durata;
	
//b
	public void setTitlu(String t) {
		this.titlu = t;
	}
	
	public void setInterpret(String i) {
		this.interpret = i;
	}
	
	public void setCompozitor(String c) {
		this.compozitor = c;
	}
	
	public void setDurata(int d) {
		this.durata = d;
	}
	
	public String getTitlu() {
		return titlu;
	}
	
	public String getInterpret() {
		return interpret;
	}
	
	public String getCompozitor() {
		return compozitor;
	}
	
	public int getDurata() {
		return durata;
	}
	
//a
	//constructor implicit
	Cantec() {
		
		setTitlu("");
		setInterpret("");
		setCompozitor("");
		setDurata(0);
	}
	
	//constructor cu toate atributele
	Cantec(String t, String i, String c, int d) {
		setTitlu(t);
		setInterpret(i);
		setCompozitor(c);
		setDurata(d);
	}
	
	
//c
	public String toString() {
		return "(" + getTitlu() + "," + getDurata() + ")";
	}
	
	
//d
	public void TransformareDurata() {
		double min = durata / 60;
		double sec = durata % 60;
		System.out.println("Durata in minute: " + min + "minute si " + sec + "secunde");
	}
	
}
