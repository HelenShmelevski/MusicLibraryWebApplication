import {HttpClient, HttpRequest} from '@angular/common/http';
import {Injectable} from "@angular/core";
import {Observable} from "rxjs";
import {ArtistModel} from "../../dto/artist.model";
import {GenreModel} from "../../dto/genre.model";
import {TrackModel} from "../../dto/track.model";

@Injectable()
export class CreateService {

  constructor(private http: HttpClient) {
  }

  addTrack(track: TrackModel) {
    const body = {trackName: track.title};
    //alb: track.album, id: track.trackId, date: track.dateRelease };
    return this.http.post('http://localhost:84/tracks/', body);
  }

   addArtist(artist: ArtistModel){
     const body = {artistName: artist.name, artistId:artist.id};
    return this.http.post('http://localhost:82/artists/', body);
  }

}
