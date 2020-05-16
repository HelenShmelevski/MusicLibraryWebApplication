import {HttpClient, HttpParams, HttpRequest} from '@angular/common/http';
import {Injectable} from "@angular/core";
import {Observable} from "rxjs";
import {ArtistModel} from "../../dto/artist.model";
import {GenreModel} from "../../dto/genre.model";
import {TrackModel} from "../../dto/track.model";

@Injectable()
export class ChangeService {

  constructor(private http: HttpClient) {}

  changeArtist(artist: ArtistModel) {
    console.log(artist);
    const body = {id: artist.id, name: artist.name, country: artist.country, tracks: artist.tracks};
    return this.http.put('http://localhost:82/artists/' + artist.id, body);
  }

  changeTrack(track: TrackModel) {
    console.log(track);
    const body = {id: track.id, title: track.title, artist: track.artist, album: track.album, dateRelease: track.dateRelease};
    return this.http.put('http://localhost:82/tracks/' + track.id, body);
  }

  changeGenre(genre: GenreModel) {
    console.log(genre);
    const body = {id: genre.id, title: genre.title};
    return this.http.put('http://localhost:82/genres/' + genre.id, body);
  }
}
