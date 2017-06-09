import java.util.*;

class Main {
  public static void main(String[] args) {
    Jogo j = new Jogo();
    j.jogar();
  }
}

class Jogo{
  Fase atual;
  ArrayList<Fase> fases =new ArrayList<Fase>();
  Jogador jogador;
  
  public Jogo(){
    
    jogador = new Jogador();
    jogador.vidas = 3;
    jogador.pontos = 0;
    
    criarFase("2+2",4);
    criarFase("2+10",12);
    criarFase("2+2+2",6);
    criarFase("2x20",40);
    criarFase("4x20",80);
    criarFase("1x20",20);
    criarFase("4x20",80);
    
  }
  
  public void jogar(){
    
    this.atual = this.fases.remove(0);
    
    while(this.atual != null){
      
      System.out.println(this.atual.pergunta);
      System.out.println("digite a resposta:");
      
      Scanner scanner = new Scanner(System.in);
      String s = scanner.nextLine();
      int i = Integer.parseInt(s);
      
      if(i != this.atual.resposta){
        jogador.tirarUmaVida();
        System.out.println("errou!");
      }else{
        System.out.println("resposta correta!");
        jogador.pontos++;
        if(this.fases.size()>0){
          this.atual = this.fases.remove(0);
        }else{
          this.atual = null;
        }
      }
    }
    System.out.println("fim de jogo");
    System.out.println("você acertou "+jogador.pontos+" questoes.");
  }
  
  public void criarFase(String p, int i){
    Fase f = new Fase();
    f.pergunta = p;
    f.resposta = i;
    fases.add(f);
  }
  
}

class Fase{
    String pergunta;
    int resposta;
}

class Jogador{
  int vidas;
  int pontos;
  
  public Jogador(){
    
  }
  
  public void tirarUmaVida(){
    this.vidas--;
  }
}