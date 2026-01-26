interface PaymentGateway{
    void processPayment(double amount);
}

class RazorpayGateway implements PaymentGateway{
    public void processPayment(double amount){
        System.out.println("Processng INR payment via Razorpay: " + amount);
    }
}

class PayUgateway implements PaymentGateway{
    public void ProcessPayment(double amount){
        System.out.println("Processng INR payment via PayU: " + amount);
    }
}

interface Invoice{
    void generateInvoice();
}

class GSTInvoice implements Invoice{
    public void generateInvoice(){
        System.out.println("Generating GST Invoice for India.");
    }
}

class CheckoutService{
    private String gatewayType;

    public CheckoutService(String gatewayType){
        this.gatewayType = gatewayType;
    }

    public void checkOut(doubel amount){
        PaymentGateway paymentGateway;

        if(gatewayType.equals("razorpay")){
            paymentGateway = new RazorpayGateway();
        }else{
            paymentGateway = new PayUgateway();
        }

        paymentGateway.processPayment(amount);

        // Always uses GSTInvoice, and not scalable
        Invoice invoice = new GSTInvoice();
        invoice.generateInvoice();
    }
}

class NoAbstract{
    public static void main() {

        CheckoutService razorpayService = new CheckoutService("razorpay");
        razorpayService.checkOut(1500.00);
    }
}