package inheritance;

public class WhatsApp3 extends WhatsApp2
{
	public void SendMoney()
	{
		System.out.println("You can send money To bank account");
	}
	public static void main(String[] args) {
		
		WhatsApp3 a=new WhatsApp3();
		a.Textmsg();
		a.AudioCall();a.VideoCall();
		a.SendMoney();
		
		
	}

}
