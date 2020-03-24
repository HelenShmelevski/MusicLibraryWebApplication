import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import {NgModule} from '@angular/core';
import { TableArtistComponent } from './table-artist/table-artist.component';
import { TableTracksComponent } from './table-tracks/table-tracks.component';
// import {Routes, RouterModule} from '@angular/router';
import { TableGenreComponent } from './table-genre/table-genre.component';
import { BtnComponent } from './btn/btn.component';
import { AddArtistComponent } from './add-artist/add-artist.component';
import {FormsModule} from "@angular/forms";
import { ButtonAddComponent } from './button-add/button-add.component';
import { ButtonDeleteComponent } from './button-delete/button-delete.component';
import { ButtonChangeComponent } from './button-change/button-change.component';
import { AddTrackComponent } from './add-track/add-track.component';
import { AddGenreComponent } from './add-genre/add-genre.component';
import {AddArtistServise} from "./addArtist.servise";
import {AddTrackService} from "./addTrack.service";
import {AuthModule} from "./auth/auth.module";



@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    TableArtistComponent,
    TableTracksComponent,
    TableGenreComponent,
    TableGenreComponent,
    BtnComponent,
    AddArtistComponent,
    ButtonAddComponent,
    ButtonDeleteComponent,
    ButtonChangeComponent,
    AddTrackComponent,
    AddGenreComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    AuthModule
  ],
  providers: [AddArtistServise, AddTrackService],
  bootstrap: [AppComponent]
})
export class AppModule { }
