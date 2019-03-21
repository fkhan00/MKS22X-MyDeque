import java.util.*;
@SuppressWarnings("unchecked")
public class MyDeque<E>{
  public E[] data;
  public int size, start, end;
  public MyDeque(){
    size = 10;
    start = 0;
    end = 0;
    data = (E[]) new Object[10];}
  public MyDeque(int startingCapacity){
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
    if(size() == 0){
      throw new NoSuchElementException("your double deque is empty");}
    return data[start];}

  public E getLast(){
    if(size() == 0){
      throw new NoSuchElementException("your double deque is empty");}
    return data[end];}

  public E removeFirst(){
    if(size() == 0){
      throw new NoSuchElementException("your double deque is empty");}
    E temp = getFirst();
    start = (start + 1) %(size());
    size --;
    return temp;}

  public E removeLast(){
    if(size() == 0){
      throw new NoSuchElementException("your double deque is empty");}
    E temp = getLast();
    if(end == 0){
      end = size();}
    end = end - 1;
    size --;
    return temp;}

  public void addFirst(E element){
    if(element == null){
      throw new NullPointerException("please enter a non-null element");}
    if(start == 0){
      resize();
      start = size();}
    start ++;
    data[start] = element;}

  public void addLast(E element){
    if(element == null){
      throw new NullPointerException("please enter a non-null element");}
    end = (end + 1) % (size());
    data[end] = element;}

  public void resize(){
    E[] temp = (E[])new Object[size() * 2];
    for(int i = 0; i < data.length; i++){
      temp[i] = data[i];}}
}
