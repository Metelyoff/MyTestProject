package solutions;

import java.util.Date;

public class TestDate {

	public static void main(String[] args) {
		Date date = new Date("JANUARY 01 2015");
		System.out.println(date.getYear() + "-" + date.getMonth() + "-" + date.getDate());
		int days = 24 * 60 * 60 * 1000;
		Date current = new Date();
		System.out.println((current.getTime() - date.getTime()) / days);
	}
}
