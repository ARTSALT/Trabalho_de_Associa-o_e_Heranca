package ContaBancária;

public class Banco 
{
	public static void main(String args[])
	{
		//a)
		ContaCorrente a = new ContaCorrente("Jaime Simons", 01, 1000.0f);
		ContaPoupanca b = new ContaPoupanca("Christina Tobin", 02, 2000.0f, 11, 0.7);
		ContaEspecial c = new ContaEspecial("Norris Stanley", 03, 10000.0f, 2000.0f);
		
		//b)
		a.getSaldo();
		a.sacar(300.7f);
		a.getSaldo();
		
		c.getSaldo();
		c.sacar(11000.2f);
		c.getSaldo();
		
		
		//c)
		a.depositar(200.5f);
		a.getSaldo();
		
		b.getSaldo();
		b.depositar(600.4f);
		b.getSaldo();
		
		
		//d)
		b.getSaldo();
		b.calcularNovoSaldo();
		b.getSaldo();
		
		
		//e)
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
