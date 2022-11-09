import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  title: string;
  activeTab: string = "";

  constructor(private router: Router) {
    this.title = 'Spring Boot - Angular Tourist Application';
  }

  navigateTo(tab: string) {
    this.router.navigate([tab]);
    this.activeTab = tab;
  }
}
