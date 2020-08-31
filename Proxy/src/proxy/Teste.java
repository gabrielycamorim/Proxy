package proxy;

public class Teste {
	public static void main(String[] args) {
		BebidaAlcoolica bebida1 = new TemIdadeProxy(new Cliente("17"));
		bebida1.podeBeber();

	}
}
