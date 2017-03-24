import java.io.File
import java.nio.file.{Files, Path, Paths}

import scala.collection.JavaConversions._
import scala.io.Source
/**
  * Created by tetio on 23/03/2017.
  */
object FileUtils {
  def filesInDir(path: String): Iterable[String] = {
    val folder = new File(getClass.getResource(path).getPath)
    folder.listFiles(_.getName.endsWith(".msg"))
      .map(_.getAbsolutePath())
  }

}
