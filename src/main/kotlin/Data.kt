import java.io.File

class Data {

    val rings = mutableListOf<String>()
    val technologies = mutableListOf<Technology>()

    fun import(csvPath: String,skipLines: Int){
        var file = File(csvPath)
        var lines = file.readLines()
        var numberOfRings = lines[0].toInt();
        for(i in 1 .. numberOfRings)
        {
            rings.add(lines[i])
        }
        lines = lines.drop(numberOfRings+skipLines)
        lateinit var l:List<String>
        for(i in 0 until lines.count())
        {
            l = lines[i].split(';')
            print(l[0])
            technologies.add(Technology(l[0].toInt(),l[1],l[2],l[3],l[4]))
        }
    }
}