import java.util.Scanner;

public class ExercicioJogoDaVelha_Matrizes {

	public static void main(String[] args) {

    Scanner leia = new Scanner(System.in);

    char [] [] jogoVelha = new char [3] [3];
    
    System.out.println("Jogador 1 = X ");
    System.out.println("Jogador 2 = O ");
    
    boolean ganhouJogo = false;
    int jogada = 1;
    char Sinal;
    int linha = 0, coluna = 0;
    
    while (!ganhouJogo) {
    	
    if (jogada % 2 == 1) {
     System.out.println("Agora é a vez do jogador 1. Escolha linha e coluna (1- 3)");
     Sinal = 'X';
    }else{
   	System.out.println("Agora é a vez do jogador 2. Escolha linha e coluna (1- 3)");
    	Sinal = 'O';
    }
    
  boolean linhaValida = false;
  
  while (!linhaValida) {
	  System.out.println("Entre com a linha 1 | 2 ou 3 ");
	  linha = leia.nextInt();
	  if (linha >=1 && linha <=3) {
		  linhaValida = true;
	  } else {
	  System.out.println("Entrada inválida. Jogue novamente!!!");
     }
  }
    
  boolean colunaValida = false;
  while (!colunaValida) {
	  System.out.println("Entre com a coluna 1 | 2 ou 3 ");
	  coluna = leia.nextInt();
	  if (coluna >=1 && coluna <=3) {
		  colunaValida = true;
	  } else {
		  
	  System.out.println("Entrada inválida. Jogue novamente!!!");
  }
  }
  
  linha--;
  coluna--;

	if(jogoVelha[linha][coluna] == 'X'|| jogoVelha [linha][coluna] == 'O') {	
System.out.println("Posição já usada por outro jogador. Tente novamente!!!");
}
else{
	jogoVelha[linha][coluna]= Sinal;
	jogada++;
    }
  
   
  //imprimir o tabuleiro Jogo da velha
  
  for (int i=0; i<jogoVelha.length; i++){
	  for(int j=0; j<jogoVelha[i].length; j++) {  
		  System.out.print(jogoVelha[i][j] + " | ");
	  }
	   System.out.println();
  }
  // verificar o jogador do jogo
  
if((jogoVelha[0][0] == 'X' && jogoVelha [0][1] == 'X' && jogoVelha [0][2] =='X') ||
  (jogoVelha [1][0] == 'X' && jogoVelha [1][1]== 'X' && jogoVelha  [1][2] =='X' ) ||
  (jogoVelha [2][0] == 'X' && jogoVelha [2][1] == 'X' && jogoVelha [2][2] =='X' ) ||
  (jogoVelha [0][0] == 'X' && jogoVelha [1][0] == 'X' && jogoVelha [2][0] =='X' ) ||
  (jogoVelha [0][1] == 'X' && jogoVelha [1][1] == 'X' && jogoVelha [2][1] =='X' ) ||
  (jogoVelha [0][2] == 'X' && jogoVelha [1][2] == 'X' && jogoVelha [2][2] =='X' ) ||
  (jogoVelha [0][0] == 'X' && jogoVelha [1][1] == 'X' && jogoVelha [2][2] == 'X')){
	  ganhouJogo = true;
	  System.out.println("Parabéns o jogador 1 ganhou o jogo !!!");
	  
	} else  if ((jogoVelha[0][0] == 'O' && jogoVelha [0][1] =='O' && jogoVelha [0][2] =='O' ) ||
			  (jogoVelha [1][0] == 'O' && jogoVelha [1][1]== 'O' && jogoVelha  [1][2] =='O' ) ||
			  (jogoVelha [2][0] == 'O' && jogoVelha [2][1] == 'O' && jogoVelha [2][2] =='O' ) ||
			  (jogoVelha [0][0] == 'O' && jogoVelha [1][0] == 'O' && jogoVelha [2][0] =='O' ) ||
			  (jogoVelha [0][1] == 'O' && jogoVelha [1][1] == 'O' && jogoVelha [2][1] =='O' ) ||
			  (jogoVelha [0][2] == 'O' && jogoVelha [1][2] == 'O' && jogoVelha [2][2] =='O' ) ||
			  (jogoVelha [0][0] == 'O' && jogoVelha [1][1] == 'O' && jogoVelha [2][2] =='O')){
				  
	ganhouJogo = true;
	System.out.println("Parabéns o jogador 2 ganhou o jogo !!!"); 


	} else if (jogada>9){
		ganhouJogo = true; 
	  System.out.println("Nenhum dos jogadores ganhou o jogo !!!");
	}	
  }
 }
}