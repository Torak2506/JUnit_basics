import org.junit.jupiter.api.Test

internal class filesWriterTest
{
    val fileswriter:FilesWriter = FilesWriter()
    val data:Data = Data()

    @Test
    fun generateTest()
    {
        data.import("F:\\untitled2\\src\\main\\resources\\data.csv",2)
        fileswriter.generate(data.rings)
    }
}