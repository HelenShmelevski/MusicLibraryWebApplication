import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import {NgModule} from '@angular/core';
import { TableMusicComponent } from './table-music/table-music.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    TableMusicComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
