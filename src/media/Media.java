package media;

import java.io.File;
import java.io.Serializable;
import java.util.Date;

public class Media implements Serializable {

//// data

	private static final long serialVersionUID = 1L;
	
	protected String name;
	protected String imdb;
	protected int rating;
	protected Date lastViewed;
	protected File root;
	protected File img;
	
//// constructors
	
	public Media(){
		name = null;
		imdb = null;
		rating = -1;
		lastViewed = null;
		root = null;
		img = null;
	}
	public Media(File f)
	{
		name = null;
		imdb = null;
		rating = -1;
		lastViewed = null;
		root = f;
		img = null;
	}
	public Media(String n, File f)
	{
		name = n;
		imdb = null;
		rating = -1;
		lastViewed = null;
		root = f;
		img = null;
	}
	
//// getters & setters
	
	public void setName(String n)		{	name = n;			}
	public void setImdb(String i)		{	imdb = i;			}
	public void setRating(int r)		{	rating = r;			}
	public void setLastViewed(Date d)	{	lastViewed = d;		}
	public void setRoot(File r)			{	root = r;			}
	public void setImg(File i)			{	img = i;			}
	
	public String getName()				{	return name;		}
	public String getImdb()				{	return imdb;		}
	public int getRating()				{	return rating;		}
	public Date getLastViewed()			{	return lastViewed;	}
	public File getRoot()				{	return root;		}
	public File getImg()				{	return img;			}
	
	
//// methods
	
	
	
}
