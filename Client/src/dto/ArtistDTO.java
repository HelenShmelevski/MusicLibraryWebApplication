
import com.musicLibrary.musicLibraryApplication.Models.Track;

import java.util.List;
import java.util.Set;

public class ArtistDTO {
    private int id;
    private String name;
    private String country;
    private Set<Track> tracks;

    public ArtistDTO(int id, String name, String country, Set<Track> tracks) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.tracks = tracks;
    }

    public ArtistDTO() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry(){
        return country;
    }

    public void setCountry(String country){
        this.country = country;
    }

    public Set<Track> getTracks() {
        return tracks;
    }

    public void setTracks(Set<Track> tracks) {
        this.tracks = tracks;
    }
}
