package Biblioteca_e_Livro;
import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca
{
    private String nome;
    private String local;
    private ArrayList<Livro> acervo;
    private Scanner scanner = new Scanner(System.in);
    
    public Biblioteca() {}
    public Biblioteca(String nome, String local, ArrayList<Livro> acervo)
    {
    	setNome(nome);
    	setLocal(local);
    	setAcervo(acervo);
    }    
    
    public void adicionarLivro(Livro livro)
    {
        if ((acervo.size() + 1) < 150 && livro != null)
        {
        	acervo.add(livro);
        }
        else
        {
            System.out.println("O acervo esta cheio ou o livro é vazio");
        }
    }

    public void adicionarLivro(ArrayList<Livro> livros)
    {
    	if ((acervo.size() + livros.size()) <= 150)
    	{
            for (int t0 = 0; t0 < (livros.size()); t0++)
            {
                if (livros.get(t0) == null)
                	break;
            }
            for (int t1 = 1; t1 < (livros.size() + 1); t1++)
            {
            	acervo.add(livros.get(t1 - 1));
            }
    	}
    }
    
    public void emprestarLivros(int numeroDeLivrosEmprestados)
    {
    	//Não encontrei uma maneira de impedir de colocar um valor maior que o número de livros disponíveis
    	if (numeroDeLivrosEmprestados > 0 && numeroDeLivrosEmprestados < 150)
    	{
	    	
	    	System.out.println("Os seguintes livros estão disponíveis:");
	    	//Loop que permite você escolher quais livros você quer
	    	for (int t1 = 0; t1 < numeroDeLivrosEmprestados; t1++)
	    	{
	    		
		    	//Loop que mostra os livros disponíveis
		    	for (int t0 = 0; t0 < acervo.size(); t0++)
		    	{
		    		if (acervo.get(t0).getStatus() == "Disponível")
		    		{
		    			System.out.println((t0 + 1) + ". " + acervo.get(t0).toString());
		    		}
		    	}
		    	
	    		System.out.println("\nQual o " + (t1 + 1) + "° livro que você gostaria de pegar emprestado?");
	    		System.out.println("Escolha através do índice");
	    		int t2 = scanner.nextInt();
	    		
	    		
	    		if (acervo.get(t2 - 1).getStatus() == "Disponível")
	    		{
	    			acervo.get(t2 - 1).setStatus("Emprestado");
	    		}
	    		else
	    		{
	    			System.out.println("O livro que você pediu não está disponível");
	    			t1 = t1 - 1;
	    		}
	    	}
	    	
	    	System.out.println("\nObrigado pela preferência");
    	}
    }
    
    public void devolverLivros(int numeroDeLivrosDisponíveis)
    {
    	//Não encontrei uma maneira de impedir de colocar um valor maior que o número de livros Emprestados
    	if (numeroDeLivrosDisponíveis > 0 && numeroDeLivrosDisponíveis < 150)
    	{
	    	
	    	//Loop que permite você escolher quais livros você quer
	    	for (int t1 = 0; t1 < numeroDeLivrosDisponíveis; t1++)
	    	{
	    		
		    	//Loop que mostra os livros Emprestados
		    	System.out.println("Os seguintes livros podem ser devolvidos:");
		    	for (int t0 = 0; t0 < acervo.size(); t0++)
		    	{
		    		if (acervo.get(t0).getStatus() == "Emprestado")
		    		{
		    			System.out.println((t0 + 1) + ". " + acervo.get(t0).toString());
		    		}
		    	}
		    	
	    		System.out.println("\nQual o " + (t1 + 1) + "° livro que você gostaria de devolver?");
	    		System.out.println("Escolha através do índice");
	    		int t2 = scanner.nextInt();
	    		
	    		if (acervo.get(t2 - 1).getStatus() == "Emprestado")
	    		{
	    			acervo.get(t2 - 1).setStatus("Disponível");
	    		}
	    		else
	    		{
	    			System.out.println("O livro que você pediu não está emprestado");
	    			t1 = t1 - 1;
	    		}
	    	}
	    	
	    	System.out.println("\nObrigado pela preferência");
    	}
    }

    public void setNome(String nome)
    {
        if (nome != null && nome != "")
        {
            this.nome = nome;
        }
    }

    public String getNome()
    {return this.nome;}


    public void setLocal(String local)
    {
        if (local != null && local != "")
        {
            this.local = local;
        }
    }

    public String getLocal()
    {return this.local;}


    public void setAcervo(ArrayList<Livro> l1)
    {   
        if (l1.size() <= 150)
        this.acervo = l1;
    }

    public ArrayList<Livro> getAcervo()
    {return this.acervo;}
}