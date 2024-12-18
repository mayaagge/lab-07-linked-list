public class MyLinkedList{
  private int size;
  private ListNode front,back;

  //You will only write the no argument Constructor, as you do not have a capacity.
  public MyLinkedList(){
    front = new ListNode(null);
    size = 0;
  }
  
  public int size(){
    //Returns the number of elements in this list.
    return size;
  }
  public String get(int index){
    //Return the value at the specified index.
    if (index >= size || index < 0){
      throw new IndexOutOfBoundsException("Check index!");
    }
    ListNode a = front;
    for (int i = 0; i < index; i++){
      a = a.next();
    }
    return a.getData();
  }
  
  public boolean add(String e){
    //Appends the specified element to the end of this list.
    ListNode temp = new ListNode(e);
    ListNode a = front;
    while(a.next() != null){
      a = a.next();
    }
    if (temp == a) {
      return false;
    }
    a.setNext(temp);
    size++;
    return true;
  }

  public String toString(){
    //same format as ArrayList "[A, B, C]" or "[]"
    String d = "";
    ListNode a = front;
    while(a != null){
      d += "[" + a.getData() + "]";
      a = a.next();
    }
    return d;
  }

  public String toStringReversed(){
    //same as toString, but iterate from the back, using prev() "[C, B, A]" or "[]"
    String d = "";
    ListNode a = back;
    while(a != null){
      d += "[" + a.getData() + "]";
      a = a.prev();
    }
    return d;
  }
  
   public void add(int index, String element){
    //Inserts the specified element at the specified position in this list.
     ListNode temp = new ListNode(element);
     ListNode a = front;
     if (a != null){
       for(int i = 0; i < index && a.next() != null; i++){
         a = a.next();
       }
     }
     temp.setNext(a.next());
     a.setNext(temp);
     size++;
  }
  
   public String set(int index, String value){
    //Replaces the value at the specified index in this list with the specified value.
    //Return the original String that was present
  } 
  
  public boolean contains(String element){
    //Returns true if this list contains the specified element, false otherwise.
  }
  
  public String remove(int index){
    //Removes the element at the specified position in this list.
  }
  
  public boolean remove(String element){
    //Removes the first occurrence of the specified element from this list, if it is present.
    if (index <= 0 || index > size()){
      return false;
    }
    if (index == 1){
      front = front.next();
    }
    ListNode a = front;
    for(int i = 0; i < index; i++){
      if (a.next() == null){
        return false;
      }
      a = a.next();
    }
    a.setNext(a.next().next());
    size--;
    return true;
  }
  
}
