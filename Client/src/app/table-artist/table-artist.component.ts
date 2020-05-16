import {Component, Input, OnInit} from '@angular/core';
import {CreateService} from "../services/create.service";
import {GetService} from "../services/get.service";
import {ArtistModel} from "../../dto/artist.model";


@Component({
  selector: 'app-table-music',
  templateUrl: './table-artist.component.html',
  styleUrls: ['./table-artist.component.css']
})

export class TableArtistComponent implements OnInit {

  id: number;
  flagDisable: boolean = true;
  artists: ArtistModel[] = [];

  constructor(private getService: GetService) {
  }

  ngOnInit(): void {
    this.getArtists();
  }

  getArtists() {
    this.getService.getArtists()
      .subscribe(data => {
        console.log(data);
        this.artists = data;
      });
  }


  getId(id: number) {
    this.id = id;
  }
}
