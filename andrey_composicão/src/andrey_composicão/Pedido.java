package andrey_composicão;

import java.util.ArrayList;

public class Pedido {
    private int numeroPedido;
    private ArrayList<ItemPedido> itens;
    private double valorTotalPedido;

    public Pedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
        this.itens = new ArrayList<>();
        this.valorTotalPedido = 0.0;
    }

    // Cria o ItemPedido dentro da classe Pedido (Composição)
    public void adicionarItem(String nomePrato, double preco) {
        ItemPedido item = new ItemPedido(nomePrato, preco);
        itens.add(item);
        valorTotalPedido += preco;
    }

    public void exibirResumo() {
        System.out.println("Número do Pedido: " + numeroPedido);
        System.out.println("Itens do Pedido:");

        for (ItemPedido item : itens) {
            System.out.println("- " + item.getNomePrato()
                    + " - R$ " + String.format("%.2f", item.getPreco()));
        }

        System.out.println("Valor Total: R$ " + String.format("%.2f", valorTotalPedido));
    }
}