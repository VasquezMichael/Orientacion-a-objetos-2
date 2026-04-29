package Twitter;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class UsuarioTest {

	@Test
	public void publicarTweetValidoGuardaElTextoCorrecto() {
		Usuario user = new Usuario("micha");
		user.publicarTweet("hola");
		
		assertEquals(1,user.getTweets().size());
		TweetOriginal tweet = (TweetOriginal) user.getTweets().get(0);
		assertEquals("hola",tweet.getTexto());
	}
	
	@Test
	public void publicTweetNoAceptaTextoVacioLanzaError() {
		Usuario user = new Usuario("micha");
		
		assertThrows(IllegalArgumentException.class, () -> {user.publicarTweet("");});
		
	}
	
	@Test
	public void publicarTweetNoAceptaTextoNullLanzaError() {
		Usuario user = new Usuario("micha");
		
		assertThrows(IllegalArgumentException.class,() -> {user.publicarTweet(null);});
	}
	
	
	@Test
	public void publicarTweetNoAceptaTextoMayorA280CaracteresLanzaError() {
		Usuario user = new Usuario("micha");
		String textoLargo = "a".repeat(281);
		
		assertThrows(IllegalArgumentException.class, () -> {user.publicarTweet(textoLargo);});
	}
	
	@Test
	public void publicarTweetValidoAceptaTexto1Caracter() {
		Usuario user = new Usuario("micha");
		user.publicarTweet("a");
		assertEquals(1, user.getTweets().size());
		TweetOriginal tw = (TweetOriginal) user.getTweets().get(0);
		assertEquals("a",tw.getTexto());
	}
	@Test
	public void publicarTweetValidoAceptaTexto280Caracter() {
		Usuario user = new Usuario("micha");
		String textoLargo = "a".repeat(280);
		user.publicarTweet(textoLargo);
		assertEquals(1, user.getTweets().size());
		TweetOriginal tw = (TweetOriginal) user.getTweets().get(0);
		assertEquals(textoLargo,tw.getTexto());
	}
	
	@Test
	public void retweetAgregaUnRetweetATweetsYConoceSuOrigen() {
		Usuario user = new Usuario("micha");
		Tweet twOriginal = new TweetOriginal("nuevo");
		user.reTweetear(twOriginal);
		assertEquals(1,user.getTweets().size());
		assertTrue(user.getTweets().get(0) instanceof ReTweet);
		
		ReTweet reTweet = (ReTweet) user.getTweets().get(0);
		assertSame(twOriginal, reTweet.getOrigen());
	}
	
	@Test
	public void eliminarTweetsVaciaLaListaDeTweets() {
		Usuario user = new Usuario("micha");
		user.publicarTweet("hola");
		user.publicarTweet("jojo");
		
		user.eliminarTweets();
		
		assertTrue(user.getTweets().isEmpty());
		
	}
	
}
