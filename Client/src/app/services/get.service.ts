import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {ArtistModel} from "../../dto/artist.model";
import {GenreModel} from "../../dto/genre.model";
import {TrackModel} from "../../dto/track.model";

@Injectable({
  providedIn: 'root'
})
export class GetService {
  constructor(private http: HttpClient) {}

  getArtists() {
    return this.http.get<ArtistModel[]>('http://localhost:82/artists/');
  }

  getGenres() {
    return this.http.get<GenreModel[]>('http://localhost:82/genres/');
  }

  getTracks() {
    return this.http.get<TrackModel[]>('http://localhost:82/tracks/');
  }

}
