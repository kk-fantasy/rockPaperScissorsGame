package rockPaperScissorsGame;
import java.util.Random;

public class Hand {
	
	Random random = new Random();
	int computerChoice = random.nextInt(3);
	
	int userWins = 0, computerWins = 0, ties = 0;
	
	public void choice(int userChoice) {
		String[] choices = {"グー", "チョキ", "パー"};
		System.out.println("あなた:" + choices[userChoice] + "コンピューター" + choices[computerChoice]);
		if(computerChoice == userChoice) {
			System.out.println("あいこです");
			ties++;
		}else if((computerChoice == 0 && userChoice == 1)||
		(computerChoice == 1 && userChoice == 2)||
		(computerChoice == 2 && userChoice == 0)){
		System.out.println("コンピューターの勝ち");
		computerWins++;
		}else {
			System.out.println("ユーザーの勝ち");
			userWins++;
			
		}
	}
	public void displayResults() {
		System.out.println("最終結果:");
		System.out.println("あなたの勝ち:" + userWins);
		System.out.println("コンピューターの勝ち" + computerWins);
		System.out.println("引き分け" + ties);
	}
}
