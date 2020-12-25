package serializationDeserilization;

import java.io.Serializable;

public class Students implements Serializable {

	public String name;
	public String address;
	public int fee;
	public String info = name + address + fee;
}
