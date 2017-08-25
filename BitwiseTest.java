package com.samuel;
// https://www.tutorialspoint.com/java/java_bitwise_operators_examples.htm
// dsamuel: added my understanding
public class BitwiseTest {

	   public static void main(String args[]) {
		      int a = 60;	/* 60 = 0011 1100 */
		      int b = 13;	/* 13 = 0000 1101 */
		      int c = 0;

		      c = a & b;        /* 12 = 0000 1100 */
		      System.out.println("a & b = " + c );

		      c = a | b;        /* 61 = 0011 1101 */
		      System.out.println("a | b = " + c );

		      c = a ^ b;        /* 49 = 0011 0001 */
		      System.out.println("a ^ b = " + c );

		      c = ~a;           /*-61 = 1100 0011 */
		      System.out.println("~a = " + c );

		      c = a << 2;       /* 240 = 1111 0000 */
		      System.out.println("a << 2 = " + c );

		      c = a >> 2;       /* 15 = 1111 */
		      System.out.println("a >> 2  = " + c );

		      c = a >>> 2;      /* 15 = 0000 1111 */
		      System.out.println("a >>> 2 = " + c );
		      
		      
		      int d = 5; /* 0101 */
		      int e = d >>> 1;
		      System.out.println("d >>> 1  = " + e );
		      
		      int f = -60; 	    // 11111111111111111111111111000100 
//		      System.out.println("f=" + Integer.toBinaryString(f));
//		      int h = f >>> 1;  //  01111111111111111111111111100010
//		      System.out.println("f >>> 1  = " + h );
//		  //    System.out.println("h=" + Integer.toBinaryString(h));
//		      System.out.println("h=01111111111111111111111111100010");
//		      int i = f >>> 20;
//		      System.out.println("f >>> 20  = " + i );
//		      System.out.println(Integer.toBinaryString(i));
//		       
//		      System.out.println("f=" + (f>>2));
		      System.out.println("f=" + Integer.toBinaryString(f>>2)); // notice how sign does not change
		      
		      // f=111111111111111111111111110001 same as f=00111111111111111111111111110001
		      System.out.println("f=" + Integer.toBinaryString(f>>>2));// notice how sign has changed since it is a negative
		   }
/*

a & b = 12 
(ie. 0011 1100 & 0000 1101 = 00001100 - it's an AND logic for the bits)

a | b = 61
(ie. 0011 1100 & 0000 1101 = 00111101 - it's an OR logic for the bits)

a ^ b = 49
(ie. 0011 1100 & 0000 1101 = 00110001 - it's an EXCLUSIVE OR logic for the bits, ie. if both are true, then false, only one should be true for it to be true)

~a = -61
(ie. ~0011 1100 = 1100 0011 - inverts the bits, 0 to 1 and 1 to 0)

a << 2 = 240
(ie. 0011 1100 << 2 = 1111 0000 - shifts two bits to left)

a >> 2  = 15
(ie. 0011 1100 >> 2 = 1111 - shifts two bits to right)

a >>> 2 = 15
(ie. 0011 1100 >>> 2 = 0000 1111 - unsigned right shift, will shift sign bit, replacing with zero - a little unsure)
 So >> preserves the sign, while >>> doesn't.  >> is referred to as the arithmetic shift and >>> is the logical shift.
 https://stackoverflow.com/questions/1034640/javas-versus-operator
 more examples above
 * 
 * */
}
