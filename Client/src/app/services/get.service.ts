import {Injectable} from '@angular/core';
import {HttpClient, HttpParams} from '@angular/common/http';
import {ArtistModel} from "../../dto/artist.model";
import {GenreModel} from "../../dto/genre.model";
import {TrackModel} from "../../dto/track.model";


@Injectable({
  providedIn: 'root'
})
export class GetService {
  constructor(private http: HttpClient) {
  }

  getArtists() {
    return this.http.get<ArtistModel[]>('http://localhost:82/artists/');
  }

  getGenres() {
    return this.http.get<GenreModel[]>('http://localhost:82/genres/');
  }

  getTracks() {
    return this.http.get<TrackModel[]>('http://localhost:82/tracks/');
  }

  getArtistByID(id: number) {
    return this.http.get<ArtistModel>('http://localhost:82/artists/' + id);
  }

  getTrackByID(id: number) {
    return this.http.get<TrackModel>('http://localhost:82/tracks/' + id);
  }

  getGenreByID(id: number) {
    return this.http.get<GenreModel>('http://localhost:82/genres/' + id);
  }

}
