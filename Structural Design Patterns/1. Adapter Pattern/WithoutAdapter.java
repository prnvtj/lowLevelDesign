
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

class CheckoutService{
    private PaymentGateway paymentGateway;

    public checkoutService(PaymentGateway paymentGateway){
        this.paymentGateway = paymentGateway;
    }

    public void checkout(String orderId, double amount){
        paymentGateway.apy(orderId, amount);
    }
}

class WithoutAdapter{
    public static void main(String[] args) {
        CheckoutService checkoutService = new CheckoutService(new PayUGateway());

        checkoutService.checkout("12", 1790);
    }
}