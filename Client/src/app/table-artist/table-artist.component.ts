import {Component, Input, OnInit} from '@angular/core';
import {CreateService} from "../services/create.service";

@Component({
  selector: 'app-table-music',
  templateUrl: './table-artist.component.html',
  styleUrls: ['./table-artist.component.css']
})

export class TableArtistComponent implements OnInit {
  artists = [];

  constructor(private createService: CreateService) {
  }

  ngOnInit(): void {
    this.artists = this.createService.artists;
  }

}
