import {HttpClient, HttpRequest} from '@angular/common/http';
import {Injectable} from "@angular/core";
import {Observable} from "rxjs";
import {ArtistModel} from "../../dto/artist.model";
import {GenreModel} from "../../dto/genre.model";
import {TrackModel} from "../../dto/track.model";

@Injectable()
export class CreateService {

  constructor(private http: HttpClient) {}
  //
  // artists = [];
  // genres = [];
  // tracks = [];

  addTrack(track: TrackModel){
    const body = {name: track.name, trackName: track.title};
      //alb: track.album, id: track.trackId, date: track.dateRelease };
    return this.http.post('http://localhost:84/tracks/', body);
  }

  ////////////////////////
  // addTrack(trackName: string) {
  //   const data ={
  //     title: trackName
  //
  //   };
  //   return this.http.post<TrackModel[]>('http://localhost:82/tracks/', {data});
  // }



  // track: TrackModel=new TrackModel(); // данные вводимого пользователя
  //
  // receivedTrack: TrackModel; // полученный пользователь
  // done: boolean = false;
  // private httpService: any;
  // submit(track: TrackModel){
  //   this.httpService.postData(track)
  //     .subscribe(
  //       (data: TrackModel) => {this.receivedTrack=data; this.done=true;},
  //       error => console.log(error)
  //     );
  // }

  // addGenre(id: number, title: string, name: string) {
  //   this.genres.push({id, title, name});
  // }
  //
  // addTrack(id: number, name: string, title: string, genre: string, duration: number) {
  //   this.tracks.push({id, name, title, genre, duration});
  // }
}
