import { Component, OnInit } from '@angular/core';
import {AddTrackService} from "../addTrack.service";

@Component({
  selector: 'app-add-track',
  templateUrl: './add-track.component.html',
  styleUrls: ['./add-track.component.css']
})
export class AddTrackComponent implements OnInit {
  trackId ;
  trackName = '';
  trackTitle = '';
  trackGenre = '';
  trackDuration ;

  constructor(private addtrack : AddTrackService) { }

  addTrack() {
    this.addtrack.addTrack(this.trackId, this.trackName, this.trackTitle, this.trackGenre, this.trackDuration);
    this.trackId ;
    this.trackName = '';
    this.trackTitle = '';
    this.trackGenre ='';
    this.trackDuration;
  }
  ngOnInit(): void {

  }

}
