import {Component, OnInit} from '@angular/core';
import {CreateService} from "../services/create.service";
import {ArtistModel} from "../../dto/artist.model";
import {TrackModel} from "../../dto/track.model";
import {HttpClient, HttpClientModule} from "@angular/common/http";
import {GetService} from "../services/get.service";


@Component({
  selector: 'app-add-track',
  templateUrl: './add-track.component.html',
  styleUrls: ['./add-track.component.css']
})

export class AddTrackComponent {
  //tracks: TrackModel[] = [];
  // trackId;
  // trackName: string = '';
  // trackTitle: string = '';
  // trackGenre: string = '';
  //trackDuration = 0;

  track: TrackModel = new TrackModel();
  receivedTrack: TrackModel;
  done: boolean = false;

  constructor(private createService: CreateService) {
  }

  addTrack() {
    this.createService.addTrack(this.track)
      .subscribe(
        (track: TrackModel) => {
          this.receivedTrack = track;
          console.log(track);
          this.done = true;
        },
        error => console.log(error)
      );
  }
}


  //////////////
  // addTrack() {
  //   this.createService
  //     .addTrack( )
  //     .subscribe((data)=> {
  //     console.log(data);
  //     })}
  /////////////////
//
// track: TrackModel=new TrackModel(); // данные вводимого пользователя
//
//   receivedTrack: TrackModel; // полученный пользователь
//   done: boolean = false;
//   private httpService: any;
//   submit(track: TrackModel){
//     this.httpService.postData(track)
//       .subscribe(
//         (data: TrackModel) => {this.receivedTrack=data; this.done=true;},
//         error => console.log(error)
//       );
//   }

  // ngOnInit(): void {
  //
  // }


