class CumulativeAddition {
  constructor(intialsum = 0) {
    
    this.sum = intialsum;
  }

  add(number) {
    this.sum = this.sum + number;
    return this;
  }

}

const sum1 = new CumulativeAddition();
console.log(sum1.add(10).add(2).sum);

const sum2 = new CumulativeAddition(5);
console.log(sum2.add(10).add(20).sum);

const sum3 = new CumulativeAddition(1);
console.log(sum3.add(98).add(1).add(8).sum);

