
import org.junit.Assert.assertEquals
import org.junit.Test

class ComissionTest {
    @Test
    fun testVKpay(){
        val type = VKpay
        val monthTrasaction=15000
        val allMounthTrassaction=30000

        val result= commission(
            typeCard = type,
            monthTrasaction = monthTrasaction,
            allMounthTrassaction = allMounthTrassaction
        )
        assertEquals("комиссия 0 коп, вк пай", result)
    }
    @Test
    fun testVKpayDay(){
        val type=VKpay
        val monthTrasaction=15_000_000
        val allMonthTrassation=30_000_00

        val result= commission(
            typeCard = type,
            monthTrasaction = monthTrasaction,
            allMounthTrassaction = allMonthTrassation
        )
        assertEquals("лимит за день исчерпан, вк пай",result)
    }
    @Test
    fun testVKpayMonth(){
        val type=VKpay
        val monthTrasaction=15_000
        val allMonthTrassation=50_000_000

        val result= commission(
            typeCard = type,
            monthTrasaction = monthTrasaction,
            allMounthTrassaction = allMonthTrassation
        )
        assertEquals("лимит за месяц исчерпан, вк пай",result)
    }
    @Test
    fun testVISAorMIR(){
        val type = VISAorMIR
        val monthTrasaction=15_000
        val allMounthTrassaction=30_000

        val result= commission(
            typeCard = type,
            monthTrasaction = monthTrasaction,
            allMounthTrassaction = allMounthTrassaction
        )
        assertEquals("коммиссия 3500коп, виза или мир", result)
    }
    @Test
    fun testVISAorMIRday(){
        val type = VISAorMIR
        val monthTrasaction=15_000_000
        val allMounthTrassaction=3_000_000

        val result= commission(
            typeCard = type,
            monthTrasaction = monthTrasaction,
            allMounthTrassaction = allMounthTrassaction
        )
        assertEquals("лимит за день исчерпан, виза или мир", result)
    }
    @Test
    fun testVISAorMIRmounth(){
        val type = VISAorMIR
        val monthTrasaction=15_000_000
        val allMounthTrassaction=3_000_000_00

        val result= commission(
            typeCard = type,
            monthTrasaction = monthTrasaction,
            allMounthTrassaction = allMounthTrassaction
        )
        assertEquals("лимит за месяц исчерпан, виза или мир", result)
    }
    @Test
    fun MastercardORmaestro(){
        val type = MASTERCARDorMAESTRO
        val monthTrasaction=15_000
        val allMounthTrassaction=30_000

        val result= commission(
            typeCard = type,
            monthTrasaction = monthTrasaction,
            allMounthTrassaction = allMounthTrassaction
        )
        assertEquals("коммисия 2090 копеек, мастер кард или маестро", result)
    }
    @Test
    fun MastercardORmaestroday(){
        val type = MASTERCARDorMAESTRO
        val monthTrasaction=15_000_000
        val allMounthTrassaction=3_000_000

        val result= commission(
            typeCard = type,
            monthTrasaction = monthTrasaction,
            allMounthTrassaction = allMounthTrassaction
        )
        assertEquals("лимит за день исчерпан, мастер кард или маестро", result)
    }
    @Test
    fun MastercardORmaestroMounth(){
        val type = MASTERCARDorMAESTRO
        val monthTrasaction=15_000_000
        val allMounthTrassaction=3_000_000_00

        val result= commission(
            typeCard = type,
            monthTrasaction = monthTrasaction,
            allMounthTrassaction = allMounthTrassaction
        )
        assertEquals("лимит за месяц исчерпан, мастер кард или маестро", result)
    }
}