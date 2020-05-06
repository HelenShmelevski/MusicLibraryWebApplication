import {BrowserModule} from '@angular/platform-browser';

import {AppRoutingModule} from './app-routing.module';
import {AppComponent} from './app.component';
import {HeaderComponent} from './header/header.component';
import {NgModule} from '@angular/core';
import {TableArtistComponent} from './table-artist/table-artist.component';
import {TableTracksComponent} from './table-tracks/table-tracks.component';
// import {Routes, RouterModule} from '@angular/router';
import {TableGenreComponent} from './table-genre/table-genre.component';
import {AddArtistComponent} from './add-artist/add-artist.component';
import {FormsModule} from "@angular/forms";
import {AddTrackComponent} from './add-track/add-track.component';
import {AddGenreComponent} from './add-genre/add-genre.component';
import {CreateService} from "./services/create.service";
import {AuthModule} from "./auth/auth.module";
import {HttpClientModule} from '@angular/common/http';
import {GetService} from "./services/get.service";


@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    TableArtistComponent,
    TableTracksComponent,
    TableGenreComponent,
    TableGenreComponent,
    AddArtistComponent,
    AddTrackComponent,
    AddGenreComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    AuthModule,
    HttpClientModule

  ],
  providers: [CreateService, GetService],
  bootstrap: [AppComponent]
})
export class AppModule {
}
