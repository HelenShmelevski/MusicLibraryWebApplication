import { Component, OnInit } from '@angular/core';
import {CreateService} from "../services/create.service";

@Component({
  selector: 'app-add-genre',
  templateUrl: './add-genre.component.html',
  styleUrls: ['./add-genre.component.css']
})
export class AddGenreComponent implements OnInit {
  genreId = 0;
  genreTitle = '';
  genreName = '';

  constructor(private createService: CreateService) { }

  ngOnInit(): void {
  }

  // addGenre() {
  //   this.createService.addGenre(this.genreId,this.genreTitle,this.genreName);
  //   this.genreName = '';
  //   this.genreId = 0;
  //   this.genreTitle = '';
  //
  // }

}
