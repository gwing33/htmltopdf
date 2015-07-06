package ltf.htmltopdf

import org.http4s._
import org.http4s.server._
import org.http4s.dsl._
import org.http4s.argonaut._

import _root_.argonaut._

import java.net._
import io.github.cloudify.scala.spdf._

object HtmlToPdf {
  val service = HttpService {
    case req @ POST -> Root =>
      // Create a new Pdf converter with a custom configuration
      val pdf = Pdf(new PdfConfig {
        orientation := Landscape
        pageSize := "Letter"
        marginTop := "0in"
        marginBottom := "0in"
        marginLeft := "0in"
        marginRight := "0in"
      })

      // val outputStream = new ByteArrayOutputStream
      // req.decode[GeneratePdf] { g =>
      //   //pdf.run(page, outputStream)
      //   pdf.run(new URL("http://www.google.com"), outputStream)
      // }

      Ok("Hello World!")
  }
}
