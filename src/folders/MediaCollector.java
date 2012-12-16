package folders;

import java.io.File;
import java.util.Arrays;
import java.util.List;


public class MediaCollector {

	//TODO Move folder path to settings file (File[] for multiple folders)
	private static final String folder = "C:\\Users\\DavidA\\Videos\\Film";
	private static final List<String> exts = Arrays.asList(
			"3gp", "avi", "dat", "flv", "mkv", "mov", "mp4", "mpeg", "rm",  "wmv"
			);
	
	
	
	public static void main(String[] args) {
		
		File root = new File(folder);
		System.out.println("Root: " +root.exists());
		System.out.println("Folder: " +root.isDirectory());
		
		System.out.println("----");
		recurFolder(root);

	}
	
	
	
	public static void recurFolder(File f)
	{
		if (f.isFile())
		{
			System.out.println("f\t" +f.getAbsolutePath());
			String ext = f.getName().substring(f.getName().lastIndexOf(".")+1);
			if (exts.contains(ext))
			{
				System.out.println("\tM\t"+ext);
			}
			
		}
		else if (f.isDirectory())
		{
			System.out.println("d\t" +f.getAbsolutePath());
			File[] contents = f.listFiles();
			for (File file : contents)
			{
				recurFolder(file);
			}
			
		}
		else
		{
			System.out.println("!!! Error !!!");
		}
	}
	
	

}
