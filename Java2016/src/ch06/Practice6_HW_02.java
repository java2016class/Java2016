package ch06;

public class Practice6_HW_02 {
	public static void main(String[] args) {
		String subjects[] = { "", "國", "英", "數", "總分", "平均", "備註" };
		String student_name[] = { "學生A", "學生B", "學生C" };
		int score[][] = { { 90, 60, 71 }, { 75, 83, 70 }, { 60, 65, 70 } };
		int maxSum = 0, sum[] = new int[3], j;

		for (String subject : subjects) {
//			System.out.printf("%7s ", subject);
		}
		System.out.println();
		for (int i = 0; i < student_name.length; i++) {
//			System.out.printf("%s ", student_name[i]);
			sum[i] = 0;
			for (j = 0; j < score[i].length; j++) {
//				System.out.printf("%3d ", score[i][j]);
				sum[i] += score[i][j];
			}
//			System.out.printf("%4d %3d", sum[i], sum[i] / (j + 1));
//			System.out.println();
//			System.out.println();
		}

		String rank[][] = new String[4][];
		for (int i = 0; i < rank.length; i++) {
			rank[i] = new String[7];
			if (i != 3 && maxSum < sum[i])
				maxSum = sum[i];
		}

		for (int i = 0; i < rank[0].length; i++) {
			rank[0][i] = subjects[i];
		}
		for (int k = 1; k < rank.length; k++) {
			rank[k][0] = student_name[k - 1];
			for (int z = 1; z < rank[k].length; z++) {
				switch (z) {
				case 1:
				case 2:
				case 3:
					rank[k][z] = score[k - 1][z - 1] + "";
					break;
				case 4:
					rank[k][z] = sum[k - 1] + "";
					break;
				case 5:
					rank[k][z] = sum[k - 1] / 3 + "";
					break;
				case 6:
					rank[k][z] = "";
					if (sum[k - 1] == maxSum)
//						 if (String.valueOf(sum[k -
//						 1]).equals(String.valueOf(maxSum)))
						rank[k][z] = "*";
					break;
				default:
				}
			}
		}

		for (int i = 0; i < rank.length; i++) {
			System.out.printf("%6s\t%s\t%s\t%s\t%s\t%s\t%s\n", rank[i][0], rank[i][1], rank[i][2], rank[i][3],
					rank[i][4], rank[i][5], rank[i][6]);
		}

	}
}
