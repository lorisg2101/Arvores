package arvoreavl;

public class Principal {
	public static void main(String[] args) {
        AVL AVL = new AVL();
        
        AVL.raiz = AVL.inserir(AVL.raiz, 10);
        AVL.raiz = AVL.inserir(AVL.raiz, 8);
        AVL.raiz = AVL.inserir(AVL.raiz, 7);
        AVL.raiz = AVL.inserir(AVL.raiz, 13);
        AVL.raiz = AVL.inserir(AVL.raiz, 11);
        AVL.raiz = AVL.inserir(AVL.raiz, 12);
        AVL.raiz = AVL.inserir(AVL.raiz, 20);
        AVL.raiz = AVL.inserir(AVL.raiz, 22);
        AVL.raiz = AVL.inserir(AVL.raiz, 21);
        AVL.raiz = AVL.inserir(AVL.raiz, 100);
        System.out.println("Árvore AVL valor - contador");
        AVL.imprime(AVL.raiz);
    }
}
