import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { PedidosRoutingModule } from './pedidos-routing.module';
import { PedidosListComponent } from './pedidos-list/pedidos-list.component';

@NgModule({
  imports: [
    CommonModule,
    PedidosRoutingModule
  ],
  declarations: [PedidosListComponent]
})
export class PedidosModule { }
