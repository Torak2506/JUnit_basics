import org.junit.jupiter.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvFileSource
import kotlin.test.Test
import kotlin.test.assertEquals

internal class DataTest
{

    private val testData: Data = Data()

    @Test
    fun dataImportTest()
    {
        testData.import("F:\\untitled2\\src\\main\\resources\\data.csv",2);
        assertEquals(5,testData.technologies[5].id)
    }


    @ParameterizedTest
    @CsvFileSource(resources = ["/data.csv"], delimiter = ';')
    fun comparableTest(place: Int, expected: Int)
    {
        testData.import("F:\\untitled2\\src\\main\\resources\\data.csv",2);
        testData.technologies.sort();
        Assertions.assertEquals(expected, testData.technologies[place].id)
    }
}