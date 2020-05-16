import {ArtistModel} from "./artist.model";

export class TrackModel {
  id?: number;
  title?: string;
  name?: string;
  album?: string;
 dateRelease?: string;
 artist?: ArtistModel;
 //
 //  artist = {
 //   artistsID: -1,
 //   name: ""
 // };


}
