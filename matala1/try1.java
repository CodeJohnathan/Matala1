package matala1;

import java.io.*;

public class try1 {

	public static void main(String[] args) throws IOException {
		/*File f=new File("c:\\whigle_wifi\\result.csv");
		String[][] s=readResult.read(f);
		
		String text = "";
		FileInputStream fi = new FileInputStream("C:\\whigle_wifi\\WigleWifi_20171029182606.csv");
		int ch, rows = -2;
		while (rows < 0 && (ch = fi.read()) != -1) {
			if (ch == 10) {
				rows++;
			}
		}
		while ((ch = fi.read()) != -1) {
			if (ch == 10) {
				rows++;
				text += "%";
			} else
				text += (char) ch + "";
		}
		fi.close();
		text += "%";
		String[][] csv = new String[rows][11];
		int lastcell = 0, nextrow = 0;
		System.out.println(text);
		for (int i = 0; i < rows; i++) {
			int nextcell = 0;
			nextrow = text.indexOf("%", nextrow + 1);
			int j = 0;
			while (nextcell < nextrow && nextcell != -1) {
				nextcell = text.indexOf(",", lastcell + 1);
				if (nextcell != -1) {
					if (nextcell < nextrow)
						csv[i][j] = text.substring(lastcell + 1, nextcell);
					else
						csv[i][j] = text.substring(lastcell + 1, nextrow);
				}
				lastcell = nextcell;
				j++;
			}
			lastcell = nextrow;
		}
		for (int k = 0; k < rows; k++) {
			for (int l = 0; l < 11; l++)
				System.out.print(csv[k][l] + " " + l + ",");
			System.out.println();
		}
		System.out.println();
**/
	}
}
/*
 * List<String> deck = new ArrayList<String>(); for (int i = 0; i < suit.length;
 * i++) for (int j = 0; j < rank.length; j++) deck.add(rank[j] + " of " +
 * suit[i]);
 **/