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

  flagDisable: boolean = true;
  artists: ArtistModel[] = [];
  id: number ;

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

  deleteArtist () {
    this.deleteService.deleteArtist(this.id)
      .subscribe(data => {
        // const data = response.json();
        console.log(data);
        this.getArtists();
        // this.artists = data;
      });

  }


  getId (id: number){
    this.id = id;
  }

}
