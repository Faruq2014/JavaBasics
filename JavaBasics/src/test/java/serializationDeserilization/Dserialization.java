package serializationDeserilization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Dserialization {

	public static void main(String[] args) throws IOException {
		Students farid = null;
		try {
			FileInputStream fis = new FileInputStream("Serialaziable.txt");
			ObjectInputStream oos = new ObjectInputStream(fis);

			farid = (Students) oos.readObject();
			oos.close();
			fis.close();

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} finally {
			System.out.println("deserializing ....");
			System.out.println(farid.name);
			System.out.println(farid.address);
			System.out.println(farid.fee);
		}

	}

}
