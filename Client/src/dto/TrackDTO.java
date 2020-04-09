
import java.util.Date;

public class TrackDTO {

    private int id;
    private String title;
    private String album;
    private int artistId;
    private Date dateRelease;

    public TrackDTO(int id, String title, String album, Date dateRelease, int artistId) {
        this.id = id;
        this.title = title;
        this.album = album;
        this.dateRelease = dateRelease;
        this.artistId = artistId;
    }

    public TrackDTO() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAlbum(){
        return album;
    }

    public void setAlbum(String album){
        this.album = album;
    }

    public Date getDateRelease() {
        return dateRelease;
    }

    public void setDateRelease(Date dateRelease) {
        this.dateRelease = dateRelease;
    }

    public int getArtistId() {
        return artistId;
    }

    public void setArtistId(int artistId) {
        this.artistId = artistId;
    }
}
