package arvore;

public class Arvore {
	No raiz;

	public Arvore(int valor) {
		raiz = new No(valor);
	}
	public No impRaiz() {
		return raiz;
	}
	public void inserir(int valor, No r) {
		if (r.valor > valor) {
			if (r.esq != null) {
				inserir(valor, r.esq);
			} else {
				No novo = new No(valor);
				r.esq = novo;
			}
		} else {
			if (r.dir != null) {
				inserir(valor, r.dir);
			} else {
				No novo = new No(valor);
				r.dir = novo;
			}
		}
	}
	public void emOrdem(No r) {
		if (r != null) {
			emOrdem(r.esq);
			System.out.println(r.valor);
			emOrdem(r.dir);
		}
	}
}
