import { Component} from '@angular/core';
class Item {
  id: number;
  name: string;
  title: string;
  genre: string;
  duration: number;

  constructor(id: number, name: string, title: string,genre: string,duration: number) {
    this.id = id;
    this.name = name;
    this.title = title;
    this.genre = genre;
    this.duration = duration;
  }
}


@Component({
  selector: 'app-table-tracks',
  templateUrl: './table-tracks.component.html',
  styleUrls: ['./table-tracks.component.css']
})
export class TableTracksComponent  {
  items: Item[] =
    [
      {id: 5,  name: 'Билан', title: 'Любовная любовь', genre: 'Pop', duration: 2 },
      {id: 10,  name: 'Монатик', title: 'Кружит голову', genre: 'Pop',duration: 5 },
      {id: 5,  name: 'Rammstein', title: 'DEUTSCHLAND', genre: 'Rock' ,duration: 5},
      {id: 9,  name: 'Joji', title: 'Window', genre: 'dhi',duration: 5 },
      {id: 9,  name: 'Монатик', title: 'Кружит голову', genre: 'dhi',duration: 5 },
      {id: 10,  name: 'Сыр', title: 'Хлеб', genre: 'dhi',duration: 5 },
      {id: 9,  name: 'Сыр', title: 'Хлеб', genre: 'dhi',duration: 5 },
      {id: 9,  name: 'Сыр', title: 'Хлеб', genre: 'dhi',duration: 5 },
      {id: 9,  name: 'Сыр', title: 'Хлеб', genre: 'dhi',duration: 5 },
      {id: 9,  name: 'Сыр', title: 'Хлеб', genre: 'dhi',duration: 5 }
    ];





}

