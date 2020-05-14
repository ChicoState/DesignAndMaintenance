class TravelAgency
  def Packages
    puts "TravelAgency : Packages()"
    self.DestinationOne
    self.DestinationTwo
  end
  def DestinationOne
    raise NotImplementedError, 'DestinationOne() must be defined in subclass'
  end
  def DestinationTwo
    raise NotImplementedError, 'DestinationOne() must be defined in subclass'
  end
end
class TripA < TravelAgency
  def DestinationOne
    puts 'Inside TripA:DestinationOne'
  end
  def DestinationTwo
    puts 'Inside TripA:DestinationTwo'
  end
end
class TripB < TravelAgency
  def DestinationOne
    puts 'Inside TripB:DestinationOne'
  end
  def DestinationTwo
    puts 'Inside TripB:DestinationTwo'
  end
end
obj = TripA.new
obj.Packages()
obj = TripB.new
obj.Packages()
