package company

class SalesManager(firstName : String, lastName : String, age : Int) : Employee
    (firstName, lastName, age) {

    private val teamMembers = mutableMapOf< Int ,SalesRep>()

    fun calculateCommission(){
        var totalSoldByTheTeam = 0.0
        var totalCommission = 0.0
        teamMembers.forEach {
            totalSoldByTheTeam += it.value.getSalesMade()
        }

        totalCommission = 0.03 * totalSoldByTheTeam
        println("Total Commission: $totalCommission")

    }

}