package observer_dp.example_1;

import observer_dp.example_1.Observers.User1;
import observer_dp.example_1.Observers.User2;
import observer_dp.example_1.Observers.User3;
import observer_dp.example_1.Subjects.YTChannel1;
import observer_dp.example_1.Subjects.YTChannel2;

public class Main {

	public static void main(String[] args)
	{

		// TASK: Email notication to users when video is uploaded

		// Created Channel
		YTChannel1 yt1 = new YTChannel1();
		YTChannel2 yt2 = new YTChannel2();

		// Created Users
		User1 user1 = new User1("user1@gmail.com", "12345");
		User2 user2 = new User2("user2@gmail.com", "67890");
		User3 user3 = new User3("user3@gmail.com", "99999");

		// User1, User2 subscribing for YTChannel1
		yt1.addObserver(user1);
		yt1.addObserver(user2);

		// User1, User2, User3 subscribing for YTChannel1 & YTChannel2
		yt2.addObserver(user1);
		yt2.addObserver(user2);
		yt2.addObserver(user3);

		// Video uploaded by YTChannel1
		yt1.newVideoAdded("Video ABC added!");

		// Newline
		System.out.println();

		// Video uploaded by YTChannel2
		yt2.newVideoAdded("Video XYZ added!");

	}
}
