import {Component, Input, OnInit} from '@angular/core';
import {CreateService} from "../services/create.service";
import {TrackModel} from "../../dto/track.model";
import {ArtistModel} from "../../dto/artist.model";
import {ChangeService} from "../services/change.service";
import {GetService} from "../services/get.service";
import {GenreModel} from "../../dto/genre.model";
import {ActivatedRoute} from "@angular/router";

@Component({
  selector: 'app-add-artist',
  templateUrl: './add-artist.component.html',
  styleUrls: ['./add-artist.component.css']

})
export class AddArtistComponent implements OnInit {

  @Input() genres: GenreModel[];
  artist: ArtistModel = new ArtistModel();
  flagDisable: boolean = true;
  id: number;

  constructor(private createService: CreateService, private changeService: ChangeService,
              private getService: GetService, private activateRoute: ActivatedRoute) {
    this.id = activateRoute.snapshot.params['id'];
  }

  addArtist(artist: ArtistModel) {
    this.createService.addArtist(artist)
      .subscribe(
        (data: ArtistModel) => {
          console.log(data);
        },
        error => console.log(error)
      );
  }

  changeArtist(artist) {
    this.changeService.changeArtist(artist).subscribe(
      (data) => {
        console.log(data);
      });
  }

  ngOnInit(): void {
    this.getGenres();
    if (this.id) {
      this.flagDisable = false;
      this.getService.getArtistByID(this.id)
        .subscribe(data => {
          this.artist = data;
        });
    }
  }

  getGenres() {
    this.getService.getGenres()
      .subscribe(data => {
        this.genres = data;
      });
  }

}
