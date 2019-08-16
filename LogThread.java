package assignment5;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class LogThread extends Thread{
	volatile File f;
	String message;
	volatile BufferedWriter br;
	
	public LogThread(String message, String name) {
		super(name + " LOGGER");
		this.message = message;
		f = new File("log.txt");
	}
	
	@Override
	public void run() {
		try {
			br = new BufferedWriter(new FileWriter(f, true));
			if (!f.exists()) {
				f.createNewFile();
			}
			System.out.println(this.getName() + ": writing to log.txt.");
			br.write(message + "\n");
			br.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}
