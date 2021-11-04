package calculadora.rpn;

import java.io.*;
import java.util.*;

public class RPN_Calculadora {
	public static void main (String args[]) throws Exception {
		
		//File f = new File("\\Calc1.txt"); Modificar o caminho do arquivo exemplo para testar o arquivo.
		
		BufferedReader br = new BufferedReader(new FileReader(f));
		Stack<Double> st = new Stack<Double>();
		String linha = "";
		double resultado_final = 0.0, resultado = 0.0;
		double numero = 0.0, numero_1 = 0.0, numero_2 = 0.0;
		while((linha = br.readLine()) != null) {
			System.out.println(linha);
			if(linha.equals("+")) {
				numero_1 = st.pop();
				numero_2 = st.pop();
				resultado = numero_1 + numero_2;
				st.push(resultado);
			}
			else if(linha.equals("-")) {
				numero_1 = st.pop();
				numero_2 = st.pop();
				resultado = numero_1 - numero_2;
				st.push(resultado);
			}
			else if(linha.equals("*")) {
				numero_1 = st.pop();
				numero_2 = st.pop();
				resultado = numero_1 * numero_2;
				st.push(resultado);
			}
			else if(linha.equals("/")) {
				numero_1 = st.pop();
				numero_2 = st.pop();
				resultado = numero_1 / numero_2;
				st.push(resultado);
			}
			else {
				numero = Double.parseDouble(linha);
				st.push(numero);				
			}
		}
		resultado_final = st.pop();
		if(st.size() > 1) {
			System.out.println("Algum erro aconteceu.");
		}
		else {
			System.out.println("Resultado: " + resultado_final + ".");
		}
		br.close();
	}
}
