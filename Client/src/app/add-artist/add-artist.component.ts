import { Component, OnInit } from '@angular/core';
import {AddArtistServise} from "../addArtist.servise";

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

  constructor(private addart: AddArtistServise) { }

  ngOnInit(): void {
  }

  addArtist() {
    this.addart.addArtist(this.artistId,this.artistName,this.artistGenre);
    this.artistName = '';
    this.artistId = 0;
    this.artistGenre = '';

  }

}
