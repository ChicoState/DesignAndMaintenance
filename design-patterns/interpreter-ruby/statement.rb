class Statement
    def interpret
      raise NotImplementedError, 'Subclasses must override this method'
    end
  end