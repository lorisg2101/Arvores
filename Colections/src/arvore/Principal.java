package arvore;

public class Principal {
	public static void main(String[] args) {
		Arvore ar = new Arvore(37);
		ar.inserir(10, ar.raiz);
		ar.inserir(8, ar.raiz);
		ar.inserir(15, ar.raiz);
		ar.inserir(3, ar.raiz);
		ar.inserir(12, ar.raiz);
		ar.inserir(20, ar.raiz);
		System.out.println("Percurso em Ordem Simétrica");
		ar.emOrdem(ar.raiz);
	}
}