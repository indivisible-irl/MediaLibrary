package media;

import java.io.File;


public class Film extends Media{

//// data
	
	private static final long serialVersionUID = 1L;
	
	private String[] filePathsRelative;
	

	/*	For ref from super (protected):
	 *		String name
	 * 		String imdb
	 * 		int rating
	 * 		Date lastViewed
	 * 		File root
	 * 		File info
	 */

//// constructors
	
	public Film(File folder)
	{
		super(folder);
	}
	
	
	
	
//// getters & setters

	public void setFilePathsRelative(String[] files)		{	filePathsRelative = files;		}
	
	public String[] getFilePathsRelative()					{	return filePathsRelative;		}
	
	
	
//// methods
	
	private File[] getFiles()
	{
		File[] files = new File[filePathsRelative.length];
		for (int i=0; i<files.length; i++)
		{
			files[i] = new File(root + File.separator + filePathsRelative[i]);
		}
		
		return files;
	}
	

}
