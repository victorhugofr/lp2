public class Main{
	public static void main(String[] args){
		MailServer s1 = new MailServer();
		MailClient c1 = new MailClient(s1,"joao");
		MailClient c2 = new MailClient(s1,"artur");
		MailClient c3 = new MailClient(s1,"victor");
		
		c3.sendMailItem("joao","oi");
		MailItem message = c1.getNextMailItem();
		System.out.println(message.getMessage());
		
	}
}
