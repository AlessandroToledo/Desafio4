package Module;

public class Pilha {

    public String[] pilha;
    public int posicaoPilha;

    public Pilha() {
        this.posicaoPilha = -1;
        this.pilha = new String[10000];
    }

    public boolean pilhaVazia() {
        if (this.posicaoPilha == -1) {
            return true;
        }
        return false;
    }

    public int tamanho() {
        if (this.pilhaVazia()) {
            return 0;
        }
        return this.posicaoPilha + 1;
    }

    public String exibeUltimoValor() {
        if (this.pilhaVazia()) {
            return null;
        }
        return this.pilha[this.posicaoPilha];
    }

    public Object desempilhar() {
        if (pilhaVazia()) {
            return null;
        }
        return this.pilha[this.posicaoPilha--];
    }

    public void empilhar(String valor) {
        if (this.posicaoPilha < this.pilha.length - 1) {
            this.pilha[++posicaoPilha] = valor;
        }
    }
    
    public void limparPilha() {  
		for(int i = 0; i < tamanho(); i++)  
			desempilhar(); 
	}  

    public static void main(String args[]) {
        Pilha p = new Pilha();
        p.empilhar("i");

                while (p.pilhaVazia() == false) {
            System.out.println(p.desempilhar());
        }
    }
}