import {ArtistModel} from "./artist.model";

export class TrackModel {
  id?: string;
  title?: string;
  name?: string;
  album?: string;
  dateRelease?: Date;
  artist?: ArtistModel;

}
