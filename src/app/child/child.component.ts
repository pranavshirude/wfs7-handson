import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';

@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css']
})
export class ChildComponent  {

  @Input()
  childName = undefined;

  likeCounter : number = 0;
  disLikeCounter : number = 0;

  @Output()
  counterLike : EventEmitter<number> = new EventEmitter<number>();

  counterDisLike : EventEmitter<number> = new EventEmitter<number>();
    
    incLikes(){
    this.likeCounter++;
    this.counterLike.emit(this.likeCounter);
  }

  incDisLikes(){
    this.disLikeCounter++;
    this.counterDisLike.emit(this.disLikeCounter);
  }



}
