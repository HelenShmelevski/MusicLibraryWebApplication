import {Component, OnInit} from '@angular/core';
import {CreateService} from "../services/create.service";
import {ArtistModel} from "../../dto/artist.model";
import {GenreModel} from "../../dto/genre.model";
import {ChangeService} from "../services/change.service";
import {GetService} from "../services/get.service";
import {ActivatedRoute} from "@angular/router";

@Component({
  selector: 'app-add-genre',
  templateUrl: './add-genre.component.html',
  styleUrls: ['./add-genre.component.css']
})
export class AddGenreComponent implements OnInit {
  flagDisable: boolean = true;
  id: number;
  genre: GenreModel = new GenreModel();

  constructor(private createService: CreateService, private changeService: ChangeService,
              private getService: GetService, private activateRoute: ActivatedRoute) {
    this.id = activateRoute.snapshot.params['id'];
  }

  addGenre(genre: GenreModel) {
    this.createService.addGenre(genre)
      .subscribe(
        (data: GenreModel) => {
          console.log(genre);
        },
        error => console.log(error)
      );
  }

  changeGenre(genre) {
    this.changeService.changeGenre(genre).subscribe(
      (data) => {
        console.log(data);
      });
  }

  ngOnInit(): void {
    if (this.id) {
      this.flagDisable = false;
      this.getService.getGenreByID(this.id)
        .subscribe(data => {
          this.genre = data;
        });
    }
  }


}
