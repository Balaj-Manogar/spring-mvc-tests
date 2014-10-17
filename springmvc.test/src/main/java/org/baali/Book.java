package org.baali;

public class Book
{
	private int id;
	private String title;
	private String language;
	private String author;
	
	
	public Book(int id, String title, String language, String author)
	{
		this.id = id;
		this.title = title;
		this.language = language;
		this.author = author;
	}
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getTitle()
	{
		return title;
	}
	public void setTitle(String title)
	{
		this.title = title;
	}
	public String getLanguage()
	{
		return language;
	}
	public void setLanguage(String language)
	{
		this.language = language;
	}
	public String getAuthor()
	{
		return author;
	}
	public void setAuthor(String author)
	{
		author = author;
	}
	
	
	
}
