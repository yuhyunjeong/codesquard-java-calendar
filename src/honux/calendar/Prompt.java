package honux.calendar;

import java.util.Scanner;

public class Prompt {
	private static final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public int getMaxDaysOfMonth(int month) {
		return MAX_DAYS[month - 1];
	}
	public void printSampleCalendar() {
		System.out.println("일  월  화  수  목  금  토");
		System.out.println("--------------------");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21"); 
		System.out.println("22 23 24 25 26 27 28");
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String PROMPT = "> ";
		
		Prompt pr = new Prompt();
		
		while(true) {
			System.out.println("월을 입력하세요.");
			System.out.print(PROMPT);
			int month = sc.nextInt();
			
			if(month == -1) {
				break;
			}
			
			pr.printSampleCalendar();
			for(int i = 29; i < pr.getMaxDaysOfMonth(month)+1;i++) {
				System.out.print(i+" ");
			}
			System.out.println();
			
//			if(month == -1) {
//				break;
//			}
			
		}
		System.out.println("Bye~");
		sc.close();
		

	}

}
