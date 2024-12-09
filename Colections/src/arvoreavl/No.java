package arvoreavl;

public class No {
	int valor;
	int auxCont;
	No esq;
	No dir;
	
	No(int valor) {
		this.valor = valor;
		this.auxCont = 1;
		this.esq = null;
		this.dir = null;
	}

}
