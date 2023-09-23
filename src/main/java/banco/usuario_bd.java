package banco;

import java.util.ArrayList;
import java.util.List;

import entities.Usuario;

public class usuario_bd {
	private static List<Usuario> user_bd = new ArrayList<Usuario>();
	
	public static void salvar (Usuario user) {
		user_bd.add(user);
	}
	
	public static String select() {
		String retorno = "";
 		for(int i = 0; i < user_bd.size(); i++) {
 			retorno += "<tr><td>" + user_bd.get(i).getLogin() + "</td>"
 					+ "<td>" + user_bd.get(i).getNome() + "</td>"
 					+ "<td>" + user_bd.get(i).getSenha() + "</td></tr>";
 		}
 		return retorno;
 	}
}

