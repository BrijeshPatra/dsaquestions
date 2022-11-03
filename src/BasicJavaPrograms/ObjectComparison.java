package BasicJavaPrograms;
/*
Here we are comparing two objects using .equals()
method..
In Java, the == operator compares that two references are identical or not.
 Whereas the equals() method compares two objects.

Objects are equal when they have the same state (usually comparing variables).
Objects are identical when they share the class identity.

For example, the expression obj1==obj2 tests the identity,
not equality. While the expression obj1.equals(obj2) compares equality.
 */
public class ObjectComparison {
    public static void main(String[] args) {
        Double x=new Double(123.455);
        Long y=new Long(494949930);

        //invoking the equals method
        System.out.println("Objects are not equal,hence" +
                "it returns" + x.equals(y));

        System.out.println("Objects are equal,hence" +
                "it returns" + x.equals(123.455));

    }
}
