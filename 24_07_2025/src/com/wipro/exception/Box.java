package com.wipro.exception;

public class Box<T> {
 private T items;

 public void set(T item) {
     this.items = item;
 }

 public T get() {
     return items;
 }
}
