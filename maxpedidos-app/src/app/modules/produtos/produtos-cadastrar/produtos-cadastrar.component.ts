import { Component, OnInit, Input } from '@angular/core';
import { ProdutoService } from '../produto.service';
import { Produto } from '../produto';
import { Router } from '@angular/router';

@Component({
  selector: 'app-produtos-cadastrar',
  templateUrl: './produtos-cadastrar.component.html',
  styleUrls: ['./produtos-cadastrar.component.css']
})
export class ProdutosCadastrarComponent implements OnInit {

  produto: Produto;

  constructor(private produtoService: ProdutoService, private router: Router) { }

  ngOnInit() {
    this.produto = new Produto();
  }

  salvarProduto(p:Produto) {
    this.produtoService.salvarProduto(p).subscribe( (res) => {
      this.router.navigate(['/produtos']);
    });
  }

}
