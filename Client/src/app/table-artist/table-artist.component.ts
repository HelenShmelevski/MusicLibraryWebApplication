import {Component, Input, OnInit} from '@angular/core';
import {CreateService} from "../services/create.service";
import {ArtistsModel} from "../artists.model";
import {GetService} from "../get.service";

@Component({
  selector: 'app-table-music',
  templateUrl: './table-artist.component.html',
  styleUrls: ['./table-artist.component.css']
})

// export class TableArtistComponent implements OnInit {
//   artists = [];
//
//   constructor(private createService: CreateService) {
//   }
//
//   ngOnInit(): void {
//     this.artists = this.createService.artists;
//   }
//
// }

export class TableArtistComponent implements OnInit {
  artists: ArtistsModel[] = [];

  constructor(private getService: GetService) {
  }

  ngOnInit(): void {
    // this.getService.getArtists().subscribe((data=>this.artists = data["ARTISTS"]));
  }
 // getArtists () {
 //   this.getService.getArtists()
 //     .subscribe((data=>this.artists = data["ARTISTS"]));
 // }

  getArtists () {
    this.getService.getArtists()
      .subscribe((response) =>
      {console.log(response);}
      );
  }
}
