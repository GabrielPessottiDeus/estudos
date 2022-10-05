// Nas listas podemos inserir ou remover elementos em QUALQUER POSIÇÃO

class Lista {
    int[] array;
    int n;

    Lista() {
        this(6);
    }

    Lista (int tamanho) {
        array = new int[tamanho];
        n = 0;
    }

    public void inserirInicio(int x) throws Exception{
        if(n >= array.length) {
            throw new Exception("ERRO");
        }

        for(int i = n; i > 0; i--) {
            array[i] = array[i - 1];
        }

        array[0] = x;
        n++;
    }

    public void inserirFim(int x) throws Exception{
        if(n >= array.length) {
            throw new Exception("ERRO");
        }

        array[n] = x;
        n++;
    }

    public void inserir (int x, int posicao) throws Exception{
        if(n >= array.length || posicao < 0 || posicao > n) {
            throw new Exception("ERRO");
        }

        for(int i = n; i > posicao; i--) {
            array[i] = array[i - 1];
        }

        array[posicao] = x;
        n++;
    }

    public int removerInicio() throws Exception{
        if(n == 0) {
            throw new Exception("ERRO");
        }

        int resp = array[0];
        n--;

        for(int i = 0; i < n; i++) {
            array[i] = array[i + 1];
        }

        return resp;
    }

    public int removerFim() throws Exception{
        if(n == 0) {
            throw new Exception("ERRO");
        }

        return array[--n];
    }

    public int remover (int posicao) throws Exception {
        if(n == 0 || posicao < 0 || posicao >= n) {
            throw new Exception("ERRO");
        }

        int resp = array[posicao];
        n--;

        for(int i = posicao; i < n; i++) {
            array[i] = array[i + 1];
        }

        return resp;
    }

    public void mostrar() {
        System.out.print("[");
        for(int i = 0; i < n; i++) {
            System.out.printf(array[i] + " ");
        }
        System.out.print("]");
    }
}

public class estudoLista {
    public static void main (String[] args) throws Exception {
        System.out.println("=====LISTA LINEAR=====");
        Lista lista = new Lista(6);

        int x1, x2, x3;
        lista.inserirInicio(1);
        lista.inserirFim(7);
        lista.inserirFim(9);
        lista.inserirInicio(3);
        lista.inserir(8, 3);
        lista.inserir(4, 2);

        lista.mostrar();

        x1 = lista.removerInicio();
        x2 = lista.removerFim();
        x3 = lista.remover(2);

        System.out.println(x1 + "," + x2 + "," + x3);
        lista.mostrar();
    }
}