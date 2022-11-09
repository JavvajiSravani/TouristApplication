import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { TouristService } from '../tourist-service.service';
import { Tourist } from '../tourist';


@Component({
  selector: 'app-tourist-form',
  templateUrl: './tourist-form.component.html',
  styleUrls: ['./tourist-form.component.css']
})
export class TouristFormComponent {

  tourist: Tourist;
  invalidAge: string = "";

  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private touristService: TouristService) {
    this.tourist = new Tourist();
  }

  onSubmit() {
    this.touristService.save(this.tourist).subscribe(result => this.gotoTouristList());
    alert("Registered Sucessfully");
  }

  gotoTouristList() {
    this.router.navigate(['/tourists']);
  }

  validateAge(event: any) {
    let age = event.target.value;
    if (age > 90) {
      this.invalidAge = "Age should be less than 90";
      event.target.value = "";
    } else {
      this.invalidAge = "";
    }
  }
}













