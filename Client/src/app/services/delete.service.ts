import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {ArtistModel} from "../../dto/artist.model";
import {GenreModel} from "../../dto/genre.model";
import {TrackModel} from "../../dto/track.model";

@Injectable({
  providedIn: 'root'
})
export class DeleteService {
  constructor(private http: HttpClient) {
  }

  deleteArtist(id: number) {
    return this.http.delete(`http://localhost:84/artists/${id}`);
  }

  deleteGenre(id: number) {
    return this.http.delete(`http://localhost:84/genres/${id}`);
  }

  deleteTrack(id: number) {
    return this.http.delete(`http://localhost:84/tracks/${id}`);
  }
}
