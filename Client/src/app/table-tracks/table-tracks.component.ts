import { Component} from '@angular/core';
import {AddTrackService} from "../addTrack.service";


@Component({
  selector: 'app-table-tracks',
  templateUrl: './table-tracks.component.html',
  styleUrls: ['./table-tracks.component.css']
})
export class TableTracksComponent  {

  tracks = [];
  constructor(private addTrack: AddTrackService ) {
  }


  ngOnInit(): void {
    this.tracks = this.addTrack.tracks;
  }



}

