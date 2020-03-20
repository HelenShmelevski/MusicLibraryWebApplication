import { Component, OnInit } from '@angular/core';

class Item {
  id: number;
  title: string;
  name: string;


  constructor(id: number,  title: string, name: string) {
    this.id = id;
    this.title = title;
    this.name = name;

  }
}

@Component({
  selector: 'app-table-genre',
  templateUrl: './table-genre.component.html',
  styleUrls: ['./table-genre.component.css']
})
export class TableGenreComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }
  items: Item[] =
    [
      {id: 5, title: 'Pop', name: 'Билан' },
      {id: 10, title: 'Rock' ,name: 'Rammstein'},
      {id: 5, title: 'Jazz' ,name: 'Картофель'},
      {id: 9, title: 'Хлеб', name: 'Сыр' },
      {id: 9, title: 'Хлеб', name: 'Сыр' },
      {id: 10, title: 'Хлеб', name: 'Сыр' },
      {id: 9, title: 'Хлеб', name: 'Сыр' }
    ];

}
