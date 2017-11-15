import java.io.InputStream
import java.io.OutputStream

/**
 * Created by SCI on 10/8/2017.
 */
class DocumentImple :Document {
    override val version: Long
        get() = 0
    override val size: Long
        get() = 0

    override fun save(input: InputStream) {
    }

    override fun load(stream: OutputStream) {
    }
}