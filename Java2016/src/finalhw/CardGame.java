package finalhw;

import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;

public class CardGame {

	private int score = 0;

	private ImageIcon[] imgs;
	private ImageIcon[] imgsBlank;

	public CardGame() {
		imgs = new ImageIcon[4];
		imgsBlank = new ImageIcon[4];
		for (int i = 0; i < imgs.length; i++) {
			imgs[i] = new ImageIcon("hw_pic\\" + (i + 1) + ".jpg");
			imgsBlank[i] = new ImageIcon("hw_pic\\" + (i + 1) + "-" + (i + 1) + ".jpg");
		}
	}

	public Integer[][] setPosition() {
		Integer[][] arrs = new Integer[2][4];
		for (int i = 0; i < 2; i++) {
			List<Integer> list = new ArrayList<>();
			while (list.size() < 4) {
				int j = (int) (Math.random() * 4 + 1);
				if (!list.contains(j))
					list.add(j);
				System.out.print(j + " ");
			}
			System.out.println("\n");
			for (Integer integer : list) {
				System.out.println(integer);
			}
			System.out.println("\n");
			list.toArray(arrs[i]);
			list.clear();
		}
		return arrs;
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

	public ImageIcon[] getImgIconBlank() {
		return imgsBlank;
	}

}
