package ContaBancária;

public class ContaPoupanca extends ContaCorrente 
{
	private int diaDeRendimento;
	private double taxaDeRendimento;
	
	
	
	
	
	public ContaPoupanca() {}
	public ContaPoupanca(String nomeCliente, int numeroConta, float saldo, int diaDeRendimento, double taxaDeRendimento)
	{
		super(nomeCliente, numeroConta, saldo);
		setDiaDeRendimento(diaDeRendimento);
		setTaxaDeRendimento(taxaDeRendimento);
	}
	
	
	
	
	
	public void calcularNovoSaldo()
	{
		super.setSaldo(((super.getSaldo() * (float) this.taxaDeRendimento) + super.getSaldo()));
	}
	
	
	
	
	
	public void setDiaDeRendimento(int diaDeRendimento)
	{
		if (diaDeRendimento <= 31 && diaDeRendimento > 0)
		{
			this.diaDeRendimento = diaDeRendimento;
		}
		else
		{
			System.out.println("\nInsira um valor válido, por favor\n");
		}
	}
	
	public int getDiaDeRendimento()
	{return this.diaDeRendimento;}
	
	public void setTaxaDeRendimento(double taxaDeRendimento)
	{
		if (taxaDeRendimento > 0)
		{
			this.taxaDeRendimento = taxaDeRendimento;
		}
		else
		{
			System.out.println("\nInsira um valor válido, por favor\n");
		}
	}
	
	public double getTaxaDeRendimento()
	{return this.taxaDeRendimento;}
	
	public String toString()
	{
		return super.getNomeCliente() + ", " + super.getNumeroConta() + ", " + super.getSaldo() + ", " + this.diaDeRendimento + 
				", " + this.taxaDeRendimento + "\n";
	}
}
