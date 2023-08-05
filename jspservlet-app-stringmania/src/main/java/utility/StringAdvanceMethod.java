package utility;

public class StringAdvanceMethod {
	//Enter the code here...
	private String input1;
	private String input2;
	public String getInput1() {
		return input1;
	}
	public void setInput1(String input1) {
		this.input1 = input1;
	}
	public String getInput2() {
		return input2;
	}
	public void setInput2(String input2) {
		this.input2 = input2;
	}
	public String concat(String one, String two){
		return one.concat(two);
	}
	public String split(String one, String two){
		int s = 0;
		int e = one.indexOf(two);
		String result = "";

		while(e != -1){
			String sub = one.substring(s,e);
			result = result + sub + " ";
			s = e + two.length();
			e = one.indexOf(two, s);
		}
		String last = one.substring(s);

		return result+last;
	}
	public String indexOf(String one, String two) {
		return Integer.toString(one.indexOf(two));
	}
	public String trim(String str){
		return str.trim();
	}
}
