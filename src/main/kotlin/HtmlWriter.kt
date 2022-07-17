import java.io.File

class FilesWriter {

    fun generate(rings: MutableList<String>) {
        generateHtml(rings.size)
        generateJS()
    }

    fun generateHtml(rings:Int)
    {

        val html = File("F://index.html")
        html.writeText(
                "<!DOCTYPE HTML>\n" +
                        "<html>\n" +
                        "<head>\n" +
                        "<meta charset=\"utf-8\">\n" +
                        "<script src=\"draw.js\"></script>\n" +
                        "<title>Techradar</title>\n" +
                        "</head>\n" +
                        "<body onload=\"draw("+rings+")\">\n" +
                        "<h1>TEST</h1>\n"+
                        "<canvas id=\"radar\", width="+rings*100+", height="+rings*100+">\n" +
                        "</canvas>\n" +
                        "</body>\n" +
                        "</html>"
                )

    }

    fun generateJS() {
        val JS = File("F://draw.js")
        JS.writeText(
            "function draw(rings){\n" +
                    "var c = document.getElementById(\"radar\");\n" +
                    "var ctx = c.getContext(\"2d\");\n" +
                    "for(var i = 1;i<=rings;i++)\n{\n" +
                    "ctx.beginPath();\n" +
                    "ctx.arc(rings*50, rings*50, 50*i, 0, 2 * Math.PI);\n" +
                    "ctx.stroke();}}\n"
        )
    }
}