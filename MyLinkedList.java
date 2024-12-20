import org.w3c.dom.Node;

public class MyLinkedList{
  private int size;
  private ListNode front,back;

  //You will only write the no argument Constructor, as you do not have a capacity.
  public MyLinkedList(){
    front = null;
    back = null;
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
    ListNode a = new ListNode(e);
    if (size == 0){
      front = a;
      back = a;
    }else{
      back.setNext(a);
      back = a;
    }
    size++;
    return true;
  }

  public String toString(){
    //same format as ArrayList "[A, B, C]" or "[]"
    ListNode a = front;
    if (a == null){
      return "[]";
    }
    String d = "[" + a.getData();
    a = a.next();
    while(a != null){
      d += ", " + a.getData();
      a = a.next();
    }
    d += "]";
    return d;
  }

  public String toStringReversed(){
    //same as toString, but iterate from the back, using prev() "[C, B, A]" or "[]"    
    String result = "["; 
    for (int i = size-1; i>=0; i--){
      if(i==0){
        result += this.get(i) + "]";
      }
      else{
        result += this.get(i) + ", ";
      }
    }
    return result;
  }
  
   public void add(int index, String element){
    //Inserts the specified element at the specified position in this list.
    ListNode d = new ListNode(element);
     if (index == 0){
       d.setNext(front);
       front = d;
     } else{
       ListNode a = front;
       for (int i = 0; i < index - 1; i++){
         a = a.next();
       }
       d.setNext(a.next());
       a.setNext(d);
     }
     size++;
  }
  
   public String set(int index, String value){
    //Replaces the value at the specified index in this list with the specified value.
    //Return the original String that was present
      ListNode current = front;
      for (int i = 0; i < index; i++) {
        current = current.next();
      }

      String oldValue = current.getData();
      current.setData(value);
      return oldValue;
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
        if(b == null){
          front = a.next();
        }else{
          b.setNext(a.next());
        }
        size--;
        return true;
      }
      b = a;
      a = a.next();
    }
    return false;
  }
  
}
