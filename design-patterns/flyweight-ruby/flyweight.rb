class Bank
    def Operation(uniqueState)
        raise NotImplementedError, 'Operation must be defined in subclass'
    end
end

class BankingOperation < Bank
    def initialize(key)
        if(key == "Savings_Account")
            @commonState = 101
        elsif key == "Checking_Account"
            @commonState = 102
        elsif key == "Investment_Retirement_Accounts"
            @commonState = 103
        end
    end

    def Operation(uniqueState)
        puts "\n"
        puts "Inside BankingOperation:Operation()"
        puts "Intrinsic State = #{@commonState}, Extrinsic State = #{uniqueState}"
    end
end

class PrivateBankingOperation < Bank
    def initialize(value)
        @allState = value
    end
    def Operation(uniqueState)
        puts "\n"
        puts "Inside PrivateBankingOperation:Operation()"
        puts "All State = #{@allState}, Extrinsic State = #{uniqueState}"
    end
end

class Banking_Set
    def initialize
        @bankPool = Hash.new
    end

    def GetBankInfo(key)
        if @bankPool.has_key?(key)
            puts "Bank from existing pool"
            return @bankPool[key]
        else
            obj = BankingOperation.new(key)
            @bankPool[key] = obj
            puts "New Bank in pool"
            return obj
        end
    end
end

Customer_1 = 1
Customer_2 = 2
Customer_3 = 3
Customer_4 = 4
Customer_5 = 100
Customer_new = 50

bankingObj = Banking_Set.new

banking = bankingObj.GetBankInfo("Savings_Account")
banking.Operation(Customer_1)

banking = bankingObj.GetBankInfo("Checking_Account")
banking.Operation(Customer_2)

banking = bankingObj.GetBankInfo("Investment_Retirement_Accounts")
banking.Operation(Customer_3)

banking = bankingObj.GetBankInfo("Savings_Account")
banking.Operation(Customer_4)

banking2 = PrivateBankingOperation.new(Customer_new)
banking2.Operation(Customer_5)