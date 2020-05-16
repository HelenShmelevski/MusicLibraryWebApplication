import {HttpClient, HttpRequest} from '@angular/common/http';
import {Injectable} from "@angular/core";
import {Observable} from "rxjs";
import {ArtistModel} from "../../dto/artist.model";
import {GenreModel} from "../../dto/genre.model";
import {TrackModel} from "../../dto/track.model";

@Injectable()
export class CreateService {
  // tracks : TrackModel[] = [];
  constructor(private http: HttpClient) {
  }

  addTrack(track: TrackModel) {
    console.log(track);
    const body = {title: track.title, album: track.album, dateRelease: track.dateRelease, artist: track.artist};
    console.log(body);
    return this.http.post('http://localhost:82/tracks/', body);
  }

  addArtist(artist: ArtistModel) {
    const body = {name: artist.name, country: artist.country};
    console.log(body);
    return this.http.post('http://localhost:82/artists/', body);
  }

  addGenre(genre: GenreModel) {
    const body = {title: genre.title};
    console.log(body);
    return this.http.post('http://localhost:82/genres/', body);
  }
}
