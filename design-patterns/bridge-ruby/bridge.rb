class Message
    def Operation
        raise NotImplementedError, 'Operation() muse be defined in subclass'
    end
end

class TextMessage < Message
    def Operation
        puts "\n"
        puts "Inside TextMessage:Operation()"
    end
end

class MultimediaMessage < Message
    def Operation
        puts "\n"
        puts "Inside MultimediaMessage:Operation()"
    end
end

class MessageSender
    def Operation
        raise NotImplementedError, 'Operation() must be defined in subclass'
    end
end

class TextMessageSender < MessageSender
    def initialize
        @imp1 = TextMessage.new
    end

    def Operation
        puts "\n"
        puts "Inside TextMessageSender:Operation()"
        @imp1.Operation
    end
end

class MultimediaMessageSender < MessageSender
    def initialize
        @imp1 = MultimediaMessage.new
    end

    def Operation
        puts "\n"
        puts "Inside MultimediaMessageSender:Operation()"
        @imp1.Operation
    end
end

messageObj = TextMessageSender.new
messageObj.Operation

messageObj = MultimediaMessageSender.new
messageObj.Operation