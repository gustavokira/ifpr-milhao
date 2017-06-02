import java.util.*;
 
class Main {
  public static void main(String[] args) {
    BancoDeQuestoes banco = new BancoDeQuestoes();
    while(banco.aindaTemQuestoesFaceis()){
      Questao facil = banco.sortearQuestaoFacil();
      System.out.println(facil.enunciado);
    }
  }
}
 
class Questao{
  public String enunciado;
}
 
class BancoDeQuestoes{
 
  private ArrayList<Questao> faceis;
  private ArrayList<Questao> medias;
  private ArrayList<Questao> dificeis;
 
  public BancoDeQuestoes(){
    this.faceis = new ArrayList<Questao>();
    this.medias = new ArrayList<Questao>();
    this.dificeis = new ArrayList<Questao>();
    
    this.criarQuestoesFaceis();
    this.criarQuestoesMedias();
    this.criarQuestoesDificeis();
  }
  
  public Questao sortearQuestaoFacil(){
     Random random = new Random();
     int i = random.nextInt(this.faceis.size());
     Questao sorteada = this.faceis.remove(i);
     
     return sorteada;
  }
  public Questao sortearQuestaoMedia(){
    Random random = new Random();
     int i = random.nextInt(this.medias.size());
     Questao sorteada = this.medias.remove(i);
     
     return sorteada;
  }
  public Questao sortearQuestaoDificil(){
    Random random = new Random();
     int i = random.nextInt(this.dificeis.size());
     Questao sorteada = this.dificeis.remove(i);
     
     return sorteada;
  }
  
  public void criarQuestoesFaceis(){
    Questao q1 = new Questao();
    q1.enunciado = "Esta é a questao facil 1";
    
    this.faceis.add(q1);
    
    Questao q2 = new Questao();
    q2.enunciado = "Esta é a questao facil 2";
    
    this.faceis.add(q2);
    
    Questao q3 = new Questao();
    q3.enunciado = "Esta é a questao facil 3";
    
    this.faceis.add(q3);
    
  }
  public void criarQuestoesMedias(){
    Questao q1 = new Questao();
    q1.enunciado = "Esta é uma questao media 2";
    
    this.medias.add(q1);
    
    Questao q2 = new Questao();
    q2.enunciado = "Esta é a questao media 2";
    
    this.medias.add(q2);
  }
  public void criarQuestoesDificeis(){
    Questao q1 = new Questao();
    q1.enunciado = "Esta é uma questao dificil 1";
    
    this.dificeis.add(q1);
    
    Questao q2 = new Questao();
    q2.enunciado = "Esta é uma questao dificil 2";
    
    this.dificeis.add(q2);
  }
 
  public boolean aindaTemQuestoesFaceis(){
	  if(this.faceis.size() == 0){
	    return false;
	  } 
    else{
      return true;
    }
  }
public boolean aindaTemQuestoesMedias(){
  if(this.faceis.size() == 0){
	    return false;
	  } 
    else{
      return true;
    }
}
 
public boolean aindaTemQuestoesDificeis(){
  if(this.faceis.size() == 0){
	    return false;
	  } 
    else{
      return true;
    }
}
 
}
 
 
 
 
