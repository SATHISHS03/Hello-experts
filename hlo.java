class Officer{
	public void approve (){
		System.out.println("licence approved");
	}
}
class people extends Officer{
	public void reject (){
		System.out.println("licence rejected");
	}
}
class hlo{
	public static void main (String[] args){
		people mysis = new people();
		mysis.approve();
		mysis.reject();
	}
}