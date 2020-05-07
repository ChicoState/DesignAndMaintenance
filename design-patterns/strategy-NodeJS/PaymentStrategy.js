
class PaymentStrategy {

  constructor() {
     

  }
  setPaymentStrategy(position) {
    this.position = position;
  }
  calculatePayment(data) {
        return this.position.calculatePayment(data);
    }
  
  
       
}
module.exports = PaymentStrategy;
