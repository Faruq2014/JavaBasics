package codingChallenge;

import accessModifier.PrivateModifier;

public class Test2App extends PrivateModifier{

	public static void main(String[] args) {
		PrivateModifier pm= new PrivateModifier();
		pm.m2("khaled");
	}

	public void nowsin() {
		PrivateModifier pm= new PrivateModifier();
		pm.m2("khaled");
		pm.m1(66666);
	}
}
