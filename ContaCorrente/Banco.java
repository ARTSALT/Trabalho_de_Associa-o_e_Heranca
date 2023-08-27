package ContaBancária;

public class Banco 
{
	public static void main(String args[])
	{
		//a)
		ContaCorrente a = new ContaCorrente("Jaime Simons", 01, 1000.0f);
		ContaPoupanca b = new ContaPoupanca("Christina Tobin", 02, 2000.0f, 11, 0.7);
		ContaEspecial c = new ContaEspecial("Norris Stanley", 03, 2000.0f, 10000.0f);
		
		//b)
		System.out.println(a.getSaldo());
		a.sacar(300.7f);
		System.out.println(a.getSaldo() + "\n");
		
		System.out.println(c.getSaldo());
		c.sacar(11000.2f);
		System.out.println(c.getSaldo() + "\n");
		
		
		//c)
		System.out.println(a.getSaldo());
		a.depositar(200.5f);
		System.out.println(a.getSaldo() + "\n");
		
		System.out.println(b.getSaldo());
		b.depositar(600.4f);
		System.out.println(b.getSaldo() + "\n");
		
		
		//d)
		System.out.println(b.getSaldo());
		b.calcularNovoSaldo();
		System.out.println(b.getSaldo() + "\n");
		
		
		//e)
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
