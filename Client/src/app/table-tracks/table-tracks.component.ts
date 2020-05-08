import {Component, OnInit} from '@angular/core';
import {GetService} from "../services/get.service";
import {TrackModel} from "../../dto/track.model";


@Component({
  selector: 'app-table-tracks',
  templateUrl: './table-tracks.component.html',
  styleUrls: ['./table-tracks.component.css']
})
export class TableTracksComponent implements OnInit {
  tracks: TrackModel[] = [];

  constructor(private getService: GetService) {
  }


  ngOnInit(): void {
    this.getTracks();

  }

  getTracks() {
    this.getService.getTracks()
      .subscribe(data => {
        console.log(data);
        this.tracks = data;
      });
  }

}

