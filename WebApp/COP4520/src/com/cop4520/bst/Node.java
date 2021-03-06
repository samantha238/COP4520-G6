package com.cop4520.bst;

  
//import java.util.concurrent.atomic.AtomicBoolean;
//import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicStampedReference;

public class Node {
	
	// dummy values & flag/tag values
	public static final int DUMMY1 = Integer.MAX_VALUE;
	public static final int DUMMY2 = Integer.MAX_VALUE - 1;
	public static final int DUMMY3 = Integer.MAX_VALUE - 2;
	
	public int key, value;
	public Boolean isMin, isLeaf;
	
	public AtomicStampedReference<Node> left, right;
	
	public static final int INIT = 0;
	public static final int INSERT = 1;
	public static final int FLAG = 2;
	public static final int TAG = 3;
	
	// leaf constructor
	public Node(int key, int value) {
		this.key = key;
		this.value = value;
		this.left = new AtomicStampedReference<Node>(null, INIT);
		this.right = new AtomicStampedReference<Node>(null, INIT);
		//isMin = false;
		isLeaf = true;
	}
	
	public Node(int key, int value, AtomicStampedReference<Node> left, AtomicStampedReference<Node> right) {
		this.key = key;
		this.value = value;
		this.left = left;
		this.right = right;
		//isMin = false;
		isLeaf = false;
	}
}

