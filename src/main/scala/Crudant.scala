package main.scala

import java.io.{File, PrintWriter}
import java.nio.file.{Paths, Files}

/**
 * Created by apurv on 1/25/15.
 * © 2015 [Apurv Nerlekar] [apurvnerlekar@gmail.com].
 */

class Crudant() {

  def create(fileName:String) :Boolean= {
    val writer = new PrintWriter(new File(fileName))
    writer close()
    true
  }

  def delete(fileName: String):Boolean = {
    val absolutePath=Paths.get(fileName)

    Files.deleteIfExists(absolutePath)
  }

}
