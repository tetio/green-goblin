import org.scalatest.FlatSpec

import scala.collection.mutable.Stack

/**
  * Created by tetio on 23/03/2017.
  */
class StackSpec extends FlatSpec {

  "A Stack" should "pop values in last-in-first-out order" in {
    val stack = new Stack[Int]
    stack.push(1)
    stack.push(2)
    assert(stack.pop() === 2)
    assert(stack.pop() === 1)
  }

  it should "throw NoSuchElementException if an empty stack is popped" in {
    val emptyStack = new Stack[String]
    assertThrows[NoSuchElementException] {
      emptyStack.pop()
    }
  }

  "a value" should "be pushed and popped and be the same" in {
    val stack = new Stack[String]
    var data = "Hi I'm some data"
    stack.push(data);
    val data2 = stack.pop()
    assert(data === data2)
  }

}