

import java.util.Scanner;

public class SongTest {

public static void main(String[] args) {

	Scanner input = new Scanner(System.in);


	Singer frankie = new Singer("Frank Sinatra");
	Singer edith   = new Singer ("Edith Piaf");
	Singer nina    = new Singer ("Nina Kraviz");
	Singer paul    = new Singer ("Paul Kalkbrenner");
	Singer maceo   = new Singer ("Maceo Plex");

	Song song1 = new Song("My Way", frankie, "https://www.youtube.com/watch?v=6E2hYDIFDIU");
	Song song2 = new Song("New York, New York", frankie, "https://www.youtube.com/watch?v=EUrUfJW1JGk");
	Song song3 = new Song("La Vie En Rose", edith, "https://www.youtube.com/watch?v=kFzViYkZAz4");
	Song song4 = new Song("Ghetto Kraviz", nina,"https://www.youtube.com/watch?v=605bwlAz_iQ");
	Song song5 = new Song("I'm Gonna Get You (Original Mix)", nina, "https://www.youtube.com/watch?v=Ys_XKiykA44");
	Song song6 = new Song("Sky and Sand (Original Mix", paul, "https://www.youtube.com/watch?v=XINlEYXA3k0");
	Song song7 = new Song("Ain't That Love (Original Mix)", maceo, "https://www.youtube.com/watch?v=l-_Y6DhATrk");


	boolean exit = false;


	while(!exit){


		print();


		String choice = input.next();


		if(choice.equals("1"))
		{

			displaySingers(Singer.singers);
		}
		else if(choice.equals("2"))
		{
			displayFrankiesSongs(Song.songs);
		}
		else if(choice.equals("exit"))
		{

			exit = true;
		}
		else
		{

			System.out.println("Wrong input! Supported inputs are 1,2 or exit.\n\n");
		}
	}
}


public static void print()
{
	System.out.println("********** Welcome to our Music Application **********");
	System.out.println("Menu:");
	System.out.println("Type 1 to display singers' list.");
	System.out.println("Type 2 to display Frank Sinatra's available songs.");
	System.out.print("Type \"exit\" to display Frank Sinatra's available songs.\n\tType here: ");
}


public static void displaySingers(Singer[] s)
{
	System.out.println("\n\n***** Display Singers' List *****");

	for(int i = 0; i < s.length && s[i] != null; i++)
	{

		System.out.println(s[i].toString());
	}

	System.out.println();
}


public static void displayFrankiesSongs(Song[] s)
{
	System.out.println("\n\n***** Display Frank Sinatra's Song List *****");


	for(int i = 0; i < s.length && s[i] != null; i++)
	{

		if(s[i].getSinger().getName() == "Frank Sinatra")
		{
			System.out.println(s[i].toString());
		}

	}

	System.out.println();
}

}
