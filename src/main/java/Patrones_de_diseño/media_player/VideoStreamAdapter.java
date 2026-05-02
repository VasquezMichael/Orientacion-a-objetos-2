package Patrones_de_diseño.media_player;

public class VideoStreamAdapter implements Media{
	
	private VideoStream videoStream;
	
	public VideoStreamAdapter(VideoStream stream) {
		this.videoStream = stream;
	}

	@Override
	public void play() {
		this.videoStream.reproduce();
		
	}
	

}
