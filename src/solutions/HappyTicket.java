package solutions;

import myExceptions.*;

public class HappyTicket {

	boolean answer = false;

	public boolean answer(int ticket) throws TicketException {

		if (ticket >= 100000 && ticket <= 999999) {
			int numb1 = ticket / 100000;
			int numb2 = (ticket / 10000) - numb1 * 10;
			int numb3 = (ticket / 1000) - (ticket / 10000) * 10;
			int numb4 = (ticket / 100) - (ticket / 1000) * 10;
			int numb5 = (ticket / 10) - (ticket / 100) * 10;
			int numb6 = (ticket / 1) - (ticket / 10) * 10;
			int part1 = numb1 + numb2 + numb3;
			int part2 = numb4 + numb5 + numb6;
			if (part1 == part2) {
				answer = true;
			}
			System.out.println(answer);
		} else
			throw new TicketException(ticket);
		return answer;
	}

	public static void main(String[] args) {
		HappyTicket a = new HappyTicket();
		try {
			int ticket = 9999999;
			a.answer(ticket);
		} catch (TicketException e) {
			System.out.println("Please enter number from 100000 to 999999 " + "\n" + e);
		}
	}
}
