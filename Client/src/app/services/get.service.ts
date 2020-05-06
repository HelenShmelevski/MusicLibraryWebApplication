import {Injectable} from '@angular/core';
import {HttpClient, HttpResponse, HttpHeaders} from '@angular/common/http';
import {ArtistModel} from "../../dto/artist.model";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class GetService {
  // url1 = 'http://localhost:82/artists';
  constructor(private http: HttpClient) {
  }

//  url = '/artists';
  // getArtists() {
  //   return this.http.get<ArtistsModel[]>("https://artists")
  //   // return this.http.get<ArtistsModel[]>('assets/artists.json')
  // }

  getArtists() {
    // return this.http.get<ArtistModel[]>(this.url1);

    return this.http.get<ArtistModel[]>('http://localhost:82/artists/');
  }

}
