import { NovoUsuarioService } from './novo-usuario.service';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { NovoUsuario } from './novo-usuario';

@Component({
  selector: 'app-novo-usuario',
  templateUrl: './novo-usuario.component.html',
  styleUrls: ['./novo-usuario.component.css']
})
export class NovoUsuarioComponent implements OnInit {

  novoUsuarioForm!: FormGroup;

  constructor(private usuarioFormBuilder: FormBuilder, private novoUsuarioService: NovoUsuarioService) { }

  ngOnInit(): void {
    this.novoUsuarioForm = this.usuarioFormBuilder.group({
      email: ['', [Validators.email, Validators.required]],
      fullName: ['', [Validators.required, Validators.minLength(4)]],
      userName: [''],
      password: [''],
    })
  }

  cadastrar() {
    const novoUsuario = this.novoUsuarioForm.getRawValue() as NovoUsuario;
    console.log(novoUsuario);
  }
}
