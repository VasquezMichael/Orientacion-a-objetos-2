package Twitter;

public class TweetOriginal extends Tweet {
	private String texto;

	public TweetOriginal() {
		// TODO Auto-generated constructor stub
	}
	public TweetOriginal(String texto) {
		this.texto = texto;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
}
