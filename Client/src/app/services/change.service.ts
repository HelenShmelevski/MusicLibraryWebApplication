import {HttpClient, HttpRequest} from '@angular/common/http';
import {Injectable} from "@angular/core";
import {Observable} from "rxjs";
import {ArtistModel} from "../../dto/artist.model";
import {GenreModel} from "../../dto/genre.model";
import {TrackModel} from "../../dto/track.model";

@Injectable()
export class ChangeService {

  constructor(private http: HttpClient) {
  }


  changeArtist(id: number, name: string) {
    return this.http.put('http://localhost:82/artists/${id}', {name});
  }

}
