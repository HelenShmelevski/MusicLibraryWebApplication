import {Component, Input, OnInit} from '@angular/core';
import {CreateService} from "../services/create.service";
import {GetService} from "../services/get.service";
import {ArtistModel} from "../../dto/artist.model";
import {DeleteService} from "../services/delete.service";


@Component({
  selector: 'app-table-music',
  templateUrl: './table-artist.component.html',
  styleUrls: ['./table-artist.component.css']
})

export class TableArtistComponent implements OnInit {


  artists: ArtistModel[] = [];


  // constructor(private createService: CreateService, private getService: GetService) {
  // }


  constructor( private getService: GetService, private deleteService: DeleteService) {
  }

  ngOnInit(): void {
    // this.getService.getArtists();
    // this.artists = this.createService.artists;
    this.getArtists();
  }

  getArtists() {
    this.getService.getArtists()
      .subscribe(data => {
        // const data = response.json();
        console.log(data);
        this.artists = data;
      });
  }

  deleteArtist (id: number) {
    this.deleteService.deleteArtist(id)
      .subscribe(data => {
        // const data = response.json();
        console.log(data);
        this.artists = data;
      });

  }

}
