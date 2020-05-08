require_relative 'extraction'
require_relative 'game_extractor'

class GameExtraction < Extraction
  def call_correct_extraction
    GameExtractor.new.extract
  end
end