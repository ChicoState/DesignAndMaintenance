require_relative 'game_support'

class GameGen < GameSupport
  def handle_issue(issue_type)
    if issue_type == :gen
      puts 'General support will help you'
    else
      @next_support_link.handle_issue(issue_type)
    end
  end
end