import java.io.File;
import java.nio.file.spi.FileTypeDetector;
import java.time.Duration;
import java.time.Instant;
import java.util.Date;

public class Media {
    private int assetId;//This crates a integer with the name assetId that can only be used in this class.
    private String name;//This crates a string with the name name that can only be used in this class.
    private Date created = new Date();//This crates a Date with the name created that can only be used in this class.
    private String fileName;//This crates a string with the name fileName that can only be used in this class.
    private String filType;
    private int durationMinutes;
    private int durationSeconds;
    private String resolution;
    private String photographer;
    private int widthInPixels;
    private int heightInPixels;
    private String author;
    private String articleText;
    private String relatedImage;

    public Media() {
        //This Media method crates a ID from the MediaID class for the assetId and takes the date off today for the created.
        assetId = MediaID.generate();
        created = Date.from(Instant.now());
    }

    //Here has there been create getters and setters for the integer, date and strings.
    public int getAssetId() {
        return assetId;
    }

    public void setAssetId(int assetId) {
        this.assetId = assetId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getfilType() {
        return filType;
    }

    public void setFilType(String filType) {
        this.filType = filType;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    public void setDurationMinutes(int durationMinutes) {
        this.durationMinutes = durationMinutes;
    }

    public int getDurationSeconds() {
        return durationSeconds;
    }

    public void setDurationSeconds(int durationSeconds) {
        this.durationSeconds = durationSeconds;
    }
    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public String getPhotographer() {
        return photographer;
    }

    public void setPhotographer(String photographer) {
        this.photographer = photographer;
    }

    public int getWidthInPixels() {
        return widthInPixels;
    }

    public void setWidthInPixels(int widthInPixels) {
        this.widthInPixels = widthInPixels;
    }

    public int getHeightInPixels() {
        return heightInPixels;
    }

    public void setHeightInPixels(int heightInPixels) {
        this.heightInPixels = heightInPixels;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getArticleText() {
        return articleText;
    }

    public void setArticleText(String articleText) {
        this.articleText = articleText;
    }

    public String getRelatedImage() {
        return relatedImage;
    }

    public void setRelatedImage(String relatedImage) {
        this.relatedImage = relatedImage;
    }

    @Override
    public String toString() {
        //This method overrides the superclass whise is the main class and prints out the the id, name, date and fileName.
        return "Media{" +
                "assetId=" + assetId +
                ", name='" + name + '\'' +
                ", created=" + created +
                ", fileName='" + fileName + '\'' +
                '}';
    }
}
