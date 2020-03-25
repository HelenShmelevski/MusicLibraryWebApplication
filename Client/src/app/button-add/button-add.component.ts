import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-button-add',
  templateUrl: './button-add.component.html',
  styleUrls: ['./button-add.component.css']
})
export class ButtonAddComponent implements OnInit {
  a : boolean = false;
  constructor() { }

  ngOnInit(): void {
  }

  addArtist() {
    this.a = true;
  }
  addGenre() {
    this.a = true;
  }
}
