package Twitter;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

	private String screenName;
	private List<Tweet> tweets;
	
	public Usuario() {
		// TODO Auto-generated constructor stub
	}
	public Usuario(String screenName) {
		this.screenName = screenName;
		this.tweets = new ArrayList<>();
	}
	
	public String getScreenName() {
		return screenName;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}

	public void publicarTweet(String texto) {
		if(texto == null || texto.length() < 1 || texto.length() > 280) {
			throw new IllegalArgumentException("El texto no es valido");
		}
		Tweet tw = new TweetOriginal(texto);
		this.tweets.add(tw);
	}
	
	public void reTweetear(Tweet tw) {
		Tweet reTw = new ReTweet(tw);
		this.tweets.add(reTw);
	}
	
	public void eliminarTweets() {
		this.tweets.clear();
	}
	
	public List<Tweet> getTweets(){
		return this.tweets;
	}
}
