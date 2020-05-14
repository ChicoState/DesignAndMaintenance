class GameSupport
    def next(chain)
      @next_support_link = chain
    end
  
    def handle_issue(issue_type)
      raise NotImplementedError, 'Subclasses must override this method'
    end
  end