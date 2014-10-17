package org.baali;

import java.util.ArrayList;
import java.util.List;

public class BookStore
{

	private static ArrayList<Book> bookList = new ArrayList<Book>();

	static
	{
		Book spring = new Book(1, "Spring Basics", "java", "Balaji");
		Book java = new Book(2, "Java Basics", "java", "Ramesh");
		Book dotnet = new Book(3, "Dot Net Basics", "dotnet", "Ramesh");
		Book html = new Book(4, "HTML5 Advanced", "HTML", "Balaji");
		Book css = new Book(5, "Responsive CSS", "css", "rajan");
		bookList.add(spring);
		bookList.add(java);
		bookList.add(dotnet);
		bookList.add(html);
		bookList.add(css);
	}

	private BookStore()
	{
	}

	public List<Book> findBooksByTitle(String title)
	{
		ArrayList<Book> books = new ArrayList<Book>();
		for (Book b : BookStore.bookList)
		{
			if (b.getTitle().contains(title))
			{
				books.add(b);
			}
		}
		if (books.size() > 0)
		{
			return books;
		} else
		{
			return null;
		}
	}

	public Book findBookById(int id)
	{

		for (Book b : BookStore.bookList)
		{
			if (b.getId() == id)
			{
				Book matchedBook = b;
				return matchedBook;
			}
		}
		return null;
	}
}
