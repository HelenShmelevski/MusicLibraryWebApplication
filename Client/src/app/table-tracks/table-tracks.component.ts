import {Component} from '@angular/core';
import {CreateService} from "../services/create.service";


@Component({
  selector: 'app-table-tracks',
  templateUrl: './table-tracks.component.html',
  styleUrls: ['./table-tracks.component.css']
})
export class TableTracksComponent {

  tracks = [];

  constructor(private createService: CreateService) {
  }


  ngOnInit(): void {
    this.tracks = this.createService.tracks;

  }


}

