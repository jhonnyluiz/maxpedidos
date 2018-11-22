import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ProdutosListComponent } from 'src/app/modules/produtos/produtos-list/produtos-list.component';
import { ProdutosCadastrarComponent } from './produtos-cadastrar/produtos-cadastrar.component';

const routes: Routes = [
  {
    path: '',
    component: ProdutosListComponent
  },
  {
    path: 'criar',
    component: ProdutosCadastrarComponent
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ProdutosRoutingModule { }
