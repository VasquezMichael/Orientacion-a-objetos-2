package Twitter;

public class ReTweet extends Tweet {

	private Tweet origen;
	
	public ReTweet() {
		// TODO Auto-generated constructor stub
	}
	
	public ReTweet(Tweet origen) {
		this.origen = origen;
	}

	public Tweet getOrigen() {
		return this.origen;
	}
}
