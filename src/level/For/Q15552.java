package level.For;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q15552 {

	public static void main(String[] args) throws IOException {

//		token();
//		split1();
		split2();
	}

	public static void token() throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // ¼±¾ð
		int test = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < test; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) + "\n");
		}

		br.close();

	}

	public static void split1() throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int test = Integer.parseInt(br.readLine());

		for (int i = 0; i < test; i++) {
			String num[] = br.readLine().split(" ");

			int a = Integer.parseInt(num[0]);
			int b = Integer.parseInt(num[1]);

			bw.write(a + b + "\n");
		}
		bw.flush();
		bw.close();
	}

	private static void split2() throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		String num[] = new String[test];
		
		for (int i = 0; i < test; i++) {
			num[] = br.readLine().split(" ");
		}
		
		
		}

	}

//	BufferedReader br = new BufferedReader(new InputStreamReader(System.in);
//	String input = "";
//	while((input = br.readLine()) != null) {
//	    String[] num = input.split(" ");
//	    int result  = Integer.parseInt(num[0]) + Integer.parseInt(num[1]);
//	}