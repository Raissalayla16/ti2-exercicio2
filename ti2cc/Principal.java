package com.ti2cc;

import java.util.*;

public class Principal{
	
	public static void main(String[] args) {
		
		DAO dao = new DAO();
		
		dao.conectar();

		
		//definir dados
		Scanner a = new Scanner(System.in);
		Scanner usuario = null;
		int x;
		String nome;

		do
		{
			
			//mostra opÃ§Ãµes na tela
			System.out.println("Faca sua escolha: ");

			//System.out.println("");
			
			//Listar
			System.out.println("0 - Parar programa");
			System.out.println("1 - Inserir um elemento na tabela");
			System.out.println("2 - Excluir usuario");
			System.out.println("3 - Atualizar usuario");
			x = a.nextInt();

			switch (x) {
			//Sair
				case 0:
				
				break;
	
				case 1:
					//Inserir 
					Usuario usuario = new Usuario(13, nome, nome,'M');
					if(dao.inserirUsuario(usuario) == true) {
						System.out.println("Inserção com sucesso -> " + usuario.toString());
					}
				break;
				
				case 2:
					//Excluir 
					dao.excluirUsuario(usuario.getCodigo());
				break;
				
				case 3:
				//Atualizar
					usuario.setSenha("nova senha");
					dao.atualizarUsuario(usuario);
				break;
           
				default:
			}
			
		}while(x != 0);
		        dao.close();
	}
}