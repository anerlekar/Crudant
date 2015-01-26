package test.scala.CrudantTests

import main.scala.Crudant
import org.junit.{Assert, Test}

/**
 * Created by apurv on 1/25/15.
 * © 2015 [Apurv Nerlekar] [apurvnerlekar@gmail.com].
 */

class CrudantTests {

  @Test
  def itShouldCreateAFile {

    //given
    val  fileName= "myFile.txt"
    val crudent:Crudant = new Crudant()
    val expected=true

    //when
    val actual=crudent create(fileName)

    //then
    Assert assertEquals(expected,actual)
  }


  @Test
  def itShouldDeleteAFile {

    //given
    val fileName= "myFile.txt"
    val crudent:Crudant = new Crudant()
    val expected=true

    //when
    val actual=crudent delete(fileName)

    //then
    Assert assertEquals(expected,actual)
  }

}
