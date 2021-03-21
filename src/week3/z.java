package week3;

import java.util.Scanner;

public class z {

	public static double score[];

	public static void main(String[] args) {
		int choose = menu();
		double average;
		double highest;
		double lowest;
		while(choose!=5){
			switch(choose){
			case 1:
				enterstudentresults();
			    break;
			case 2:
				if(score == null)
				{
					System.out.println("未定义数组");
					break;
				}
				else{
				average =  getaverage();
				System.out.println(average);
				break;
				}
			case 3:
				if(score == null)
				{
					System.out.println("未定义数组");
					break;
				}
				else{
				highest = gethighest();
				System.out.println(highest);
				break;
				}
			case 4:
				if(score == null){
					System.out.println("未定义数组");
					break;
				}
				else{
				lowest = getlowest();
				System.out.println(lowest);
				break;
				}
			default:System.out.println("invalid choose");
			}
			choose = menu();
			
			
		}
		System.out.println("bye");

	}

	public static int menu() {
		int choose = 0;
		System.out.println("1.Enter Student Results");
		System.out.println("2.Class Average");
		System.out.println("3.Highest Grade");
		System.out.println("4.Lowest Grade");
		System.out.println("5.Exit");
		System.out.println("请输入（1-5）");
		Scanner scan = new Scanner(System.in);
		choose = scan.nextInt();
		return choose;
	}

	public static void enterstudentresults() {
		score = new double[5];
		boolean b=true;
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入5个数");
		for (int i = 0; i < score.length; i++) {
			score[i] = scan.nextDouble();
			while(b){
			if(score[i]<0||score[i]>100){
				System.out.println("输入错误");
				b = false;
				i--;
			}
			}
		}
	}

	public static double getaverage() {
		double average = 0;
		double sum = 0;
		for (int i = 0; i < score.length; i++) {
			sum = sum + score[i];
		}
		average = sum / (score.length);
		return average;
	}

	public static double gethighest() {
		double highest;
		highest = score[0];
		for (int i = 0; i < score.length; i++) {
			if (score[i] > highest) {
				highest = score[i];
			}
		}
		return highest;
	}

	public static double getlowest() {
		double lowest;
		lowest = score[0];
		for (int i = 0; i < score.length; i++) {
			if (score[i] < lowest) {
				lowest = score[i];
			}
		}
		return lowest;
	}
}
