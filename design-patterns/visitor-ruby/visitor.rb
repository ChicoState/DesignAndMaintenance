class Router
  def Accept(v)
    raise NotImplementedError, 'Accept() must be defined in subclass'
  end
end

class ManageRouterA < Router
  def Accept(v)
     puts "ManageRouterA::Accept()"
     v.VisitManageRouterA(self)
  end
end

class ManageRouterB < Router
  def Accept(v)
     puts "ManageRouterB::Accept()"
     v.VisitManageRouterB(self)
  end
end

class Application
  def VisitManageRouterA(elem)
    raise NotImplementedError, 'ApplicationManageRouterA() must be defined in subclass'
  end

  def VisitManageRouterB(elem)
    raise NotImplementedError, 'ApplicationManageRouterB() must be defined in subclass'
  end
end

class ManageApplication1 < Application
  def VisitManageRouterA(elem)
    puts "ManageApplication1:VisitManageRouterA()"
  end

  def VisitManageRouterB(elem)
    puts "ManageApplication1:VisitManageRouterB()"
  end
end

class ManageApplication2 < Application
  def VisitManageRouterA(elem)
    puts "ManageApplication2:VisitManageRouterA()"
  end

  def VisitManageRouterB(elem)
    puts "ManageApplication2:VisitManageRouterB()"
  end
end

elements = Array.new

eleA = ManageRouterA.new
eleB = ManageRouterB.new

elements << eleA
elements << eleB

visitor1 = ManageApplication1.new
visitor2 = ManageApplication2.new

for elem in elements
  elem.Accept(visitor1)
  elem.Accept(visitor2)
end
