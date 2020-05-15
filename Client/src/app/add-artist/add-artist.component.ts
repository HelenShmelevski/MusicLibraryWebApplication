import {Component, OnInit} from '@angular/core';
import {CreateService} from "../services/create.service";
import {TrackModel} from "../../dto/track.model";
import {ArtistModel} from "../../dto/artist.model";
import {ChangeService} from "../services/change.service";

@Component({
  selector: 'app-add-artist',
  templateUrl: './add-artist.component.html',
  styleUrls: ['./add-artist.component.css']
  // providers: [AddArtistServise]
})
export class AddArtistComponent implements OnInit {


  artist: ArtistModel = new ArtistModel();
  receivedArtist: ArtistModel;
  done: boolean = false;

  constructor(private createService: CreateService, private changeService: ChangeService) {
  }

  addArtist() {
    this.createService.addArtist(this.artist)
      .subscribe(
        (data: ArtistModel) => {
          this.receivedArtist = data;
          console.log(data);
          this.done = true;
        },
        error => console.log(error)
      );
  }

  changeArtist(id: number) {
    this.changeService.changeArtist(id, this.artist.name).subscribe(
      (data) => {

        console.log(data);
      });
  }

  ngOnInit(): void {
    //this.addArtist();
  }

}
