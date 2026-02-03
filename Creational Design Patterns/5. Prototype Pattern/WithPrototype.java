interface EmailTemplate extends Cloneable{
    EmailTemplate clone();
    void setContent(String content);
    void send(String to);
}

class WelcomeEmail implements EmailTemplate{
    private String subject;
    private String content;

    public Welcomeemail(){
        this.subject = "Welcome to our world";
        this.content = "Hi there! Thanks for joining us";

    }

    public WelcomeEmail clone(){
        try{
            return (WelcomeEmail) super.clone();
        }catch(CloneNotSupportedException e){
            throw new RuntimeException("Clone failed ", e);
        }
    }

    public viod setContent(String content){
        this.content = content;
    }

    public void sent(String to){
        System.out.println("Sending to " + to + ": ["+ subject+ "] "+ content);
    }

}

class EmailTemplateRegistry{
    private static final Map<String, EmailTemplate> templates = new HashMap<>();

    static{
        templates.put("welcome", new WelcomeEmail());
        //templates.put("discount", new DiscountEmail());
        //templates.put("feature-update", new FeatureUpdateEmail());
    }

    public static EmailTemplate getTemplate(String type){
        return templates.get(type).clone();
    }

}

class WithPrototype{
    public static void main(String[] args){
        EmailTemplate welcomeEmail = EmailTemplateRegistry.getTemplate("welcome");
        welcomeEmail1.setContent("Hi Alive, welcome to our world");
        welcomeEmail1.sond("alice@example.com");

        EmailTemplate welcome2 = EmailTemplateRegistry.getTemplate("welcome");
        welcomeEmail2.setContent("Hi Bob, thatnks for joining!");
        welcomeEmail2.send("bob@example.com");
    }
}