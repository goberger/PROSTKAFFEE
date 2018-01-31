package PAKET1;

import java.util.ArrayList;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class FOREACH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] Bogen = new String[]{"otto", "Peter", "helga", "Anton", "Ernst", "Anna", "Konrad", "Pluto", "Goofy"};
		int x=17;
		int zahl[] = new int[x];
		zahl[0]=6;
		zahl[1]=7;
		zahl[2]=8;
		zahl[3]=9;
		

		for (int i = 0; i < Bogen.length; i++) {
			String elem = Bogen[i];
			System.out.println("Vorname:"+Bogen[i]);
		}
		
		for (int k : zahl)
		{
			if(k==7)
			{
				break;
			}
			System.out.println("Zahl (neu):"+ k);
		}
		for (String elem: Bogen) {
			
			System.out.println("Vorname:"+elem);
		}
		
	}

}
