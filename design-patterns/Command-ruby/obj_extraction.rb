require_relative 'extraction'
require_relative 'obj_extractor'

class OBJExtraction < Extraction
  def call_correct_extraction
    OBJExtractor.new.extract
  end
end