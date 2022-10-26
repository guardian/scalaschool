val sequence = Seq(1, 2, 3)

// Getting by index
sequence.apply(1)
sequence(1)

// Error: IndexOutOfBoundsException
sequence(3)

// head and tail
sequence.head
sequence.tail
sequence.tail.head

// Error: NoSuchElementException
Seq().head

// Error: UnsupportedOperationException
Seq().tail

// Safely get the head
sequence.headOption
Seq().headOption

// Length
sequence.length
sequence.size

// Searching
sequence.contains(2)
sequence.find(_ == 3)
sequence.find(_ > 4)
sequence.filter(_ > 1)

// append prepend - no mutation
sequence :+ 4
0 +: sequence

// Lists
val list = 1 :: 2 :: 3 :: Nil
List(1, 2, 3)
List.apply(1, 2, 3)

// Pattern matching on lists
val emptyList = List()
val nonEmptyList = List(1, 2, 3)

def isEmpty(l: List[Int]): Boolean = ???

// return None if empty
// or the first element
def getFirst(l: List[Int]): Option[Int] = ???

def getSecond(l: List[Int]): Option[Int] = ???

// sport/sport === true
// uk/sport === false
// sport === false
def isSectionTag(tag: String): Boolean = ???
