package controllers

import java.io._
import java.net._
import play.api._
import play.api.mvc._
import io.github.cloudify.scala.spdf._

class Application extends Controller {

  def url(url: String, filename: String) = Action {
    val html = new URL(url)

    generatePdf(filename, html.toString)
  }

  def html(html: String, filename: String) = Action {
    generatePdf(filename, html)
  }

  def generatePdf(filename: String, html: String) = {
    val pdf = Pdf("/usr/local/bin/wkhtmltopdf.sh", new PdfConfig {
      orientation := Landscape
      pageSize := "Letter"
      marginTop := "0in"
      marginBottom := "0in"
      marginLeft := "0in"
      marginRight := "0in"
    })

    val outputStream = new ByteArrayOutputStream
    pdf.run(html, outputStream)

    Ok(outputStream.toByteArray()).withHeaders(
      "Content-Type" -> "application/pdf",
      "Content-Disposition" -> "attachment; filename=$filename.png"
    )
  }

}
