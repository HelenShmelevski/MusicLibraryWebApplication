import {Component, OnInit} from '@angular/core';
import {GetService} from "../services/get.service";
import {TrackModel} from "../../dto/track.model";
import {DeleteService} from "../services/delete.service";


@Component({
  selector: 'app-table-tracks',
  templateUrl: './table-tracks.component.html',
  styleUrls: ['./table-tracks.component.css']
})
export class TableTracksComponent implements OnInit {
  tracks: TrackModel[] = [];
  id: number ;

  constructor(private getService: GetService, private deleteService: DeleteService) {
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

  deleteTrack() {
    this.deleteService.deleteTrack(this.id)
      .subscribe(data => {
        // const data = response.json();
        console.log(data);
        this.getTracks();
        this.id = null;
        // this.artists = data;
      });

  }


  getId (id: number){
    this.id = id;
  }

}

