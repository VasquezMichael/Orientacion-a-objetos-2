package Patrones_de_diseño.media_player;

public class MediaPlayer {
	
	public MediaPlayer() {
		// TODO Auto-generated constructor stub
	}
	
	public void play(Media archivo) {
		archivo.play();
	}

	
	public static void main(String[] args) {
		MediaPlayer player = new MediaPlayer();

		Media audio = new Audio();
		Media video = new VideoFile();

		VideoStream stream = new VideoStream();
		Media streamAdaptado = new VideoStreamAdapter(stream);

		player.play(audio);
		player.play(video);
		player.play(streamAdaptado);
		
	}
}

