import { Component, OnInit } from '@angular/core';
import { Produto } from '../produto';
import { ProdutoService } from '../produto.service';

@Component({
  selector: 'app-table-produtos',
  templateUrl: './table-produtos.component.html',
  styleUrls: ['./table-produtos.component.css']
})
export class TableProdutosComponent implements OnInit {

  produtos: Produto[];
  displayedColumns: string[] = ['id', 'descricao', 'preco','acoes'];

  constructor(private produtoService: ProdutoService) { }

  ngOnInit() {
    this.produtoService.getTodos().subscribe(res => {
      this.produtos = res.data;
    });
  }
}
