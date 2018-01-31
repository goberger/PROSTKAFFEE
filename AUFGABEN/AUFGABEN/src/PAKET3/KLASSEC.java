package PAKET3;

class KLASSEA{void mach_was() {}}

class KLASSEB extends KLASSEA {void mach_was_anderes() {}}

class KLASSEC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object A11;
		Object A12;
		Object B11;
		A11=new KLASSEA();
		A12=new KLASSEB();
		B11=new KLASSEB();
		KLASSEA A1= (KLASSEA)A11;
		KLASSEA A2=(KLASSEA)A12;
		KLASSEB B1=(KLASSEB)B11;
		A2.mach_was();
		((KLASSEB)A2).mach_was_anderes();
		//KLASSEA A1 = new KLASSEA();
		//KLASSEA A2 = new KLASSEB();
		//KLASSEB B1 = new KLASSEB();
		//((KLASSEB)A2).mach_was_anderes();

	}

}
