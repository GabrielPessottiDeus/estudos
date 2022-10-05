// As pilhas são um Tipo Abstrato de Dados (TAD) no qual o primeiro elemento que entra é o último que sai
// First In, Last Out (FILO)

/*public class estudoPilha{

    private Fila f1, f2;
 
    public estudoPilha(){
      f1 = new Fila(6);
      f2 = new Fila(6);
    }
 
    public estudoPilha(int tamanho){
      f1 = new Fila (tamanho);
      f2 = new Fila (tamanho);
    }
 
    public void empilhar(int elemento) throws Exception {
      while(!f1.isVazia()){
        f2.inserir(f1.remover());
      }
 
      f1.inserir(elemento);
 
      while(!f2.isVazia()){
        f1.inserir(f2.remover());
      }
    }
 
    public int desempilhar() throws Exception {
      return f1.remover();
    }
 
    public void mostrar(){
      f1.mostrar();
    }
 
    public boolean isVazia(){
      return f1.isVazia();
    }
 
    public static void main(String []args) throws Exception{
      Fila2Pilha p1 = new Fila2Pilha();
 
      p1.empilhar(10);
      p1.empilhar(11);
      p1.empilhar(15);
      p1.empilhar(20);
 
      p1.mostrar();
 
    }
  }
*/