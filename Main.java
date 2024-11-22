package rockPaperScissorsGame;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Hand hand = new Hand();
		
		System.out.println("じゃんけんを始めます！(0: グー, 1: チョキ, 2: パー, 3: 終了)");
		
		while(true) {
			System.out.println("あなたの手を選んでください:");
			int userChoice = scanner.nextInt();
			
			if (userChoice == 3) {
				System.out.println("ゲームを終了します。お疲れ様でした。");
				break;
			}
			if (userChoice < 0 || userChoice > 2) {
				System.out.println("無効な入力です。0~2の数字を入力してください。");
				continue;
			}
			hand.choice(userChoice);
		}
		hand.displayResults();
		scanner.close();
	}

}
