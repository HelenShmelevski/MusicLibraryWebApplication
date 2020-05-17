import {Component, OnInit} from '@angular/core';
import {CreateService} from "../services/create.service";
import {ArtistModel} from "../../dto/artist.model";
import {TrackModel} from "../../dto/track.model";
import {HttpClient, HttpClientModule} from "@angular/common/http";
import {GetService} from "../services/get.service";
import {ActivatedRoute} from "@angular/router";
import {ChangeService} from "../services/change.service";


@Component({
  selector: 'app-add-track',
  templateUrl: './add-track.component.html',
  styleUrls: ['./add-track.component.css']
})

export class AddTrackComponent implements OnInit {

  track: TrackModel = new TrackModel();
  flagDisable: boolean = true;
  id: number;
  artists: ArtistModel[];
  condition: boolean = true;

  constructor(private createService: CreateService, private getService: GetService,
              private changeService: ChangeService,
              private activateRoute: ActivatedRoute) {
    this.id = activateRoute.snapshot.params['id'];
  }

  addTrack(track: TrackModel) {
    console.log(track);
    this.createService.addTrack(this.track)
      .subscribe(
        (track: TrackModel) => {
          console.log(track);
        },
        error => console.log(error)
      );
  }

  changeTrack(track) {
    this.changeService.changeTrack(track).subscribe(
      (data) => {
        console.log(data);
      });
  }

  ngOnInit(): void {
    this.getService.getArtists()
      .subscribe(data => {
        console.log(data);
        this.artists = data;
      });
    if (this.id) {
      this.condition = false;
    }
    if (this.id) {
      this.flagDisable = false;
      this.getService.getTrackByID(this.id)
        .subscribe(data => {
          this.track = data;
        });
    }
  }

}
