package _00_Text_Funkifier;

public class CustomString extends SpecialString{

	public CustomString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String output = "";
		for(int i = 0; i < s.length(); i++) {
			char temp;
			temp = s.charAt(i);
			Character ch = Character.toUpperCase(temp);
			output += ch;
		}
		return output;
	}

}
