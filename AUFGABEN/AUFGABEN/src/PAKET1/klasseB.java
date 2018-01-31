package PAKET1;

class klasseA {
	// public klasseA() {}
	public klasseA(String wort) {
		System.out.print("B");
	}
}

public class klasseB extends klasseA {
	public klasseB(String wort) {
		super("A");
		System.out.print("D");
	}

	public static void main(String[] args) {
		new klasseC("C");
		System.out.println(" ");
	}
}
class klasseC extends klasseB {

	public klasseC(String wort) {
		super(wort);
		System.out.println("C");
		// TODO Auto-generated constructor stub
	}
	
}
