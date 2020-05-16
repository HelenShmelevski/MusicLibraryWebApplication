import {Component, OnInit} from '@angular/core';
import {GetService} from "../services/get.service";
import {TrackModel} from "../../dto/track.model";
import {ArtistModel} from "../../dto/artist.model";
import {DeleteService} from "../services/delete.service";


@Component({
  selector: 'app-table-tracks',
  templateUrl: './table-tracks.component.html',
  styleUrls: ['./table-tracks.component.css']
})
export class TableTracksComponent implements OnInit {

  id: number;
  flagDisable: boolean = true;
  tracks: TrackModel[];
  //artists:ArtistModel[] =[];
  constructor(private getService: GetService, private deleteService: DeleteService) {
  }


  ngOnInit(): void {
    this.getTracks();

  }

  getTracks() {
    this.getService.getTracks()
      .subscribe(tracks => {
        console.log(tracks);
       this.tracks = tracks;
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

