package Module;

import java.io.IOException;

public class Principal {
	public static void main(String[] args) throws IOException {
		
		LerArquivo ler = new LerArquivo();	
		DesenharGrafico desenho = new DesenharGrafico();
		String saida="";
		int angulo=0;
		saida = ler.Leitura(saida);
		angulo=ler.angulo();
		desenho.Desenho(saida,angulo);
		System.out.print(saida+"\n");
		System.out.print(angulo+"\n");
		
		
		
	}
	
}
