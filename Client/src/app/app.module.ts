import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import {NgModule} from '@angular/core';
import { TableMusicComponent } from './table-music/table-music.component';
import { TableTracksComponent } from './table-tracks/table-tracks.component';
import {Routes, RouterModule} from '@angular/router';
import { TableGenreComponent } from './table-genre/table-genre.component';

const appRoutes: Routes =  [
  {path: 'track', component: TableTracksComponent },
  {path: '', component: TableMusicComponent},
  {path: 'genre', component: TableGenreComponent}
] ;

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    TableMusicComponent,
    TableTracksComponent,
    TableGenreComponent,
    TableGenreComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    RouterModule.forRoot(appRoutes)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
