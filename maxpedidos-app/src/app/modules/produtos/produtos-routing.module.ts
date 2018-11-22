import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ProdutosListComponent } from 'src/app/modules/produtos/produtos-list/produtos-list.component';

const routes: Routes = [
  {
    path: '',
    component: ProdutosListComponent
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ProdutosRoutingModule { }
