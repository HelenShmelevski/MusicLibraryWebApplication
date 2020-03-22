import {Component, Input, OnInit} from '@angular/core';
import {AddArtistServise} from "../addArtist.servise";

// class Item {
//   id: number;
//   name: string;
//   genre: string;
//
//   constructor(id: number, name: string, genre: string) {
//     this.id = id;
//     this.name = name;
//     this.genre = genre;
//   }
// }

@Component({
  selector: 'app-table-music',
  templateUrl: './table-artist.component.html',
  styleUrls: ['./table-artist.component.css']
  // providers: [AddArtistServise]
})
export class TableArtistComponent implements OnInit {
  artists = [
  ];

  constructor(private addart: AddArtistServise) {
  }

  ngOnInit(): void {
    this.artists = this.addart.artists;
  }

  // showButton() {}
  // items: Item[] =
  //   [
  //     {id: 5,  name: 'Билан',genre: 'dhi' },
  //     {id: 10,  name: 'Масло', genre: 'dhi' },
  //     {id: 5,  name: 'Картофель',genre: 'dhi' },
  //     {id: 9,  name: 'Билан', genre: 'dhi' },
  //     {id: 9,  name: 'Монатик', genre: 'dhi'},
  //     {id: 10,  name: 'Сыр',genre: 'dhi'  },
  //     {id: 9,  name: 'Монатик', genre: 'dhi' }
  //   ];
}
