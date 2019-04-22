Comparable vs Comparator (Java)
-------------------------------
Purpose: Comparable/Comparator are used to allow comparison of two or more objects. 

Natural Ordering:
----------------
For primitive data types like String, integer, there is already a default natural ordering, (for numbers/integers it is ascending for String it using lexicographically ordering (Dictionary ordering)), but you need to manually specify natural ordering for specific objects that you create, ie Person object:

Comparable:
-----------
Implement Comparable interface to the class & method compareTo() to enable compare this object to another instance of the object

Comparable can be invoked with generic type invocation, for the case below we used Comparable<Person>, so that compareTo() method accepts Person as an parameter, otherwise it will accept object and you will have to typecast it to Person object.

compareTo() method returns an int, so that:
if you return a negative integer = this Person object is less than the other Person
if you return 0 = this person is equal to the other person
if you return positive integer = this person is greater than the other person
so if you are ordering by age

        public int compareTo(Person otherPerson) {
            if (this.age < otherPerson.getAge()) {
                return 1;
            } else if (this.age == otherPerson.getAge()) {
                return 0;
            } else {
                return -1;
            }
        }
    
Example: (for simplicities sake, i’ve used Integer as data type and compared it using Integer’s compareTo method)


        public class Person implements Comparable {
            private Integer age;

            public Integer getAge() {
                return age;
            }

            public void setAge(Integer age) {
                this.age = age;
            }

            public int compareTo(Person otherPerson) {
                if (this.age < otherPerson.getAge()) {
                    return 1;
                } else if (this.age == otherPerson.getAge()) {
                    return 0;
                } else {
                    return -1;
                }
            }
        }

    
Once you have implemented Comparable, any object you add to any collection type that maintains natural ordering (TreeSet, SortedSet, TreeMap) will have automatically sorted your objects.



For example you have Person object and you want to add a natural ordering of each person by age. In other words to keep the order of each person from youngest to oldest or vice versa in a ordered collection like TreeSet (There are other ordered collections for maps, list, sets as well)

If you read the documentation on TreeSet it says it is using natural ordering. 


public class Person {
    private Integer age;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
    



Comparator
Comparator uses a seperate class that enables you to compare two objects at a time.
It has a method called compare(object o1, object o2), that enables you to compare two objects and returns int as well similar to comparable.
Similar to the example above, we are sorting by age but notice that we had to create a new class called PersonComparator and then extend the class Comparator with the generic type invocation of Person.
Comparator returns integer whereas, same as comparable:
if you return a negative integer = this Person object is less than the other Person
if you return 0 = this person is equal to the other person
if you return positive integer = this person is greater than the other person
Example:


        import java.util.Comparator;
        public class PersonComparator implements Comparator {
            public int compare(Person p1, Person p2) {
                return p1.getAge().compareTo(p2.getAge());
            }
        }
    
To use:

you would need to use a collection that can accept a comparator as a parameter, for examples sake I am using LinkedList


        public static void main(String[] args) {
            LinkedList personList = new LinkedList();
            Person person1 = new Person();
            person1.setAge(15);
            Person person2 = new Person();
            person2.setAge(20);
            personList.add(person1);
            personList.add(person2);
            Collections.sort(personList, new PersonComparator());
         }
    
There other collections that accepts comparator as a constructor parameter, for example TreeSet:

TreeSet<Person> personSet =   new TreeSet<Person>(new PersonComparator());
Conclusion

Although both comparable and comparator provide same functionality it is more of a design whether you want to be implementing a interface or creating a new class.

This can also be a matter of access to the class, if you are using a third party API, and you don’t have access to the Person object, then you are forced to use comparator instead.

Also, a major hindrance for comparable is it is only limited to one implementation only, if you wanted to add more implementation for example, sort Person object by telephone number you can no longer use comparable, instead use comparator to create different implementations of different sortings.