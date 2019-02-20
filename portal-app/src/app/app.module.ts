import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import { ProductoComponent } from './user/producto.component';
import { AppRoutingModule } from './app.routing.module';
import {UserService} from './user/producto.service';
import {HttpClientModule} from "@angular/common/http";
import {AddProductoComponent} from './user/add-producto.component';

@NgModule({
  declarations: [
    AppComponent,
    ProductoComponent,
    AddProductoComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [UserService],
  bootstrap: [AppComponent]
})
export class AppModule { }
