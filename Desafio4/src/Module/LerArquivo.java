package Module;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LerArquivo {
	
		 DesenharGrafico des = new DesenharGrafico();
		 String[][] stela=new String[10][2];
		 int angulo;
		 int etapas;
		 int regras;
		 String axioma;
		 
		
		public String Leitura(String saida) {
					
		try 
		{
	    	
	    	 FileReader arq = new FileReader("gramatica.txt");
		     BufferedReader lerArq = new BufferedReader(arq);      
		     String linha = lerArq.readLine();	       
		     int i=0;
		     int j=0;
		     
		     while (linha != null) 
		     {
		    	     		
		    	if(i==0)
		    	{
		    		
		    	}
		    	else if(i==1)
		    	{
		    		etapas=Integer.parseInt(linha.substring(linha.indexOf(':')+1).replace(" ", ""));
		    		System.out.printf(etapas+"\n");
		    	}
		    	else if(i==2)
		    	{
		    		axioma= linha.substring(linha.indexOf(':')+1).replace(" ", "");
		    		System.out.printf(axioma+"\n");
		    	}
		    	else if(i==3)
		    	{
		    		angulo= Integer.parseInt(linha.substring(linha.indexOf(':')+1,linha.length()-2).replace(" ", ""));
		    		System.out.printf(angulo+"\n");
		    	}
		    	else if(i>3)
		    	{
		    		stela[j][0]=linha.substring(linha.indexOf(':')+1,linha.indexOf("→")).replace(" ", "");
		    		stela[j][1]=linha.substring(linha.indexOf("→")+4).replace(" ", "");
		    		System.out.printf(stela[j][0]+"\n");
		    		System.out.printf(stela[j][1]+"\n");
		    		regras=j;
		    		j++;
		    	}
		    	i++;
		    	
			
		    	linha = lerArq.readLine();
	    	 
		     }
		     arq.close();
		     for(int k=0;k<etapas;k++)
				{
					
					Boolean aplicou = true;
					int tam = axioma.length();
					for(int m = 0; m< tam;m++)
					{
						
						for(int l=0;l<regras+1;l++)
						{
							
							if(stela[l][0].equals(String.valueOf(axioma.charAt(m))))
							{		
													
								saida=saida+stela[l][1];
								aplicou=true;
								break;
							}
							else
								aplicou=false;
						}
						if(aplicou==false)
						{
							saida=saida+axioma.charAt(m);
						}
					}
					axioma=saida;
					saida="";
				}

	    } 
		catch (IOException e) 
		{
	        System.err.printf("Erro na abertura do arquivo: %s.\n",
	        e.getMessage());
	    }
		return axioma;
	}
		public int angulo()
		{
			return angulo;
		}
}
