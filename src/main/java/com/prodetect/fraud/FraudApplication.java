package com.prodetect.fraud;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.swing.*;
import java.util.*;

@SpringBootApplication
@EntityScan(basePackages = "com.prodetect.fraud.entity")
public class FraudApplication {

	public static void main(String[] args) {

	SpringApplication.run(FraudApplication.class, args);


	}


////////////////// Heap Class Implementation using Arraylist //////////////////////////////////



//	Class Heap{
//
//		ArrayList<Integer> heap = new ArrayList<>();
//
//
//		public void add(int element){
//
//			heap.add(element);
//			heapify(heap);
//
//
//		}
//
//
//		public void heapify(ArrayList<Integer> heap){
//
//			int currentIndex = heap.size() -1;
//
//			int parentIndex = (currentIndex -1)/2;
//
//			while(currentIndex > 0){
//
//				if(heap.get(currentIndex) < heap.get(parentIndex)){
//
//					swap(currentIndex,parentIndex);
//
//				}
//
//				currentIndex = parentIndex;
//
//			}
//
//		}
//
//
//
//		public void swap(int currentIndex, int parentIndex){
//
//				int temp = heap.get(parentIndex);
//
//				heap.set(parentIndex,heap.get(currentIndex));
//
//			    heap.set(currentIndex,heap.get(parentIndex));
//
//		}
//
//
//	}

}



