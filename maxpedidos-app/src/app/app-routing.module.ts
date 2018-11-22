import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

const routes: Routes = [
  {
    path: 'produtos',
    loadChildren: './modules/produtos/produtos.module#ProdutosModule'
  },
  {
    path: 'pedidos',
    loadChildren: './modules/pedidos/pedidos.module#PedidosModule'
  },
  {
    path: 'clientes',
    loadChildren: './modules/clientes/clientes.module#ClientesModule'
  },
  {
    path: '',
    redirectTo: '',
    pathMatch: 'full'
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
