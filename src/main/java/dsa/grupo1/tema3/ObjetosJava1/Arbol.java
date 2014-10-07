package dsa.grupo1.tema3.ObjetosJava1;

public class Arbol {

	private Integer altura;
	private String nombre;
	
	Arbol(int altura, String nombre){
	      this.altura = altura;	 
	      this.nombre = nombre;
	   }
	
	Arbol(int altura){
	      this.altura = altura;	
	      nombre = "árbol";
	   }
	
	Arbol(String nombre){ 
	      this.nombre = nombre;
	   }
	
	Arbol(){
		nombre = "árbol generico";
	   }
	public String getNombre(){
		return nombre;
	}
	public Integer getAltura(){
		return altura;
	}
}
