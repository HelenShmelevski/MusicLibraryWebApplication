import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {TableTracksComponent} from './table-tracks/table-tracks.component';
import {TableArtistComponent} from './table-artist/table-artist.component';
import {TableGenreComponent} from './table-genre/table-genre.component';
import {AddArtistComponent} from "./add-artist/add-artist.component";
import {AddTrackComponent} from "./add-track/add-track.component";
import {AddGenreComponent} from "./add-genre/add-genre.component";


// const itemRoutes: Routes = [
//   { path: 'add_artist', component:  AddArtistComponent}
//
// ];

const routes: Routes = [
  {path: 'tracks', component: TableTracksComponent  },
  {path: 'artists', component: TableArtistComponent},
  {path: 'genres', component: TableGenreComponent},
  {path: 'add-artist', component:  AddArtistComponent},
  {path: 'add-track', component: AddTrackComponent},
  {path: 'add-genre', component: AddGenreComponent},
  {path: '', redirectTo: 'login', pathMatch: 'full'},
  {path: 'add-artist/:id', component:  AddArtistComponent},
  {path: 'add-track/:id', component:  AddTrackComponent},
  {path: 'add-genre/:id', component:  AddGenreComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
