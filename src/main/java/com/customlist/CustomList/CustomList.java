package com.customlist.CustomList;

import java.util.Arrays;

public class CustomList<T> 
{
	private int size=0;
	private int Capacity=10;
	private Object list[];
	public CustomList()
	{
		list=new Object[Capacity];
	}
	public void add(T element)
	{
		if(size==Capacity)
			changeSize();
		list[size++]=element;
	}
	public void changeSize()
	{
		Capacity=Capacity*2;
		list=Arrays.copyOf(list,Capacity);
	}
	public void print()
	{
		System.out.print("[");
		for(int i=0;i<size;i++)
		{
			System.out.print(list[i]);
			if(i!=size-1)
				System.out.print(", ");
		}
		System.out.println(']');
	}
	public T fetch(int index)
	{
		if(index<0 || index>=size)
			throw new IndexOutOfBoundsException("List Index Out of Range");
		return (T)list[index];
	}
	public void remove(int index)
	{
		if(index<0 || index>=size)
			throw new IndexOutOfBoundsException("List Index of Bounds");
		if(index==size-1)
			list[index] = null;
		else
		{
			for(int i=index;i<size-1;i++)
			{
				list[i]=list[i+1];
			}
			list[size-1]=null;
		}
		size--;
	}
	public int size()
	{
		return size;
	}
	public void setSize(int new_size)
	{
		size=new_size;
	}
	public int getCapacity() {
		return Capacity;
	}
	public void setCapacity(int capacity) {
		this.Capacity = capacity;
	}
	public Object[] getList() {
		return list;
	}
	public void setList(Object[] list) {
		this.list = list;
	}
}
