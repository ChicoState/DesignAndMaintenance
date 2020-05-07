
class PaymentStrategy {

  constructor(name, pay) {
     

  }
  setPaymentStrategy(position) {
    this.position = position;
  }
  calculatePayment(data) {
        return this.position.calculatePayment(data);
    }
  
  
       
}
module.exports = Payment;
