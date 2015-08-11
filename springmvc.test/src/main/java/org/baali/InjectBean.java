package org.baali;

public class InjectBean
{
	private String message;
	
	public String getMessage()
	{
		return message;
	}

	public InjectBean(String msg)
	{
		this.message = msg;
	}
}
