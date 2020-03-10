import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {TableTracksComponent} from './table-tracks/table-tracks.component';
import {TableMusicComponent} from './table-music/table-music.component';
import {TableGenreComponent} from './table-genre/table-genre.component';


const routes: Routes = [
  {path: 'track', component: TableTracksComponent },
  {path: '', component: TableMusicComponent},
  {path: 'genre', component: TableGenreComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
