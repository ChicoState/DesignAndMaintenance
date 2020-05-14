class Transceiver
  def SendMessage(messgage, soldierObj)
    raise NotImplementedError, 'SendMessage() must be defined in subclass'
  end
end

class ConcreteMediator < Transceiver
  def SetSoldiers (consoldier1Obj, consoldier2Obj)
    @soldier1 = consoldier1Obj
    @soldier2 = consoldier2Obj
  end

  def SendMessage(message, soldierObj)
    if soldierObj == @soldier1
      @soldier2.ReceiveMessage(message)
    elsif soldierObj == @soldier2
      @soldier1.ReceiveMessage(message)
    end
  end
end

class Soldier
  def initialize(mediatorObj)
    @soldier = mediatorObj
  end

  def SendMessage(message)
    raise NotImplementedError, 'SendMessage() must be defiend in subclass'
  end

  def ReceiveMessage(message)
    raise NotImplementedError, 'SendMessage() must be defiend in subclass'
  end
end

class Concretesoldier1 < Soldier
  def initialize(mediatorObj)
    super(mediatorObj)
  end

  def SendMessage(message)
    @soldier.SendMessage(message, self)
  end

  def ReceiveMessage(message)
    puts "Concretesoldier1:ReceiveMessage()...Soldier1 COPY THAT!! = #(message)"
  end
end

class Concretesoldier2 < Soldier
  def initialize(mediatorObj)
    super(mediatorObj)
  end

  def SendMessage(message)
    @soldier.SendMessage(message, self)
  end

  def ReceiveMessage(message)
    puts "Concretesoldier2:ReceiveMessage()...Soldier2 COPY? = #(message)"
  end
end

m = ConcreteMediator.new

c1 = Concretesoldier1.new(m)
c2 = Concretesoldier2.new(m)

m.SetSoldiers(c1, c2)

c1.SendMessage("I am soldier1")
c2.SendMessage("I am soldier2")
