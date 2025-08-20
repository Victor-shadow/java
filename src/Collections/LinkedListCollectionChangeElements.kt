/**Changing Elements: With the help of the set() method, we can update an element in the linked list
 * This method takes an index and the updated element which needs to be inserted at that index */
package Collections
import java.util.*

object LinkedListCollectionChangeElements {
    @kotlin.jvm.JvmStatic
    fun main(args: Array<String>) {
        val linkedList = LinkedList<String?>()

        //add elements to the linkedList
        linkedList.add("Java")
        linkedList.add("Kotlin")
        linkedList.add("Scala")
        linkedList.add("Ruby")
        linkedList.add(3, "Rust")

        println("Initial linked list: " + linkedList)

        linkedList.set(3, "Rust")

        println("Updated LinkedList: " + linkedList)
    }
}
