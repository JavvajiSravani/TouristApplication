import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { TouristListComponent } from './tourist-list/tourist-list.component';
import { TouristFormComponent } from './tourist-form/tourist-form.component';
import { HomeComponent } from './home/home.component';

const routes: Routes = [
  { path: 'tourists', component:TouristListComponent },
  { path: 'addtourist', component: TouristFormComponent },
  { path: 'home', component: HomeComponent }
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }











