require_relative 'game_support'

class GameProd < GameSupport
  def handle_issue(issue_type)
    if issue_type == :prod
      puts 'Banned for 10 years!! Stop using Gaame_Cheats'
    else
      @next_support_link.handle_issue(issue_type)
    end
  end
end