import java.util.ArrayList;
public class Driver{
  public static boolean DEBUG = true;

  public static void println(String s){
    if(DEBUG){
      System.out.println(s);
    }
  }


  public static boolean compare(MyLinkedList a, ArrayList<String> b){
    if(a.size() != b.size()){
      return false;
    }
    for(int i = 0; i < a.size(); i++){
      if(!a.get(i).equals(b.get(i))){
        return false;
     }
    }

    return true;
  }




  public static void main(String[]args){
    MyLinkedList words;
    ArrayList<String>result;
    String TEST_NAME;



    words = new MyLinkedList();
    result = new ArrayList<String>();
    TEST_NAME = "Create Empty";
    try{
      if( compare(words,result) ) {
      }else{
        println("Failed "+TEST_NAME);
      }

    }catch(RuntimeException e){
        println("Failed "+TEST_NAME+ " RuntimeException " +e);
        if(DEBUG)e.printStackTrace();
    }





    words = new MyLinkedList();
    result = new ArrayList<String>();
    TEST_NAME = "add small amount to end + toString() + toStringReversed()";
    try{
      for(int i = 0; i < 5; i++){
        double d = (int)(Math.random()*100)/10.0;
        words.add(""+d);
        result.add(""+d);
      }

      if( compare(words,result) ) {
      }else{
        println("Failed "+TEST_NAME+"\n"+words+"\n"+result);
      }


    //TOSTRING test
      if( words.toString().equals(result.toString() )){
      }else{
        System.out.println("Err toString: "+ words.toString() + " vs expected "+ result.toString() );
      }

    //TOSTRING reversed test:
     for(int i = 1; i < result.size();i++){
	result.add(0,result.remove(i));
     }
     if( result.toString().equals(words.toStringReversed()) ){
     }else{
        System.out.println("Err toStringReversed: "+ words.toStringReversed() + " vs expected: "+ result.toString() );
     }

    }catch(RuntimeException e){
        println("Failed "+TEST_NAME+ " RuntimeException "+e);
        if(DEBUG)e.printStackTrace();
    }






    words = new MyLinkedList();
    result = new ArrayList<String>();
    TEST_NAME = "add small amount to end";
    try{
      for(int i = 0; i < 5; i++){
        double d = Math.random();
        words.add(""+d);
        result.add(""+d);
      }

      if( compare(words,result) ) {
      }else{
        println("Failed "+TEST_NAME+"\n"+words+"\n"+result);
      }

    }catch(RuntimeException e){
        println("Failed "+TEST_NAME+ " RuntimeException "+e);
        if(DEBUG)e.printStackTrace();
    }


    TEST_NAME = "set return value test";
    boolean matching = true;
    try{
      for(int i = 0; i < 5; i++){
        double d = Math.random();
        matching = matching && words.set(i,"").equals(result.set(i,""));
      }

      if( matching ) {
      }else{
        println("Failed "+TEST_NAME);
      }

    }catch(RuntimeException e){
        println("Failed "+TEST_NAME+ " RuntimeException "+e);
        if(DEBUG)e.printStackTrace();
    }




    words = new MyLinkedList();
    result = new ArrayList<String>();
    TEST_NAME = "add small amount to end by index";
    try{
      for(int i = 0; i < 5; i++){
        double d = (int)(Math.random()*100)/10.0;
        words.add(words.size(),""+d);
        result.add(result.size(),""+d);
      }

      if( compare(words,result) ) {
      }else{
        println("Failed "+TEST_NAME+"\n"+words+"\n"+result);
      }

    }catch(RuntimeException e){
        println("Failed "+TEST_NAME+ " RuntimeException "+e);
        if(DEBUG)e.printStackTrace();
    }






    words = new MyLinkedList();
    result = new ArrayList<String>();
    TEST_NAME = "add many to end";
    try{
      for(int i = 0; i < 5000; i++){
        double d = Math.random();
        words.add(""+d);
        result.add(""+d);
      }
      if( compare(words,result) ) {
      }else{
        println("Failed "+TEST_NAME);
      }

    }catch(RuntimeException e){
        println("Failed "+TEST_NAME+ " RuntimeException "+e);
        if(DEBUG)e.printStackTrace();
    }



    words = new MyLinkedList();
    result = new ArrayList<String>();
    TEST_NAME = "add small amount to front";
    try{
      for(int i = 0; i < 5; i++){
        double d = Math.random();
        words.add(0,""+d);
        result.add(0,""+d);
      }
      if( compare(words,result) ) {
      }else{
        println("Failed "+TEST_NAME+"\n"+words+"\n"+result);
      }

    }catch(RuntimeException e){
        println("Failed "+TEST_NAME+ " RuntimeException "+e);
        if(DEBUG)e.printStackTrace();
    }




    words = new MyLinkedList();
    result = new ArrayList<String>();
    TEST_NAME = "add many to front";
    try{
      for(int i = 0; i < 5000; i++){
        double d = Math.random();
        words.add(0,""+d);
        result.add(0,""+d);
      }

      if( compare(words,result) ) {
      }else{
        println("Failed "+TEST_NAME);
      }

    }catch(RuntimeException e){
        println("Failed "+TEST_NAME+ " RuntimeException "+e);
        if(DEBUG)e.printStackTrace();
    }




    words = new MyLinkedList();
    result = new ArrayList<String>();
    TEST_NAME = "add many to random index (not end)";
    try{
      for(int i = 0; i < 5000; i++){
        int ind = (int)(Math.random()*(result.size()));
        words.add(ind,""+i);
        result.add(ind,""+i);
      }

      if( compare(words,result) ) {
      }else{
        println("Failed "+TEST_NAME);
      }

    }catch(RuntimeException e){
        println("Failed "+TEST_NAME+ " RuntimeException "+e);
        if(DEBUG)e.printStackTrace();
    }




    words = new MyLinkedList();
    result = new ArrayList<String>();
    TEST_NAME = "add small amount to end then remove from front";
    try{
      for(int i = 0; i < 5; i++){
        double d = Math.random();
        words.add(""+d);
        result.add(""+d);
      }
      words.remove(0);
      result.remove(0);
      words.remove(0);
      result.remove(0);
      words.remove(0);
      result.remove(0);


      if( compare(words,result) ) {
      }else{
        println("Failed "+TEST_NAME);
      }

    }catch(RuntimeException e){
        println("Failed "+TEST_NAME+ " RuntimeException "+e);
        if(DEBUG)e.printStackTrace();
    }




    words = new MyLinkedList();
    result = new ArrayList<String>();
    TEST_NAME = "add small amount to end then remove from end";
    try{
      for(int i = 0; i < 5; i++){
        double d = Math.random();
        words.add(""+d);
        result.add(""+d);
      }
      words.remove(words.size()-1);
      result.remove(result.size()-1);
      words.remove(words.size()-1);
      result.remove(result.size()-1);
      words.remove(words.size()-1);
      result.remove(result.size()-1);


      if( compare(words,result) ) {
      }else{
        println("Failed "+TEST_NAME);
      }

    }catch(RuntimeException e){
        println("Failed "+TEST_NAME+ " RuntimeException "+e);
        if(DEBUG)e.printStackTrace();
    }

    words = new MyLinkedList();
    result = new ArrayList<String>();
    TEST_NAME = "add large amount to end then remove from front";
    try{
      for(int i = 0; i < 5000; i++){
        double d = Math.random();
        words.add(""+d);
        result.add(""+d);
        if(i%10 == 0){
          words.remove(0);
          result.remove(0);
        }
      }


      if( compare(words,result) ) {
      }else{
        println("Failed "+TEST_NAME);
      }

    }catch(RuntimeException e){
        println("Failed "+TEST_NAME+ " RuntimeException "+e);
        if(DEBUG)e.printStackTrace();
    }




    words = new MyLinkedList();
    result = new ArrayList<String>();
    TEST_NAME = "add large amount to front then remove from end";
    try{
      for(int i = 0; i < 5000; i++){
        double d = Math.random();
        words.add(""+d);
        result.add(""+d);
        if(i%10 == 0){
          words.remove(words.size()-1);
          result.remove(result.size()-1);
        }
      }
      if( compare(words,result) ) {
      }else{
        println("Failed "+TEST_NAME);
      }
    }catch(RuntimeException e){
        println("Failed "+TEST_NAME+ " RuntimeException "+e);
        if(DEBUG)e.printStackTrace();
    }




    words = new MyLinkedList();
    result = new ArrayList<String>();
    TEST_NAME = "add many to random index (not end) remove from random index";
    try{
      for(int i = 0; i < 5000; i++){
        int ind = (int)(Math.random()*(result.size()));
        words.add(ind,""+i);
        result.add(ind,""+i);
        if(i%10==0){
          ind = (int)(Math.random()*(result.size()));
          words.remove(ind);
          result.remove(ind);
        }
      }

      if( compare(words,result) ) {
      }else{
        println("Failed "+TEST_NAME);
      }

    }catch(RuntimeException e){
        println("Failed "+TEST_NAME+ " RuntimeException "+e);
        if(DEBUG)e.printStackTrace();
    }









    try{
      words=new MyLinkedList();
      for(int i = 0; i < 25; i++){
        words.add(""+Math.random());
      }

      TEST_NAME = "get access out of bounds";
      try{
        int index = words.size();
        words.get(index);
        println("Failed "+TEST_NAME+ " NO Exception at index "+index+" size ="+ words.size());
      }catch(IndexOutOfBoundsException e){
      }catch(RuntimeException e){
          println("Failed "+TEST_NAME+ " RuntimeException "+e);
          if(DEBUG)e.printStackTrace();
      }
      try{
        int index = -1;
        words.get(index);
        println("Failed "+TEST_NAME+ " NO Exception at index "+index+" size ="+ words.size());
      }catch(IndexOutOfBoundsException e){
      }catch(RuntimeException e){
          println("Failed "+TEST_NAME+ " RuntimeException "+e);
          if(DEBUG)e.printStackTrace();
      }
      try{
        int index = words.size()+10;
        words.get(index);
        println("Failed "+TEST_NAME+ " NO Exception at index "+index+" size ="+ words.size());
      }catch(IndexOutOfBoundsException e){
      }catch(RuntimeException e){
          println("Failed "+TEST_NAME+ " RuntimeException "+e);
          if(DEBUG)e.printStackTrace();
      }



      TEST_NAME = "set access out of bounds";
      try{
        int index = words.size();
        words.set(index,"");
        println("Failed "+TEST_NAME+ " NO Exception at index "+index+" size ="+ words.size());
      }catch(IndexOutOfBoundsException e){
      }catch(RuntimeException e){
          println("Failed "+TEST_NAME+ " RuntimeException "+e);
          if(DEBUG)e.printStackTrace();
      }
      try{
        int index = -1;
        words.set(index,"");
        println("Failed "+TEST_NAME+ " NO Exception at index "+index+" size ="+ words.size());
      }catch(IndexOutOfBoundsException e){
      }catch(RuntimeException e){
          println("Failed "+TEST_NAME+ " RuntimeException "+e);
          if(DEBUG)e.printStackTrace();
      }
      try{
        int index = words.size()+10;
        words.set(index,"");
        println("Failed "+TEST_NAME+ " NO Exception at index "+index+" size ="+ words.size());
      }catch(IndexOutOfBoundsException e){
      }catch(RuntimeException e){
          println("Failed "+TEST_NAME+ " RuntimeException "+e);
          if(DEBUG)e.printStackTrace();
      }


      TEST_NAME = "remove access out of bounds";
      try{
        int index = words.size();
        words.remove(index);
        println("Failed "+TEST_NAME+ " NO Exception at index "+index+" size ="+ words.size());
      }catch(IndexOutOfBoundsException e){
      }catch(RuntimeException e){
          println("Failed "+TEST_NAME+ " RuntimeException "+e);
          if(DEBUG)e.printStackTrace();
      }

      try{
        int index = -1;
        words.remove(index);
        println("Failed "+TEST_NAME+ " NO Exception at index "+index+" size ="+ words.size());
      }catch(IndexOutOfBoundsException e){
      }catch(RuntimeException e){
          println("Failed "+TEST_NAME+ " RuntimeException "+e);
          if(DEBUG)e.printStackTrace();
      }

      try{
        int index = words.size()+10;
        words.remove(index);
        println("Failed "+TEST_NAME+ " NO Exception at index "+index+" size ="+ words.size());
      }catch(IndexOutOfBoundsException e){
      }catch(RuntimeException e){
          println("Failed "+TEST_NAME+ " RuntimeException "+e);
          if(DEBUG)e.printStackTrace();
      }



      TEST_NAME = "add out of bounds";
      try{
        int index = words.size()+1;
        words.add(index,"");
        println("Failed "+TEST_NAME+ " NO Exception at index "+index+" size ="+ words.size());
      }catch(IndexOutOfBoundsException e){
      }catch(RuntimeException e){
          println("Failed "+TEST_NAME+ " RuntimeException "+e);
          if(DEBUG)e.printStackTrace();
      }
      try{
        int index = -1;
        words.add(index,"");
        println("Failed "+TEST_NAME+ " NO Exception at index "+index+" size ="+ words.size());
      }catch(IndexOutOfBoundsException e){
      }catch(RuntimeException e){
          println("Failed "+TEST_NAME+ " RuntimeException "+e);
          if(DEBUG)e.printStackTrace();
      }
      try{
        int index = words.size()+10;
        words.add(index,"");
        println("Failed "+TEST_NAME+ " NO Exception at index "+index+" size ="+ words.size());
      }catch(IndexOutOfBoundsException e){
      }catch(RuntimeException e){
          println("Failed "+TEST_NAME+ " RuntimeException " +e);
          if(DEBUG)e.printStackTrace();
      }

    }catch(RuntimeException e){
        println("Failed creating super array for exception testing Exception: "+e);
        if(DEBUG)e.printStackTrace();
    }


  }
}

