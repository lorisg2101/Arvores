package arvoreavl;

public class AVL {
	No raiz;

	public int getAuxCont(No no) {
		if (no == null)
			return 0;
		return no.auxCont;
	}

	public int getFatorBalanceamento(No No) {
		if (No == null)
			return 0;
		return getAuxCont(No.esq) - getAuxCont(No.dir);
	}

	public void atualizarauxCont(No No) {
		int esqauxCont = getAuxCont(No.esq);
		int dirauxCont = getAuxCont(No.dir);
		No.auxCont = Math.max(esqauxCont, dirauxCont) + 1;
	}

	public No rotacaodir(No No) {
		No raizNova = No.esq;
		No subArvore = raizNova.dir;
		raizNova.dir = No;
		No.esq = subArvore;
		atualizarauxCont(No);
		atualizarauxCont(raizNova);
		return raizNova;
	}

	public No rotacaoesq(No No) {
		No raizNova = No.dir;
		No subArvore = raizNova.esq;
		raizNova.esq = No;
		No.dir = subArvore;
		atualizarauxCont(No);
		atualizarauxCont(raizNova);
		return raizNova;
	}

	public No inserir(No No, int valor) {
		if (No == null)
			return new No(valor);

		if (valor < No.valor)
			No.esq = inserir(No.esq, valor);
		else if (valor > No.valor)
			No.dir = inserir(No.dir, valor);
		else
			return No;
		atualizarauxCont(No);
		int fatorBal = getFatorBalanceamento(No);
		if (fatorBal > 1 && valor < No.esq.valor)
			return rotacaodir(No);
		if (fatorBal < -1 && valor > No.dir.valor)
			return rotacaoesq(No);
		if (fatorBal > 1 && valor > No.esq.valor) {
			No.esq = rotacaoesq(No.esq);
			return rotacaodir(No);
		}
		if (fatorBal < -1 && valor < No.dir.valor) {
			No.dir = rotacaodir(No.dir);
			return rotacaoesq(No);
		}
		return No;
	}

	public void imprime(No No) {
		if (No != null) {
			imprime(No.esq);
			System.out.print(No.valor + " " + No.auxCont);
			System.out.println(" ");
			imprime(No.dir);
		}
	}
}
