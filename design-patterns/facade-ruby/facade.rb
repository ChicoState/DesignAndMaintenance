class Department1
    def Team1
        puts "Using Department 1: Team 1"
    end

    def Team2
        puts "Using Department 1: Team 2"
    end
end

class Department2
    def Team3
        puts "Using Department 2: Team 3"
    end

    def Team4
        puts "Using Department 2: Team 4"
    end
end

class Department3
    def Team5
        puts "Using Department 3: Team 5"
    end

    def Team6
        puts "Using Department 3: Team 6"
    end
end

class ITSupportSystem
    def initialize
        @deptTeam1 = Department1.new
        @deptTeam2 = Department2.new
        @deptTeam3 = Department3.new
    end
    
    def Tier1
        puts "\n"
        puts "Using IT Support System: Tier1()"
        @deptTeam1.Team1
        @deptTeam2.Team4
        @deptTeam3.Team5
    end

    def Tier2
        puts "\n"
        puts "Using IT Support System: Tier2()"
        @deptTeam1.Team2
        @deptTeam2.Team3
        @deptTeam3.Team6
    end
end

facdSys = ITSupportSystem.new
facdSys.Tier1
facdSys.Tier2