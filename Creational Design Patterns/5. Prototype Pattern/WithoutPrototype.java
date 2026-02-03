interface EmailTemplate{
    void setContent(String content);
    void send(String to);

}
class WelcomeEmail implements EmailTemplate{
    private String subject;
    private String content;

    public WelcomeEmail(){
        this.subject = "Welcome to our world";
        this.content = "Hi There! Thanks for joining us";
    }

    public void sent(String to){
        System.out.println("Sending to " + to+ ": ["+ subject + "} "+ content);
    }
}

class WithoutPrototype{

    WelcomeEmail email = new WelcomeEmail();
    email.send("user1@example.com");

    WelcomEmail email2 - ne wwelcomeemail();
    email2.send.setContent("Jo there! Welcome to out World");

    WelcomeEmail email3 = new WelcomeEmail();
    email3.setContent("Thanks for signing up. Let's get started!");
    email3.send("user@example.com");
}