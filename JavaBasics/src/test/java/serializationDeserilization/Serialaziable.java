package serializationDeserilization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialaziable {

	public static void main(String[] args) throws IOException {

		Students khaled = new Students();
		khaled.name = "Khaled";
		khaled.address = "Arlington";
		khaled.fee = 100;

		Students farid = new Students();
		farid.name = "Farid";
		farid.address = "Alexandria";
		farid.fee = 200;

		try {
			FileOutputStream fios = new FileOutputStream("Serialaziable.txt");
			ObjectOutputStream out = new ObjectOutputStream(fios);
			out.writeObject(farid);
			out.close();
			fios.close();
			System.out.println("student data is save.");

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
	}
}