import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { ProdutosRoutingModule } from './produtos-routing.module';
import { ProdutosListComponent } from './produtos-list/produtos-list.component';
import { MatCardModule, MatTableModule, MatButtonModule, MatFormFieldModule, MatInputModule } from '@angular/material';
import { TableProdutosComponent } from './table-produtos/table-produtos.component';
import { ProdutosCadastrarComponent } from './produtos-cadastrar/produtos-cadastrar.component';
import { FormsModule } from '@angular/forms';

@NgModule({
  imports: [
    CommonModule,
    ProdutosRoutingModule, 
    MatCardModule,
    MatButtonModule,
    MatTableModule,
    MatInputModule,
    MatFormFieldModule,
    FormsModule
  ],
  declarations: [ProdutosListComponent, TableProdutosComponent, ProdutosCadastrarComponent]
})
export class ProdutosModule { }
