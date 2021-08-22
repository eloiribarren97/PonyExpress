package pony;

public class Main {

	public static void main(String[] args) {
		System.out.println(caballos(new int[] { 100, 101 }));
		
	}
	public static int caballos(int[] distancias) {
		int distanciaTotal=0;
		int totalCaballos= 1;
		
		for(int i=0;i<distancias.length;i++) {
			distanciaTotal+=i;
		}
		int redondeoCaballos = Math.round(distanciaTotal/100+1);
		return totalCaballos + redondeoCaballos;
	}

}
