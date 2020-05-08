require_relative 'extraction'
require_relative 'database_extractor'

class DataBaseBExtraction < Extraction
  def call_correct_extraction
    DataBaseExtractor.new.extract
  end
end