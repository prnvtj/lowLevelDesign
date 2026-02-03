
interface PaymentGateway{
    void pay(String orderId, double amount);
}

class PayUGateway implements PaymentGateway{
    public void pay(String orderId, double amount){
        System.out.println("Paid Rs. " + amount + " using PayU for order: "+ orderId);
    }
}

class RazorpayAPI{
    public void makePayment(String invoiceId, double amountInRupees){
        System.out.println("Paid Rs. "+ anountInRupees + " using Razorpay for invoice: "+ invoiceId);
    }
}

//A new adapter for Razorpay API
class RazorpayAdapter implements PaymentGateway{
    private RazorpayAPI razorpayAPI;

    public RazorpayAdapter(){
        this.razorpayAPI = new RazorpayAPI();
    }

    public void pay(String invoiceId, double amount){
        razorpayAPI.makePayment(invoiceId, amount);
    }
}

class CheckoutService{
    private PaymentGateway paymentGateway;

    public checkoutService(PaymentGateway paymentGateway){
        this.paymentGateway = paymentGateway;
    }

    public void checkout(String orderId, double amount){
        paymentGateway.apy(orderId, amount);
    }
}

class WithAdapter{
    public static void main(String[] args) {
        CheckoutService checkoutService = new CheckoutService(new PayUGateway());

        checkoutService.checkout("12", 1790);
    }
}