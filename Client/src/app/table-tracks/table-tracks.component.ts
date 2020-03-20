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
      {id: 5,  name: 'Хлеб', title: 'Хлеб', genre: '15.9', duration: 5 },
      {id: 10,  name: 'Масло', title: 'Хлеб', genre: 'dnjksd',duration: 5 },
      {id: 5,  name: 'Картофель', title: 'Хлеб', genre: 'ifh' ,duration: 5},
      {id: 9,  name: 'Сыр', title: 'Хлеб', genre: 'dhi',duration: 5 },
      {id: 9,  name: 'Сыр', title: 'Хлеб', genre: 'dhi',duration: 5 },
      {id: 9,  name: 'Сыр', title: 'Хлеб', genre: 'dhi',duration: 5 },
      {id: 9,  name: 'Сыр', title: 'Хлеб', genre: 'dhi',duration: 5 }
    ];





}

