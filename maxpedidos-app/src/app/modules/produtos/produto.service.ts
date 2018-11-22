import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { environment } from '../../../environments/environment';
import { map } from 'rxjs/operators';
import { Produto } from './produto';

@Injectable({
  providedIn: 'root'
})
export class ProdutoService {

  path: string = "/produtos/";

  constructor(private http: HttpClient) { }



  getTodos(): Observable<any> {
    return this.http.get<any>(this.getPath());
  }

  buscarProduto(id: number): Observable<any> {
    return this.http.get(this.getPath(id.toString()));
  }

  salvarProduto(produto: Produto): Observable<any> {
    return this.http.post<Produto>(this.getPath(), produto);
  }

  atualizarProduto(id:number, produto: Produto): Observable<any> {
    return this.http.put<Produto>(this.getPath(id.toString()), produto);
  }

  apagarProduto(id:number): Observable<any> {
    return this.http.delete(this.getPath(id.toString()));
  }

  private getPath(addPath = '') {
    return environment.api_url + this.path + addPath;
  }

}
