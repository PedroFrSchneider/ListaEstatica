public class Main {
    public static void main(String[] args) {
        ListaEstatica<String> lista = new ListaEstatica<>(5);

        lista.adicionar("Item 1");
        lista.adicionar("Item 2");
        lista.adicionar("Item 3");

        lista.exibir();

        lista.remover(1);

        System.out.println("Após remover o segundo item:");
        lista.exibir();
    }
}
