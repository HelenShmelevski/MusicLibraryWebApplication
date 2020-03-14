import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import {NgModule} from '@angular/core';
import { TableArtistComponent } from './table-artist/table-artist.component';
import { TableTracksComponent } from './table-tracks/table-tracks.component';
// import {Routes, RouterModule} from '@angular/router';
import { TableGenreComponent } from './table-genre/table-genre.component';
import { AuthComponent } from './auth/auth.component';
import { BtnComponent } from './btn/btn.component';



@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    TableArtistComponent,
    TableTracksComponent,
    TableGenreComponent,
    TableGenreComponent,
    AuthComponent,
    BtnComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
