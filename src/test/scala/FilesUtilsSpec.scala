import org.scalatest.FlatSpec

/**
  * Created by tetio on 24/03/2017.
  */
class FilesUtilsSpec  extends FlatSpec {


  "A testing dir" should "contain message files" in {
    val messages = FileUtils.filesInDir("/messages/sample")
    assert(messages.size === 2)
  }
}
