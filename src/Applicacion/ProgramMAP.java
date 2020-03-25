package Applicacion;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import Entities.Product;

public class ProgramMAP {

	public static void main(String[] args) {

		Map<String, String> cookies = new TreeMap<>(); 
		
		System.out.println();
		System.out.println("===========MAP- É uma coleção de pares KEY / VALUE=============================");
		System.out.println();
		
		cookies.put("username", "maria");
		cookies.put("email", "maria@gmail.com");
		cookies.put("phone", "99771122");
		
		// Remove d cookies o cara com chave email
		cookies.remove("email"); 
		
		//Vai sobrescrever fone pois MAP não aceita Key duplicada
		cookies.put("phone", "99771133"); 
		
		//Verifica se existe a Key phone 
		System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
		
		//Traz o valor pela Key phone 
		System.out.println("Phone number: " + cookies.get("phone"));
		
		//Retorna nulo, pois a Key email nao existe. Foi deletada antes
		System.out.println("Email: " + cookies.get("email"));
		
		//Traz o tamanho do MAP
		System.out.println("Size: " + cookies.size());
		
		//Mostra todos os COOKIES
		System.out.println("ALL COOKIES:");		
		
		for (String key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		} 
		
		System.out.println();
		System.out.println("===========MAP- Map<Product, Double> stock=============================");
		System.out.println();
		
		Map<Product, Double> stock = new HashMap<>();
		
		Product p1 = new Product("Tv", 900.0);
		Product p2 = new Product("Notebook", 1200.0);
		Product p3 = new Product("Tablet", 400.0);
		
		stock.put(p1, 10000.0);
		stock.put(p2, 20000.0);
		stock.put(p3, 15000.0);
		
		Product ps = new Product("Tv", 900.0);
		
		//Foi implementado equals e hashCode, do contrario a procura ocorre por endereço de memória
		//e retorna sempre FALSE
		System.out.println("Contains 'ps' key: " + stock.containsKey(ps));
		
		
		
	}

}
