import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { ProductoComponent } from './user/producto.component';
import {AddProductoComponent} from './user/add-producto.component';

const routes: Routes = [
  { path: 'users', component: ProductoComponent },
  { path: 'add', component: AddProductoComponent }
];

@NgModule({
  imports: [
    RouterModule.forRoot(routes)
  ],
  exports: [
    RouterModule
  ],
  declarations: []
})
export class AppRoutingModule { }
