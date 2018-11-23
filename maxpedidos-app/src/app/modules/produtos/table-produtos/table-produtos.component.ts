import { Component, OnInit } from '@angular/core';
import { Produto } from '../produto';
import { ProdutoService } from '../produto.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-table-produtos',
  templateUrl: './table-produtos.component.html',
  styleUrls: ['./table-produtos.component.css']
})
export class TableProdutosComponent implements OnInit {

  produtos: Produto[];
  displayedColumns: string[] = ['id', 'descricao', 'preco', 'acoes'];
  displayTable: boolean;

  constructor(private produtoService: ProdutoService, private router: Router) { }

  ngOnInit() {
    this.produtoService.getTodos().subscribe(res => {
      this.produtos = res.data;
    });
  }

  apagarProduto(id: number, index: number) {
    this.produtoService.apagarProduto(id).subscribe(res => {
      this.produtos = this.produtos.splice(index, 1);
      if (this.produtos.length == 0)
        console.log(this.produtos.length)
      }
    );
  }
}
