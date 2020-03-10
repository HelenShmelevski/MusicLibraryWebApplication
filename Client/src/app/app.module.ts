import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import {NgModule} from '@angular/core';
import { TableMusicComponent } from './table-music/table-music.component';
import { TableTracksComponent } from './table-tracks/table-tracks.component';
// import {Routes, RouterModule} from '@angular/router';
import { TableGenreComponent } from './table-genre/table-genre.component';



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
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
