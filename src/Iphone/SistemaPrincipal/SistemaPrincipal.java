package Iphone.SistemaPrincipal;

import Iphone.NavegadorInternet.Navegador;
import Iphone.ReprodutorMusical.ReprodutorMusical;
import Iphone.Telefone.Telefone;

public class SistemaPrincipal implements Telefone, ReprodutorMusical, Navegador{
   public void tocar(){
    System.out.println("Reproduzindo faixa atual...");
   }

   public void pausar(){
    System.out.println("Faixa atual pausada.");
   }

   public void selecionarMusica(){
    System.out.println("Música selecionada.");
   }

   public void discar(){
    System.out.println("Discando...");
   };
    
   public void atender(){
    System.out.println("Atendeu!");
   };

   public void abrirCorreioDeVoz(){
    System.out.println("Correio de voz aberto... Diga sua mensagem.");
   };

   public void atualizarPagina(){
    System.out.println("Página atual atualizada.");
   };

   public void adicionarNovaAba(){
    System.out.println("Nova aba adicionada às abas abertas.");
   };

   public void exibirPagina(){
    System.out.println("Exibindo página atual.");
   };
}