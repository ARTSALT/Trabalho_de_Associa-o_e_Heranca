package Biblioteca_e_Livro;

public class Livro
{
    String titulo;
    String nomeDoAutor;
    int anoDePublicacao;
    int numeroDePaginas = 150;
    String status;

    public Livro (){}
    public Livro (String titulo, String nomeDoAutor, int anoDePublicacao, int numeroDePaginas)
    {
    	setTitulo(titulo);
    	setNomeDoAutor(nomeDoAutor);
    	setAnoDePublicacao(anoDePublicacao);
    	setNumeroDePaginas(numeroDePaginas);
    }

    public void setTitulo(String titulo)
    {
        if (titulo != null && titulo != "")
        {
            this.titulo = titulo;
        }
    }

    public String getTitulo()
    {return this.titulo;}


    public void setNomeDoAutor(String nomeDoAutor)
    {
        if (nomeDoAutor != null && nomeDoAutor != "")
        {
            this.nomeDoAutor = nomeDoAutor;
        }
    }

    public String getNomeDoAutor()
    {return this.nomeDoAutor;}


    public void setAnoDePublicacao(int anoDePublicacao)
    {
        this.anoDePublicacao = anoDePublicacao;
    }

    public int getAnoDePublicacao()
    {return this.anoDePublicacao;}


    public void setNumeroDePaginas(int numeroDePaginas)
    {
        if (numeroDePaginas >=150 && 1000 >= numeroDePaginas)
        {
            this.numeroDePaginas = numeroDePaginas;
        }
    }

    public int getNumeroDePaginas()
    {return this.numeroDePaginas;}


    public void setStatus(String status)
    {
        if (status == "Emprestado" || status == "Disponível")
        {
            this.status = status;
        }
    }

    public String getStatus()
    {return this.status;}

    public String toString()
    {
        return this.titulo + " " + this.nomeDoAutor + " " + this.anoDePublicacao + " " + this.numeroDePaginas + " " + this.status;
    }
}