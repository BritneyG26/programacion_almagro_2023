package Ejercicios;

import java.util.Arrays;

public class Paresprint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int par=0; par<=10; par+=2 ) {
			System.out.println(par);
			
			Arrays.sort(par);
			for (int i = par.length =1; i>= 0; i++) {
				System.out.println(""+par[i]);
			}
		}
	}

}
