package arreglos;
import java.util.*;
public class cadena {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] nombres;
		String[] estados = new String[5];
		
		
		estados[0] = "jalisco";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("cuantos elementos quieres almacenar?");
		int elementos =sc.nextInt();
		
		nombres = new String[elementos];
		for (int i = 0; i < nombres.length; i ++) {
			System.out.println("nombre: " + i);
			nombres[i] = sc.next();
		}
	
	
		for(String nombre : nombres) {
			System.out.println(nombre);
		}
	}
}
