import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { AppComponent } from './app.component';
import { TouristListComponent } from './tourist-list/tourist-list.component';
import { TouristFormComponent } from './tourist-form/tourist-form.component';
import { TouristService } from './tourist-service.service';
import { HomeComponent } from './home/home.component';


@NgModule({
  declarations: [
    AppComponent,
    TouristListComponent,
    TouristFormComponent,
    HomeComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [TouristService],
  bootstrap: [AppComponent]
})
export class AppModule { }











