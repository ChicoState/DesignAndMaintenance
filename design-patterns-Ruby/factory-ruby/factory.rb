# Gym Membership class that has AnnualMembership & MonthlyMembership
class Members
    def AnnualMembership
        raise NotImplementedError, 'AnnualMembership() must be defined in subclass'
    end
    def MonthlyMembership
        raise NotImplementedError, 'MonthlyMembership() must be defined in subclass'
    end
end
# Membership class that inherits Members and implements AnnualMembership & MonthlyMembership
class Membership < Members
    def AnnualMembership
        puts "Inside Members:AnnualMembership()"
    end
    def MonthlyMembership
        puts "Inside Members:MonthlyMembership()"
    end
end
# CreateMembers class has the functions for MemberRegistration & MemberOperation
class CreateMembers
    def MemberRegistration
        raise NotImplementedError, 'MemberRegistration() must be defined in subclass'
    end
    def MemberOperation
        @members = MemberRegistration()
        return @members
    end
end
# ConcreteCreateMembers inherits from CreateMembers
class ConcreteCreateMembers < CreateMembers
    def MemberRegistration
        return ConcreteMembership.new
    end
end
# Create objects for each member creation
membersCreator = ConcreteCreateMembers.new
members = membersCreator.MemberOperation
# Calling the functions
members.AnnualMembership
members.MonthlyMembership