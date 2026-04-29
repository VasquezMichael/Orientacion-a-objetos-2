package Twitter;

import java.util.ArrayList;
import java.util.List;

public class Twitter {
	private List<Usuario> usuarios;
	
	public Twitter() {
		this.usuarios = new ArrayList<>();
	}

	public List<Usuario> getUsuarios(){
		return this.usuarios;
	}
	
	public void agregarUsuario(String screenName) {
		if(!this.existeUsuario(screenName)) {
			this.usuarios.add(new Usuario(screenName));
		}
	}
	
	private boolean existeUsuario(String screenName) {
		return this.usuarios.stream().anyMatch(u -> u.getScreenName().equals(screenName));
	}
	
	private Usuario buscarUsuario(String screenName) {
		return this.usuarios.stream().filter(u -> u.getScreenName().equals(screenName)).findFirst().orElse(null);
	}
	
	public void eliminarUsuario(String screenName) {
		Usuario user = this.buscarUsuario(screenName);
		if (user != null) {
			user.eliminarTweets();
			this.usuarios.remove(user);
		}
	}
}
