package bytebank;

import java.awt.List;
import java.util.ArrayList;

/**
 * List = SÓ TRABALHAR COM STRINGS
 * ArrayLista = TRABALHA COM TODOS OS OUTROS OBJETOS
 * 
 * @author MATHEUS
 *
 */

public class ArrayListTest {
	public static void main(String[] args) {
		
		Conta c1 = new Conta(800,"Ronaldo");
		Conta c2 = new Conta(600,"João");
		Conta c3 = new Conta(700,"Silva");
		
		ArrayList<Conta> conta = new ArrayList<>();
		
		conta.add(c1);
		conta.add(c2);
		conta.add(c3);
		
		
		
		for(int i = 0; i < conta.size();i++) {
			System.out.println(conta.get(i));
		}
		
		/*
		for (Conta c : conta) {
			System.out.println(c);
		}
		*/
		
		ArrayList<String> nome = new ArrayList<String>();
		
		nome.add("Ronaldo");
		nome.add("João");
		nome.add("Silva");
		
		//System.out.println(nome.get(0));
		
	}
}
