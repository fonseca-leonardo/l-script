import java.util.*;
public class MainClass{ 
  public static void main(String args[]){
    Scanner _key = new Scanner(System.in);
	String  teste;
	double  contador;
	boolean  valor;
	double  cont;
	valor = true;
	System.out.println("Qual o valor a?");
	teste = "oi";
	if (valor==true) {
		for (contador = 1; contador <= 5; ++ contador) {
		System.out.println(contador);
		System.out.println("tchau");
	}
	} else {
		System.out.println("Voce falou");
		System.out.println(teste);
	}

	cont = 0;
	while (valor==true) {
		cont = cont+1;
		System.out.println(cont);
		if (cont>=3) {
		valor = false;
	}
	}
  }
}