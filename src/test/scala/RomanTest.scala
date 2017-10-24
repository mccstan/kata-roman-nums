import org.scalatest.FunSuite

class RomanTest extends FunSuite {

  // Test généraux
  test("1") {
    assert(Roman.decode(1) === "I")
  }

  test("5") {
    assert(Roman.decode(5) === "V")
  }

  test("10") {
    assert(Roman.decode(10) === "X")
  }

  test("50") {
    assert(Roman.decode(50) === "L")
  }

  test("100") {
    assert(Roman.decode(100) === "C")
  }

  test("500") {
    assert(Roman.decode(500) === "D")
  }

  test("1000") {
    assert(Roman.decode(1000) === "M")
  }


  // Test spécifiques 1-3
  /*test("1") {
    assert(Roman.decode(1) === "I")
  }*/
  test("2") {
    assert(Roman.decode(2) === "II")
  }

  test("3") {
    assert(Roman.decode(3) === "III")
  }


  // Test spécifiques 5-8
  /*test("5") {
    assert(Roman.decode(5) === "V")
  }
  */
  test("6") {
    assert(Roman.decode(6) === "VI")
  }
  test("7") {
    assert(Roman.decode(7) === "VII")
  }
  test("8") {
    assert(Roman.decode(8) === "VIII")
  }


  // Test spécifiques 10-13
  /*
  test("10") {
    assert(Roman.decode(6) === "VI")
  }*/
  test("11") {
    assert(Roman.decode(11) === "XI")
  }
  test("12") {
    assert(Roman.decode(12) === "XII")
  }
  test("13") {
    assert(Roman.decode(13) === "XIII")
  }


  // Test spécifiques multiples 51, 52, 101, 501

  test("51") {
    assert(Roman.decode(51) === "LI")
  }
  test("52") {
    assert(Roman.decode(52) === "LII")
  }
  test("101") {
    assert(Roman.decode(101) === "CI")
  }
  test("501") {
    assert(Roman.decode(501) === "DI")
  }
  test("508") {
    assert(Roman.decode(508) === "DVIII")
  }
  test("513") {
    assert(Roman.decode(513) === "DXIII")
  }

  test("525") {
    assert(Roman.decode(525) === "DXXV")
  }
  test("535") {
    assert(Roman.decode(535) === "DXXXV")
  }
  /*/ Test spécifique 4
  test("4") {
    assert(Roman.decode(2) === "VI")
  }
*/

}
