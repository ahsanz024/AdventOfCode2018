import java.io.File
import java.io.FileReader

object Utils {
    fun readFile(path: String): FileReader {
        return FileReader(File(path))
    }
}