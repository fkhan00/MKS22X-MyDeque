public class MyDeque<E>{
  public E[] data;
  public int size, start, end;
  public MyDeque(){
    @SuppressWarnings("unchecked")
    size = 10;
    end = 10;
    start = 0;
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
    for(int i = 0; i < data.length; i++){
      output += data[i];}
    return output;}

  public E getFirst(){
    return data[start];}

  public E getLast(){
    return data[end];}

  public void removeFirst(){
    start = (start + 1) % (data.length);}

  public void removeLast(){
    end = (Math.abs((end - 1)) % (data.length));}

  public void addFirst(E element){
    if(Math.abs(end - start) == 1){
      resize();}
    start = (size() - start + 1) % (size());
    data[start] = element;}

  public void addLast(E element){
    if(Math.abs(end - start) == 1){
      resize();}
    end = (end + 1) % size();
    data[end] = element;
  }
}
