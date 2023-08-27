package ContaBancária;

public class ContaCorrente 
{
	private String nomeCliente;
	private int numeroConta;
	private float saldo;
	
	
	
	
	
	public ContaCorrente() {}
	public ContaCorrente(String nomeCliente, int numeroConta, float saldo)
	{
		setNomeCliente(nomeCliente);
		setNumeroConta(numeroConta);
		setSaldo(saldo);
	}
	
	public ContaCorrente(String nomeCliente, int numeroConta)
	{
		setNomeCliente(nomeCliente);
		setNumeroConta(numeroConta);
	}
	
	
	
	
	
	public void sacar(float quantia)
	{
		if (quantia <= this.saldo)
		{
			this.saldo = this.saldo - quantia;
		}
	}
	
	public void depositar(float quantia)
	{
		this.saldo = this.saldo + quantia;
	}
	
	
	
	
	
	public void setNomeCliente(String nomeCliente)
	{
		if (nomeCliente != null & nomeCliente != "")
		{
			this.nomeCliente = nomeCliente;
		}
	}
	
	public String getNomeCliente()
	{return nomeCliente;}
	
	public void setNumeroConta(int numeroConta)
	{
		if (numeroConta > 0)
		{
			this.numeroConta = numeroConta;
		}
	}
	
	public int getNumeroConta()
	{return this.numeroConta;}
	
	public void setSaldo(float saldo)
	{
		if (saldo > 0)
		{
			this.saldo = saldo;
		}
	}
	
	public float getSaldo()
	{return this.saldo;}
	
	public String toString()
	{
		return this.nomeCliente + ", " + this.numeroConta + ", " + this.saldo + "\n";
	}
}
