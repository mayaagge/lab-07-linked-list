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
    ListNode a = front;
    if (index >= size || index < 0){
      throw new IndexOutOfBoundsException("Check index!");
    } else{
      for (int i = 0; i < index; i++){
        a = a.next();
      }
    }
    return a.getData();
  }
  
  public boolean add(String e){
    //Appends the specified element to the end of this list.
    ListNode temp = new ListNode(e);
    ListNode a = front;
    if (e == null){
      throw new NullPointerException("Cannot add null!");
    }else if(e.equals("")){
      throw new IllegalArgumentException("String cannot be empty!");
    }else{
      while(a.next() != null){
        a = a.next();
      }
      a.setNext(temp);
      size++;
      return true;
    }
    return false;
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
     String d = "";
     ListNode a = front;
     if (d == null){
      throw new NullPointerException("String is null!");
     }else if (d.equals("")){
      throw new IllegalArgumentException("Check String!");
     } else if (index >= size || index < 0){
      throw new IndexOutOfBoundsException("Check index!");
     } else{
       d = a.getData();
       d.setData(value);
     }
     return d;
  } 
  
  public boolean contains(String element){
    //Returns true if this list contains the specified element, false otherwise.
    if (element == null){
      throw new NullPointerException("Element is null!");
    }else if (element.equals("")){
      throw new IllegalArgumentException("Check element!");
    }else{
      for(int i = 0; i < size; i++){
        if(element.equals(get(i))){
          return true;
        }
      }
    }
    return false;
  }
  
  public String remove(int index){
    //Removes the element at the specified position in this list.
    String d = "";
    if (index < 0 || index >= size()) {
      throw new IndexOutOfBoundsException("Check index!");
    } else {
      if(index == 0) { 
        d = front.toString();
      } else {
          for (int i = 0; i < index - 1; i++) { 
            front = front.next();
          }
          d = front.next().toString();
          back = front.next().next();
          front.setNext(back); 
      }
    }
    return d;
  }
  
  public boolean remove(String element){
    //Removes the first occurrence of the specified element from this list, if it is present.
    ListNode a = front;
    ListNode b = null;
    if (element == null){
      throw new NullPointerException("Element is null!");
    }else if (element.equals("")){
      throw new IllegalArgumentException("Check element!");
    }else{
      for(int i = 0; i < size; i++){
        if(a.getData().equals(element)){
          String temp = b.next();
          temp = a.next();
          a = null;
          size--;
          return true;
        }
        b = a;
        a = a.next();
      }
    }
    return false;
  }
  
}
