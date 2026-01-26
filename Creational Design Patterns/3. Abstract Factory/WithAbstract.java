interface PaymentGateway{
    void processPayment(double amount);
}

interface Invoice{
    void generateInvoice();
}

class RazorPayGateway implements PaymentGateway{
    public void ProcessPayment(double amount){
        System.out.println("Processing payment via Razorpay: "+ amount);
    }
}

class PayUGateway implements PaymentGateway{
    public void processPayment(double amount){
        System.out.println("Processing INR payment via PayU: " + amount);
    }
}

class GSTInvoice implements Invoice{
    public void generateInvoice(){
        System.out.println("Generating GST Invoice for India.");
    }
}

//================ Abstract Factory =======================
interface RegionFactory{
    PaymentGateway createPaymentGateway(String gatewayType);
    Invoice createInvoice();
}

class IndiaFactory implements RegionFactory{
    public PaymentGateway createPaymentGateway(String gatewayType){
        if(gateWayType.equalsIgnoreCase("razorpay")){
            return new RazorPayGateway();
        }else if(gatewayType.equalsIgnoreCase("payu")){
            return new PayUGateway();
        }
        throw new IllegalArgumentException("Unsupported gateway for India: " + gatewayType);
    }

    public Invoice createInvoice(){
        return new GSTInvoice();
    }
}

class CheckoutService{
    private PaymentGateway paymentGateway;
    private Invoice invoid;
    private String gatewayType;

    public CheckoutService(RegionFactory factory, String gatewayType){
        this.gatewayType = gatewayType;
        this.paymentGateway = factory.createPaymentGateway(gatewayType);
        this.invoice = factory.createInvoice();
    }
    public void completeOrder(double amount){
        paymenGateway.processPayment(amount);
        invoice.generateInvoice();
    }
}

class WithAbstract{
    static void main() {
        CheckoutService inciaCheckOut = new CheckoutService((new IndiaFactory(), "razorpay"));
        inciaCheckOut.completeOrder(1999.00);
        System.out.println("-------------");
    }
}

