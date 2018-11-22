import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ProdutosCadastrarComponent } from './produtos-cadastrar.component';

describe('ProdutosCadastrarComponent', () => {
  let component: ProdutosCadastrarComponent;
  let fixture: ComponentFixture<ProdutosCadastrarComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ProdutosCadastrarComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ProdutosCadastrarComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
