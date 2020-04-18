import { Component, OnInit } from '@angular/core';
import {CreateService} from "../services/create.service";

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
  trackDuration = 0;

  constructor(private createService : CreateService) { }

  addTrack() {
    this.createService.addTrack(this.trackId, this.trackName, this.trackTitle, this.trackGenre, this.trackDuration);
    this.trackId ;
    this.trackName = '';
    this.trackTitle = '';
    this.trackGenre ='';
    this.trackDuration = 0;
  }
  ngOnInit(): void {

  }

}
