

public class Song {
	public static Song[] songs = new Song[10];
	private static int counter;


	private String title;
	private Singer singer;
	private String url;

	public Song(String title, Singer singer, String url)
	{
		this.title = title;
		this.singer = singer;
		this.url = url;
		songs[counter] = this;

		counter++;

	}

	public String getTitle()
	{
		return title;
	}

	public Singer getSinger()
	{
		return singer;
	}

	public String getURL()
	{
		return url;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	public void setSinger(Singer singer)
	{
		this.singer = singer;
	}

	public void setURL(String url)
	{
		this.url = url;
	}

	public String toString()
	{
		String title = this.getTitle();
		String url = this.getURL();

		String toPrint = "Song [Title: " + title + "], [URL: " + url + "]";
		return toPrint;
	}
}
