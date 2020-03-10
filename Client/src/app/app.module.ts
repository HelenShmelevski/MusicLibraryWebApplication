import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import {NgModule} from '@angular/core';
import { TableMusicComponent } from './table-music/table-music.component';
import { TableTracksComponent } from './table-tracks/table-tracks.component';
import {Routes, RouterModule} from '@angular/router';

const appRoutes: Routes =  [
  {path: 'track', component: TableTracksComponent },
  {path: '', component: TableMusicComponent}
] ;

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    TableMusicComponent,
    TableTracksComponent
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
