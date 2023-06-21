package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		String path = "c:\\temp\\in.txt";
		
		// Abrindo e fechando manualmente os streamers:
		
		//1. Declarar os streamers
		
		FileReader fr = null;
		BufferedReader br = null;
		
		//2. Instanciar os streamers
	try {
		fr = new FileReader(path);
		br = new BufferedReader(fr);
		
		//3. Utilizar os streamers
		String line = br.readLine();
		
		while (line != null) {
			System.out.println(line);
			line = br.readLine();
		}
	}
		//3. Capturar excessoes
	
	catch (IOException e) {
		System.out.println("Error: " + e.getMessage());
	}
		//4. Finally para fechar os streamers
	
		finally {
			try {
				if (br != null) {
					br.close();
				}
				if (fr != null) {
					fr.close();
				}
			}
		//5. Capturar excessões do fechamento dos streamers
			
			catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}