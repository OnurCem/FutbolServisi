package FutbolServisi_pkg;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FileLogger {
	private static String FILE_PATH = System.getProperty( "user.home" ) + File.separator + "Desktop" + File.separator;
	private static String SEPERATOR = "\n\n------------------------------------------\n";
	public static String INFO = "\nINFO:\n";
	public static String ERROR = "\nERROR:\n";
	
	public static boolean write(String level, String log) {
		try {
			log = (level + log).replaceAll("\n", System.lineSeparator());
			File file = new File(FILE_PATH + "log.txt");
 
			if (!file.exists()) {
				file.createNewFile();
				addHeader(file);
			}
 
			FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(log);
			bw.close();
			return true;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public static boolean writeDateTime() {
		try {
			DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
			Calendar cal = Calendar.getInstance();
			String dateTime = dateFormat.format(cal.getTime()) + "\n";
			dateTime = (SEPERATOR + dateTime).replaceAll("\n", System.lineSeparator());

			File file = new File(FILE_PATH + "log.txt");
 
			if (!file.exists()) {
				file.createNewFile();
				addHeader(file);
			}
 
			FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(dateTime);
			bw.close();
			return true;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	private static void addHeader(File file) {
		try {
			String header = "Futbol Servisi Log Dosyasi";
			FileWriter fw;
			fw = new FileWriter(file.getAbsoluteFile(), true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(header);
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
