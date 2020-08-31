package proxy;


import proxy.TemIdade;

public class TemIdadeProxy implements BebidaAlcoolica {

    private Cliente cliente;
    private BebidaAlcoolica bebida;

    public TemIdadeProxy(Cliente cliente) {
        this.cliente = cliente;
        this.bebida = new TemIdade();
    }

 
	public void podeBeber() {
        if (cliente.equals("18")) {
            bebida.podeBeber();
        } else {
            System.out.printf("Sinto muito mas você não pode beber", cliente);
        }
    }
}
