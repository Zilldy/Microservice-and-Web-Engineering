import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, FormsModule],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'Aula12 - Guilherme Cardoso';

  desabilitado: boolean = true;
  imageUrl: String = "https://picsum.photos/id/500/150/150";

  isMouseOver: boolean = false;
  valorAtual: string = '';
  valorSalvo: string = '';

  botaoClicado() {
    alert('Botão clicado!');
    this.desabilitado = !this.desabilitado;
  }

  onKeyUp(event: KeyboardEvent) {
    this.valorAtual = event.key;
  }

  salvarValor(event: any) {
    this.valorSalvo = event;
  }

  onMouseOverOut() {
    this.isMouseOver = !this.isMouseOver;
  }

  nome : string = '';
}
