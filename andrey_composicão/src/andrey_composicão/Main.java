package andrey_composicão;

	public class Main {
	    public static void main(String[] args) {

	        Pedido pedido = new Pedido(101);

	        pedido.adicionarItem("Pizza Calabresa", 55.90);
	        pedido.adicionarItem("Refrigerante", 8.50);
	        pedido.adicionarItem("Sobremesa", 12.00);

	        pedido.exibirResumo();
	    }
	}

