package observer_dp.example_1;

import observer_dp.example_1.Observers.EmailAlert;
import observer_dp.example_1.Observers.MessageAlert;
import observer_dp.example_1.Subjects.YTChannel1;
import observer_dp.example_1.Subjects.YTChannel2;

public class Main {

	public static void main(String[] args)
	{

		// TASK: Email notication to users when video is uploaded

		// Created Channel
		YTChannel1 yt1 = new YTChannel1();
		YTChannel2 yt2 = new YTChannel2();
		
		EmailAlert userWithEmailAlert_1 =  new EmailAlert("user1@gmail.com");
		MessageAlert userWithMessageAlert_1 = new MessageAlert("12345");
		MessageAlert userWithMessageAlert_2 = new MessageAlert("67890");
		

		// User1 with email, User2 with contact subscribing for YTChannel1
		yt1.addObserver( userWithEmailAlert_1);
		yt1.addObserver( userWithMessageAlert_1 );

		// User1, User2, User3 subscribing for YTChannel1 & YTChannel2
		yt2.addObserver( userWithEmailAlert_1);
		yt2.addObserver( userWithMessageAlert_1 );
		yt2.addObserver( userWithMessageAlert_2 );

		// Video uploaded by YTChannel1
		yt1.newVideoAdded("Video ABC added!");

		// Newline
		System.out.println();

		// Video uploaded by YTChannel2
		yt2.newVideoAdded("Video XYZ added!");

	}
}
