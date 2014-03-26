package recursion;

import javax.swing.JOptionPane;

public class Recursion
{
    int n = 0;
    StringBuilder sb = new StringBuilder();

    public void init()
    {
        SinglyLinkedList<String> stringList = generateStringList();

        SinglyLinkedList<Integer> intList = generateIntegerList();

        SinglyLinkedList<Person> personList = generatePersonList();

        sb.append("String List:");
        sb.append("\n");
        printInOrder(stringList);
        printInReverse(stringList, n);
        JOptionPane.showMessageDialog(null, sb.toString(), "Recursive Lists", JOptionPane.INFORMATION_MESSAGE);

        sb = new StringBuilder();
        n = 0;
        sb.append("Integer List:");
        sb.append("\n");
        printInOrder(intList);
        printInReverse(intList, n);
        JOptionPane.showMessageDialog(null, sb.toString(), "Recursive Lists", JOptionPane.INFORMATION_MESSAGE);

        sb = new StringBuilder();
        n = 0;
        sb.append("Person List:");
        sb.append("\n");
        printInOrder(personList);
        printInReverse(personList, n);
        JOptionPane.showMessageDialog(null, sb.toString(), "Recursive Lists", JOptionPane.INFORMATION_MESSAGE);

    }

    private void printInOrder(SinglyLinkedList<?> list)
    {
        for (int i = list.getLength() - 1; i >= 0; i--)
        {
            sb.append(list.getElementAt(i).toString());
            sb.append("\n");
        }
        sb.append("\n");
    }

    /**
     * Base case is getting to the end of the list. This is when the recursion ends.
     * Recursive process is passing in the list and the variable n, which represents the index to get in the next iteration of recursion.
     */
    private void printInReverse(SinglyLinkedList<?> list, int num)
    {
        n = num;

        //base case
        if (n == list.getLength())
        {
            return;
        }
        sb.append(list.getElementAt(n));
        sb.append("\n");
        n++;

        //recursive process
        printInReverse(list, n);
    }

    private SinglyLinkedList<String> generateStringList()
    {
        SinglyLinkedList<String> stringList = new SinglyLinkedList<String>();
        stringList.add("Integer");
        stringList.add("String");
        stringList.add("Boolean");
        stringList.add("Double");
        stringList.add("Float");
        return stringList;
    }

    private SinglyLinkedList<Integer> generateIntegerList()
    {
        SinglyLinkedList<Integer> intList = new SinglyLinkedList<Integer>();
        intList.add(234);
        intList.add(848);
        intList.add(929);
        intList.add(1093);
        intList.add(1503);
        return intList;
    }

    private SinglyLinkedList<Person> generatePersonList()
    {
        SinglyLinkedList<Person> personList = new SinglyLinkedList<Person>();
        personList.add(new Person("Luke", "Skywalker", 30, "Green"));
        personList.add(new Person("Han", "Solo", 35, "Orange"));
        personList.add(new Person("R2", "D2", 100, "Blue"));
        personList.add(new Person("Mace", "Windu", 40, "Purple"));
        personList.add(new Person("Boba", "Fett", 40, "Silver"));
        return personList;
    }
}