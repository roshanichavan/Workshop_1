package Tik_Tag_Game;

public class UC_3 {
	static String[] board;
	static String turn;

	 static void printBoard()
	    {
	        System.out.println("|---|---|---|");
	        System.out.println("| " + board[1] + " | "
	                           + board[2] + " | " + board[3]
	                           + " |");
	        System.out.println("|-----------|");
	        System.out.println("| " + board[4] + " | "
	                           + board[5] + " | " + board[6]
	                           + " |");
	        System.out.println("|-----------|");
	        System.out.println("| " + board[7] + " | "
	                           + board[8] + " | " + board[9]
	                           + " |");
	        System.out.println("|---|---|---|");
	    }
	 public static void main(String[] args) {
	  board = new String[10];
	  turn ="Player";
	
	  for (int a = 0; a <=9; a++) {
          board[a] = String.valueOf(a );
      }
	  UC_3.printBoard();
}
}
 



