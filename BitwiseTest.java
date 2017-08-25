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
 * */
}
