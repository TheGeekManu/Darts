package com.example.demo;

public class DartGame {
	
	public int score(int x,int y) {
		int score = 0;
		
		//out of target range
		if(x>10 || y>10){
		score = 0;
		System.out.println("Score = " + score);
		}
		
		//inner circle
		else if(x<=1 && y<=1){
		score = 10;
		System.out.println("Score = " + score);
		}
		
		//middle circle
		else if((x>1 && x<=5) && (y>1 && y<=5)){
		score = 5;
		System.out.println("Score = " + score);
		}
		
		//small x, big y
		else if((x>=0 && x<=5) && (y>5 && y<=10)){
			score = 1;
			System.out.println("Score = " + score);
			}
		
		//small x, big y
		else if((x>=0 && x<=5) && (y>5 && y<=10)){
			score = 1;
			System.out.println("Score = " + score);
			}
		
		//big x, small y
		else if((x>5 && x<=10) && (y>=0 && y<=5)){
			score = 1;
			System.out.println("Score = " + score);
			}
		//small y, big x
		else if((x>5 && x<=10) && (y>=0 && y<=5)){
			score = 1;
			System.out.println("Score = " + score);
			}
		
		//big y, small x
		else if((x>=0 && x<=5) && (y>5 && y<=10)){
			score = 1;
			System.out.println("Score = " + score);
			}
		
		//outer circle
		else if((x>5) && (y>5)){
		score = 1;
		System.out.println("Score = " + score);
		}
		
		else {
		System.out.println("Enter a value between 1-10");
		}
		
		return score;
		
	}
	
	public static void main(String[] args) {
		DartGame dg = new DartGame();
		dg.score(1,10);

	}

}
