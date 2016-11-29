package finalhw;

import javax.swing.ImageIcon;

public class SlotTigerGame {

	private ImageIcon[] imgs;
	private int score;

	public SlotTigerGame() {
		imgs = new ImageIcon[4];
		for (int i = 0; i < imgs.length; i++) {
			imgs[i] = new ImageIcon("hw_pic\\" + (i + 1) + ".jpg");
		}
	}

	public int getRandom() {
		return (int) (Math.random() * 4);
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score += score;
	}

	public ImageIcon[] getImgIcon() {
		return imgs;
	}
}
