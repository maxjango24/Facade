public class VideoFile {
    private String name;
    private String codec;

    public VideoFile (String name){
        this.name = name;
        this.codec = name.substring(name.indexOf(".") + 1);
    }

    public String getName() {
        return name;
    }

    public String getCodec() {
        return codec;
    }
}
