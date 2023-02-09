package oop;

//import java.security.PublicKey;

public class Student2 {
	private String name;
	private int[] jumsu;
		
		public Student2() {
			this(null, null);
		}
		
		public Student2(String name, int[] jumsu) {
			this.name = name;
			this.jumsu = jumsu;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int[] getJumsu() {
			return jumsu;
		}

		public void setJumsu(int[] jumsu) {
			this.jumsu = jumsu;
		}
			
		public int getSum() {
			int sum = 0;
			for (int i = 0; i < jumsu.length; i++) {
				sum += jumsu[i];
			}
			return sum;
		}
		public double getAvg() {
			return (double)getSum() / jumsu.length;
		}
	}
	
	
