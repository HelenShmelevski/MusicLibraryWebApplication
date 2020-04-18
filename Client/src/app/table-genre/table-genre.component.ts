import {Component, OnInit} from '@angular/core';
import {CreateService} from "../services/create.service";

// class Item {
//   id: number;
//   title: string;
//   name: string;
// constructor(id: number,  title: string, name: string) {
//   this.id = id;
//   this.title = title;
//   this.name = name;
//
// }


@Component({
  selector: 'app-table-genre',
  templateUrl: './table-genre.component.html',
  styleUrls: ['./table-genre.component.css']
})
export class TableGenreComponent implements OnInit {
  genres = [];

  constructor(private createService: CreateService) {
  }


  ngOnInit(): void {
    this.genres = this.createService.genres;
  }

}
