import { Component, OnInit } from '@angular/core';
import {AddTrackService} from "../addTrack.service";
import {AddArtistServise} from "../addArtist.servise";
import {AddGenreServise} from "../addGenre.servise";

@Component({
  selector: 'app-add-genre',
  templateUrl: './add-genre.component.html',
  styleUrls: ['./add-genre.component.css']
})
export class AddGenreComponent implements OnInit {
  genreId = 0;
  genreTitle = '';
  genreName = '';

  constructor(private addgen: AddGenreServise) { }

  ngOnInit(): void {
  }

  addGenre() {
    this.addgen.addGenre(this.genreId,this.genreTitle,this.genreName);
    this.genreName = '';
    this.genreId = 0;
    this.genreTitle = '';

  }

}
