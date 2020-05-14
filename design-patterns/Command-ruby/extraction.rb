class Extraction
    def initialize(file)
      @file = file
    end
  
    def call_correct_extraction
      raise NotImplementedError, 'Sub class overides the method'
    end
  end