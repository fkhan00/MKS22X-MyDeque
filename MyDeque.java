public class MyDeque<E>{
  public E[] data;
  public int size = 10;
  public int start = 0;
  public int end = 0;
  public MyDeque(){
    @SuppressWarnings("unchecked")
    data = (E[])new Object[10];}

  public MyDeque(int startingCapacity){
    @SuppressWarnings("unchecked")
    size = startingCapacity;
    end = startingCapacity;
    start = 0;
    data = (E[])new Object[startingCapacity];}

  public int size(){
    return size;}

  public String toString(){
    String output = "";
    for(int i = start; i < data.length; i++){
      output += " " + data[i];}
    for(int i = 0; i <= end; i++){
      output += " " + data[i];}
    return output;}

  public E getFirst(){
    return data[start];}

  public E getLast(){
    return data[end];}

  public void removeFirst(){
    start = (start + 1) %(data.length);}

  public void removeLast(){
    if(end == 0){
      end = data.length - 1;}
    end = end - 1;}

  public void addFirst(E element){
}

  public void addLast(E element){

  }
}
