import { Injectable } from '@angular/core';
import {HttpClient, HttpResponse} from '@angular/common/http';
import {ArtistsModel} from "./artists.model";
import {Observable} from "rxjs";
@Injectable({
  providedIn: 'root'
})
export class GetService {
url1 = 'http://localhost:82/artists';
  constructor(private http: HttpClient) { }

  url = '/artists';
  // getArtists() {
  //   return this.http.get<ArtistsModel[]>("https://artists")
  //   // return this.http.get<ArtistsModel[]>('assets/artists.json')
  // }

  getArtists() {
    return this.http.get<ArtistsModel[]>(this.url1);
  }
}
