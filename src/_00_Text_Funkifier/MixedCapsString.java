package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String output = "";
		for(int i = 0; i < s.length(); i++) {
			char temp;
			temp = s.charAt(i);
			if(i%2 == 0) {
				Character ch = Character.toLowerCase(temp);
				output += ch;
			}
			
			else { //(i%2 == 1)
				Character ch = Character.toUpperCase(temp);
				output += ch;
			}
		}
		return output;
	}

}
