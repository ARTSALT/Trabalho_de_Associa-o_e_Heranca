package ContaBancária;

public class ContaEspecial extends ContaCorrente 
{
	private float limite;
	private float saldo;
	
	
	
	
	
	public ContaEspecial() {}
	public ContaEspecial(String nomeCliente, int numeroConta, float saldo, float limite)
	{
		super(nomeCliente, numeroConta);
		setLimite(limite);
		setSaldo(saldo);
	}
	
	
	
	
	
	public void sacar(float quantia)
	{
		if (this.saldo + this.limite >= quantia)
		{
			setSaldo((this.saldo - quantia));
		}
	}
	
	
	
	
	
	public void setLimite(float quantia)
	{
		if (quantia > 0)
		{
			this.limite = quantia;
		}
		else
		{
			System.out.println("\nInsira uma quantia válida, por favor\n");
		}
	}
	
	public float getLimite()
	{return this.limite;}
	
	public void setSaldo(float saldo)
	{
		this.saldo = saldo;
	}
	
	public float getSaldo()
	{return this.saldo;}
	
	public String toString()
	{
		return super.getNomeCliente() + ", " + super.getNumeroConta() + ", " + this.saldo + ", " + this.limite + "\n";
	}
}
