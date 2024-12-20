public class Driver{
  public static void main(String[] args){
      MyLinkedList list = new MyLinkedList();

      // Add method
      list.add("A");
      list.add("B");
      list.add("C");
      System.out.println("List after adding A, B, C: " + list.toString()); // Expected: [A, B, C]

      // Add at index
      list.add(1, "Z");
      System.out.println("List after adding Z at index 1: " + list.toString()); // Expected: [A, Z, B, C]

      // Set method
      String value = list.set(0, "Y");
      System.out.println("Replaced value: " + value); // Expected: B
      System.out.println("List after setting A to Y: " + list.toString()); // Expected: [Y, Z, B, C]

      // Size method
      System.out.println("Size of the list: " + list.size()); // Expected: 4

      // Get method
      System.out.println("Element at index 2: " + list.get(2)); // Expected: Y

      // toStringReversed method
      System.out.println("Reversed list: " + list.toStringReversed()); // Expected: [C, Y, Z, A]

      // Contain method
      System.out.println("List contains Y: " + list.contains("Y")); // Expected: true
      System.out.println("List contains C: " + list.contains("C")); // Expected: false

      // Remove by index
      String removedElement = list.remove(0);
      System.out.println("Removed element: " + removedElement); // Expected: Y
      System.out.println("List after removal by index: " + list.toString()); // Expected: [Z, B, C]

      // Remove by element
      boolean isRemoved = list.remove("Z");
      System.out.println("Z was removed: " + isRemoved); // Expected: true
      System.out.println("List after removal by element: " + list.toString()); // Expected: [B, C]

      // Empty List
      list = new MyLinkedList();
      System.out.println("Empty list: " + list.toString()); // Expected: []
  }
}