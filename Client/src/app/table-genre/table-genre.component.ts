import {Component, OnInit} from '@angular/core';
import {GetService} from "../services/get.service";
import {TrackModel} from "../../dto/track.model";
import {GenreModel} from "../../dto/genre.model";
import {ArtistModel} from "../../dto/artist.model";
import {DeleteService} from "../services/delete.service";




@Component({
  selector: 'app-table-genre',
  templateUrl: './table-genre.component.html',
  styleUrls: ['./table-genre.component.css']
})
export class TableGenreComponent implements OnInit {
  id: number;
  flagDisable: boolean = true;
  genres: GenreModel[] = [];

  constructor( private getService: GetService, private deleteService: DeleteService) {}

  ngOnInit(): void {
    this.getService.getGenres()
      .subscribe(data => {
        console.log(data);
        this.genres = data;
      });
  }

  deleteGenre() {
    this.deleteService.deleteGenre(this.id)
      .subscribe(data => {
        // const data = response.json();
        console.log(data);
        this.getGenres();
        // this.artists = data;
      });

  }

  getId(id: number) {
    this.id = id;
  }


}
