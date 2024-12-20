public class MyLinkedList{
  private int size;
  private ListNode front,back;

  //You will only write the no argument Constructor, as you do not have a capacity.
  public MyLinkedList(){
    front = null;
    size = 0;
  }
  
  public int size(){
    //Returns the number of elements in this list.
    return size;
  }
  public String get(int index){
    //Return the value at the specified index.
    ListNode a = front;
    for (int i = 0; i < index; i++){
      a = a.next();
    }
    return a.getData();
  }
  
  public boolean add(String e){
    //Appends the specified element to the end of this list.
    boolean b = false;
    if (front == null){
      front = new ListNode(e);
    }else{
      ListNode a = front;
      while (a.next() != null){
        a = a.next();
      }
      a.setNext(new ListNode(e));
      b = true;
    }
    size++;
    return b;
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
     if (index == 0){
       front = new ListNode(element);
     } else{
       ListNode a = front;
       for (int i = 0; i < index - 1; i++){
         a = a.next();
       }
       a.setNext(new ListNode(element));
     }
     size++;
  }
  
   public String set(int index, String value){
    //Replaces the value at the specified index in this list with the specified value.
    //Return the original String that was present
     ListNode original = new ListNode(value);
     String d = "";
     ListNode a = front;
     if (index == 0){
       front = new ListNode(value);
     } else{
       for(int i = 0; a != null && i < (index-1); i++){
         a = a.next();
       }
       ListNode temp = a.next();
       a.setNext(original);
       original.setNext(temp);
     }
     return original.toString();
    }
  
  public boolean contains(String element){
    //Returns true if this list contains the specified element, false otherwise.
    for(int i = 0; i < size; i++){
      if(element.equals(get(i))){
        return true;
      }
    }
    return false;
    }
  
  public String remove(int index){
    //Removes the element at the specified position in this list.
    String d = this.get(index);
    if (index == 0){
      front = front.next();
    }else{
      ListNode a = front;
      for(int i = 0; i < index - 1; i++){
        a = a.next();
      }
      a.setNext(a.next().next());
    }
    size--;
    return d;
  }
  
  public boolean remove(String element){
    //Removes the first occurrence of the specified element from this list, if it is present.
    ListNode a = front;
    ListNode b = null;
    for(int i = 0; i < size; i++){
      if(a.getData().equals(element)){
        b.setNext(a.next());
        a = null;
        size--;
        return true;
      }
      b = a;
      a = a.next();
    }
    return false;
  }
  
}
