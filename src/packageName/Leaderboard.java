package packageName;

import java.util.ArrayList;

public class Leaderboard {

	private int capacity;
	private ArrayList<Score> scoreboard;
	
	public Leaderboard(int c) {
		capacity = c;
		scoreboard = new ArrayList<>(c);
	}
	
	public void addScore(String name, int score) {
		
		if (scoreboard.size() == 0) {
			scoreboard.add(new Score(name, score));
			return;
		}
		
		for (int i = 0; i < scoreboard.size(); i++) {
			if (scoreboard.get(i).getScore() < score && scoreboard.size() == capacity) {
				scoreboard.remove(capacity-1);
				scoreboard.add(i, new Score(name, score));
				return;
			} else if (scoreboard.get(i).getScore() < score) {
				scoreboard.add(i, new Score(name, score));
				return;
			}
		}
		
		scoreboard.add(new Score(name, score));
		
	}
	
	public int getHighScore() {
		return scoreboard.get(0).getScore();
	}
	
	public int getAverageScore() {
		int avg = 0;
		int count = 0;
		for (Score score : scoreboard) {
			avg += score.getScore();
			count++;
		}
		return avg / count;
	}
	
	public boolean break1000() {
		for (Score score : scoreboard) {
			if (score.getScore() > 1000) {
				return true;
			}
		}
		return false;
	}
	
	public void printLeaderboard() {
		for (Score score : scoreboard) {
			System.out.println(score);
		}
	}

}
