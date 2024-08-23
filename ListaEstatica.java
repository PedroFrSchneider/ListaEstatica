public class ListaEstatica<T> {
    private T[] itens;
    private int contador;

    @SuppressWarnings("unchecked")
    public ListaEstatica(int capacidade) {
        this.itens = (T[]) new Object[capacidade];
        this.contador = 0;
    }

    public boolean adicionar(T item) {
        if (contador < itens.length) {
            itens[contador] = item;
            contador++;
            return true;
        } else {
            return false;
        }
    }

    public T obter(int indice) {
        if (indice >= 0 && indice < contador) {
            return itens[indice];
        } else {
            throw new IndexOutOfBoundsException("Índice fora dos limites da lista.");
        }
    }

    public boolean remover(int indice) {
        if (indice >= 0 && indice < contador) {
            for (int i = indice; i < contador - 1; i++) {
                itens[i] = itens[i + 1];
            }
            itens[contador - 1] = null;
            contador--;
            return true;
        } else {
            return false;
        }
    }

    public boolean estaCheia() {
        return contador == itens.length;
    }

    public boolean estaVazia() {
        return contador == 0;
    }

    public int tamanho() {
        return contador;
    }

    public void exibir() {
        for (int i = 0; i < contador; i++) {
            System.out.println(itens[i]);
        }
    }
}
