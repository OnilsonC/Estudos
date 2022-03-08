import { Component, EventEmitter, Output } from '@angular/core';
import {TransferenciaService} from '../services/transferencia.service';
import {Transferencia} from '../models/transferencia.model';
import {Router} from '@angular/router';

@Component({
  selector: 'app-nova-transferencia',
  templateUrl: './nova-transferencia.component.html',
  styleUrls: ['./nova-transferencia.component.scss'],
})
export class NovaTransferencia {

  @Output()
  aoTransferir = new EventEmitter<any>();

  constructor(private service: TransferenciaService, private router: Router) {
  }

  valor: number;
  destino: number;

  transferir() {
    console.log('Transferência solicitada.');

    const emitirValor: Transferencia = { valor: this.valor, destino: this.destino };
    this.service.adicionar(emitirValor).subscribe((resultado) => {
      console.log(resultado);
      this.router.navigateByUrl('extrato');
      this.limparCampos();
    },
      (erro) => console.error(erro)
      );

  }

  limparCampos() {
    this.valor = 0;
    this.destino = 0;
  }
}
