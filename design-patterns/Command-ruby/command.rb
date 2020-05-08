require_relative 'database_extraction'
require_relative 'game_extraction'
require_relative 'obj_extraction'

class ExtractingTool

  def extraction(extraction)
    @extraction = extraction
  end

  def start_extraction
    @extraction.call_correct_extraction
  end
end

extracting_tool = ExtractingTool.new
extracting_tool.extraction(GameExtraction.new('a.game'))
extracting_tool.start_extraction

extracting_tool.extraction(OBJExtraction.new('b.obj'))
extracting_tool.start_extraction

extracting_tool.extraction(DataBaseBExtraction.new('c.db'))
extracting_tool.start_extraction