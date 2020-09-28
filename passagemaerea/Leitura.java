package passagemaerea;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public final class Leitura{

	public String inDados(String rotulo){

		InputStreamReader teclado = new  InputStreamReader(System.in);
		BufferedReader mem =  new BufferedReader(teclado);
		String entrada = "";

			System.out.println(rotulo);

		try{
			entrada = mem.readLine();
			}

		catch(IOException ioe){

			System.out.println("\n Erro no Sistema!");
		}
		return entrada;
		}
}