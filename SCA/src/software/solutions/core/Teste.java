package software.solutions.core;

import java.util.Calendar;
import java.util.List;

import software.solutions.persistence.Contato;

public class Teste {
	public static void main(String[] args){
		Contato contato = new Contato();
		contato.setNome("wanderson almeida ferreira");
		contato.setDataNascimento(Calendar.getInstance());
		contato.setEmail("yasmim.psj@hotmail.com");
		
		ContatoDAO dao = new ContatoDAO();
		dao.adiciona(contato);
		
		System.out.print("Gravado");
		
		List<Contato> contatos = dao.getLista();
		for (Contato tt : contatos) {
			  System.out.println("Nome: " + tt.getNome());
			  System.out.println("Email: " + tt.getEmail());	
			  System.out.println("Endereço: " + tt.getEndereco());
			  System.out.println("Data de Nascimento: " + 
					  tt.getDataNascimento().getTime() + "\n");
			}
		
		Contato teste = new Contato();
		teste.setId((long) 1);
		
		ContatoDAO remove = new ContatoDAO();
		remove.remove(teste);
		
		Contato inf = new Contato();
		inf.setDataNascimento(Calendar.getInstance());
		inf.setEmail("Paloma.dsds@dssds.com");
		inf.setId(11);
		
		ContatoDAO alter = new ContatoDAO();
		alter.altera(inf);
	}

}
