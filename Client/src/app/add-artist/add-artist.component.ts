import { Component, OnInit } from '@angular/core';
import {CreateService} from "../services/create.service";

@Component({
  selector: 'app-add-artist',
  templateUrl: './add-artist.component.html',
  styleUrls: ['./add-artist.component.css']
  // providers: [AddArtistServise]
})
export class AddArtistComponent implements OnInit {
  artistId = 0;
  artistName = '';
  artistGenre = '';

  constructor(private createService: CreateService) { }

  ngOnInit(): void {
  }

  // addArtist() {
  //   this.createService.addArtist(this.artistId,this.artistName,this.artistGenre);
  //   this.artistName = '';
  //   this.artistId = 0;
  //   this.artistGenre = '';
  //
  // }

}
