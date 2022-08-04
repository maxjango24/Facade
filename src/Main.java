import java.io.File;

public class Main {
    public static void main(String[] args) {
        File video = VideoConversionFacade.getInstance().convertVideo("youtubevideo.ogg", "mp4");

    }

}
