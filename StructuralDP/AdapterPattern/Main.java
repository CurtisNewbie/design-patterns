
public class Main {

    public static void main(String[] args) {
        AudioEncodedStream audioEncodedStream = new AudioEncodedStream();
        VideoEncodedStream videoEncodedStream = new VideoEncodedStream();
        MediaData mediaData = MediaStreamAdapter.burn(videoEncodedStream.getData(), audioEncodedStream.getData());
    }

}