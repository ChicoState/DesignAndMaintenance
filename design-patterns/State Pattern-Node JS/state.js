class SDLCstages {
  constructor() {
    this.states = [new Dev(), new Staging(), new Prod()];
    this.current = this.states[0];
  }

  change() {
    const totalStates = this.states.length;
    let currentIndex = this.states.findIndex(light => light === this.current);
    if (currentIndex + 1 < totalStates) this.current = this.states[currentIndex + 1];
    else this.current = this.states[0];
  }

  sign() {
    return this.current.sign();
  }
}

class States {
  constructor(light) {
    this.light = light;
  }
}

class Prod extends States  {
  constructor() {
    super('Testing');
  }

  sign() {
    return 'Production Testing';
  }
}

class Staging extends States {
  constructor() {
    super('Commiting');
  }

  sign() {
    return 'Staging Commits';
  }
}

class Dev extends States {
	constructor() {
		super('Coding');
	}

	sign() {
		return 'Development Coding';
	}
}


const product = new SDLCstages();

console.log(product.sign()); // 'Development Coding'
product.change();

console.log(product.sign()); // 'Staging commits'
product.change();

console.log(product.sign()); // 'Production Testing'
product.change();

console.log(product.sign()); // 'Development Coding'
product.change();

console.log(product.sign()); // 'Staging commits'
product.change();

console.log(product.sign()); // 'Production Testing'

