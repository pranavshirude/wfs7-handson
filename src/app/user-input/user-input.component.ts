import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-user-input',
  templateUrl: './user-input.component.html',
  styleUrls: ['./user-input.component.css']
})
export class UserInputComponent {

  username = undefined;
  password = undefined;
  
  isDisabled = true;

  handleButton(u, p){
    this.username = u;
    this.password = p;
    console.log('handleButton() is called');
  }
  enableButton(p : string){
    if(p.length >=3 ){
      this.isDisabled = false;
    }else{
      this.isDisabled = true;
    }
  }
}
