import { Component, OnInit } from '@angular/core';
import { Tourist } from '../tourist';
import { TouristService } from '../tourist-service.service';

@Component({
  selector: 'app-tourist-list',
  templateUrl: './tourist-list.component.html',
  styleUrls: ['./tourist-list.component.css']
})
export class TouristListComponent implements OnInit {

  tourists: Tourist[] = [];

  constructor(private touristService: TouristService) {
  }

  ngOnInit() {
    this.touristService.findAll().subscribe(data => {
      this.tourists = data;
    });
  }
}








