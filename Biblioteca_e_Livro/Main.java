package Biblioteca_e_Livro;

import java.util.ArrayList;

public class Main 
{
	public static void main(String args[])
	{
		Livro livro1 = new Livro ("A Transformação da Intimidade", "Anthony Giddens", 1992, 221);
		Livro livro2 = new Livro ("a", "Artur", 1950, 160);
		Livro livro3 = new Livro ("Exilio Imaginário", "Carlos D'alge", 1993, 239);
		Livro livro4 = new Livro ("b", "Felipe", 1960, 150);
		Livro livro5 = new Livro ("O Pequeno Príncipe", "Antoine de Saint-Exupéry", 1943, 150);
		Livro livro6 = new Livro ("c", "Lucas", 1500, 160);
		ArrayList<Livro> acervo = new ArrayList<Livro>();
		ArrayList<Livro> acervo2 = new ArrayList<Livro>();
		
		acervo.add(livro1); acervo.add(livro2);
		acervo2.add(livro3); acervo2.add(livro4); acervo2.add(livro6);
		
		Biblioteca lib = new Biblioteca("Biblioteca do Seu Zé", "Rua do canto de lá", acervo); 
		
		lib.adicionarLivro(livro5);
		lib.adicionarLivro(acervo2);
		lib.emprestarLivros(2);
		lib.emprestarLivros(1);
		lib.devolverLivros(2);
	}
}
