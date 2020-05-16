import {TrackModel} from "./track.model";

export class ArtistModel {
  id?: number;
  name?: string;
 // genre?: string;
  country?: string;
  tracks?:TrackModel [];

  // tracks: [{
  //   title: ""
  // }]
}
