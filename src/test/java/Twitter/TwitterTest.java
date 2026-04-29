package Twitter;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class TwitterTest {


	@Test
	public void agregarUsuarioValido() {
		Twitter twitter = new Twitter();
		
		twitter.agregarUsuario("micha");
		
		assertEquals(1, twitter.getUsuarios().size());
		
	}
	
	@Test
	public void agregarUsuarioNoAceptaUsuarioRepetido() {
		Twitter twitter = new Twitter();
		twitter.agregarUsuario("micha");
		assertEquals(1, twitter.getUsuarios().size());
		
		twitter.agregarUsuario("micha");
		assertEquals(1, twitter.getUsuarios().size());
		
	}
	
	
	@Test
	public void eliminarUsuarioExistente() {
		Twitter twitter = new Twitter();
		twitter.agregarUsuario("micha");
		
		twitter.eliminarUsuario("micha");
		
		assertTrue(twitter.getUsuarios().isEmpty());
	}
	
	@Test
	public void eliminarUsuarioInexistente() {
		Twitter twitter = new Twitter();
		twitter.agregarUsuario("micha");
		
		twitter.eliminarUsuario("otro");
		
		assertEquals(1,twitter.getUsuarios().size());
	}
}
