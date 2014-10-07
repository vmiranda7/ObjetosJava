package dsa.grupo1.tema3.ObjetosJava2;
/* 
 * Constructores
 */

public class MainPruebaFormas
{
	public static void main(String[] args) {
		Forma[] s = new Forma[3];
		s[0] = new Forma();
		// Circulo es tambien una Forma
		s[1] = new Circulo();
		// Cuadrado es tambien una Forma
		s[2] = new Cuadrado();
		
		for(int i = 0; i < s.length; i++)
			{
			s[i].queEs();
			System.out.println(s[i].queEs());
	}}
}
			

					