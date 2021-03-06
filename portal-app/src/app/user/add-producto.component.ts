import { Component } from '@angular/core';
import { Router } from '@angular/router';

import { User } from '../models/user.model';
import { UserService } from './producto.service';

@Component({
  templateUrl: './add-producto.component.html'
})
export class AddProductoComponent {

  user: User = new User();

  constructor(private router: Router, private userService: UserService) {

  }

  createUser(): void {
    this.userService.createUser(this.user)
        .subscribe( data => {
          alert("User created successfully.");
        });

  };

}
