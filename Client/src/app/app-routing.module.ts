import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {TableTracksComponent} from './table-tracks/table-tracks.component';
import {TableArtistComponent} from './table-artist/table-artist.component';
import {TableGenreComponent} from './table-genre/table-genre.component';
import {AddArtistComponent} from "./add-artist/add-artist.component";


const itemRoutes: Routes = [
  // { path: 'add_artist', component:  AddArtistComponent},

];

const routes: Routes = [
  {path: 'track', component: TableTracksComponent  },
  {path: 'artist', component: TableArtistComponent},
  {path: 'genre', component: TableGenreComponent},
  {path: 'add_artist', component:  AddArtistComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
