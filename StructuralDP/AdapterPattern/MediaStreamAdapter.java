
public class MediaStreamAdapter {

    public static MediaData burn(VideoEncodedStream.VideoData video, AudioEncodedStream.AudioData audio) {

        // do something that can burn these data together into MediaData
        System.out.println("Burinning " + video + " and " + audio + " together...in to media data.....");

        return new MediaData();
    }

}
