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
    start = (start + 1) %(size());
    size --;}

  public void removeLast(){
    if(end == 0){
      end = size();}
    end = end - 1;
    size --;}

  public void addFirst(E element){
    if(start == 0){
      resize();
      start = size();}
    start ++;
    data[start] = element;}

  public void addLast(E element){
    end = (end + 1) % (size());
    data[end] = element;}
}
