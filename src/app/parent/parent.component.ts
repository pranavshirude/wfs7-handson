import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parent',
  templateUrl: './parent.component.html',
  styleUrls: ['./parent.component.css']
})
export class ParentComponent {

    parentName = "Paresh"; //{{parentName}}
    names = ["Alex", "Bruce", "Chandler", "David"];
    likeCounter : number = undefined;
    disLikeCounter : number = undefined;
}
