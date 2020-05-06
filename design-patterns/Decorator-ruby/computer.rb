class Computer
    def parts
      raise NotImplementedError, 'Subclasses must override this method'
    end
  
    def cost
      raise NotImplementedError, 'Subclasses must override this method'
    end
  end