import {Component, OnInit} from '@angular/core';
import {GetService} from "../services/get.service";
import {TrackModel} from "../../dto/track.model";
import {GenreModel} from "../../dto/genre.model";




@Component({
  selector: 'app-table-genre',
  templateUrl: './table-genre.component.html',
  styleUrls: ['./table-genre.component.css']
})
export class TableGenreComponent implements OnInit {
  genres: GenreModel[] = [];

  constructor( private getService: GetService) {}

  ngOnInit(): void {
    this.getGenres();
  }

  getGenres() {
    this.getService.getGenres()
      .subscribe(data => {
        console.log(data);
        this.genres = data;
      });
  }




}
