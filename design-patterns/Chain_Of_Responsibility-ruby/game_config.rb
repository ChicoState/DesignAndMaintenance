require_relative 'game_support'

class GameConfig < GameSupport
  def handle_issue(issue_type)
    if issue_type == :config
      puts 'Game Configuration failed'
    else
      @next_support_link.handle_issue(issue_type)
    end
  end
end