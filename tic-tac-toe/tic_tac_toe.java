package projects1;
import java.util.Scanner;

public class tik_tak_toe {






        static char[][] board=new char[3][30];
//
//        public static void main(String[] args) {
//
//            Scanner sc = new Scanner(System.in);
//            char player = 'X';
//
//            // Initialize board
//            for(int i=0;i<3;i++){
//                for(int j=0;j<3;j++){
//                    board[i][j] = ' ';
//                }
//            }


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char player ='X';

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                board[i][j]=' ';
            }
        }

            while(true){

                printBoard();

                System.out.println("Player " + player + " enter row and column:");
                int row = sc.nextInt();
                int col = sc.nextInt();

                if(board[row][col] == ' '){
                    board[row][col] = player;
                }else{
                    System.out.println("Cell already filled!");
                    continue;
                }

                if(checkWinner(player)){
                    printBoard();
                    System.out.println("Player " + player + " wins!");
                    break;
                }

                player = (player == 'X') ? 'O' : 'X';
            }

            sc.close();
        }

        static void printBoard(){

            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    System.out.print(board[i][j] + " | ");
                }
                System.out.println();
            }
        }

        static boolean checkWinner(char player){

            // rows
            for(int i=0;i<3;i++){
                if(board[i][0]==player && board[i][1]==player && board[i][2]==player)
                    return true;
            }

            // columns
            for(int i=0;i<3;i++){
                if(board[0][i]==player && board[1][i]==player && board[2][i]==player)
                    return true;
            }

            // diagonals
            if(board[0][0]==player && board[1][1]==player && board[2][2]==player)
                return true;

            if(board[0][2]==player && board[1][1]==player && board[2][0]==player)
                return true;

            return false;
        }
    }

