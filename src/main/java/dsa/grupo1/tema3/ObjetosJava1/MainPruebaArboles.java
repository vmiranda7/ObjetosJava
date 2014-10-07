package dsa.grupo1.tema3.ObjetosJava1;
/* 
 * Herencia y Polimorfismo
 */

public class MainPruebaArboles
{
	public static void main(String args[])
	{
		Arbol arbol1 = new Arbol(4);
		Arbol arbol2 = new Arbol("Roble");
		Arbol arbol3 = new Arbol();
		Arbol arbol4 = new Arbol(5,"Pino");
		
		System.out.println("Un árbol de " +arbol1.getAltura()+ " metros");
		System.out.println("Un " +arbol2.getNombre());
		System.out.println("Un " +arbol3.getNombre());
		System.out.println("Un " +arbol4.getNombre()+ " de " +arbol4.getAltura()+ " metros");
	}

}
