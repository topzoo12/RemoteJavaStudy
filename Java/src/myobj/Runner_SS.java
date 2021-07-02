package myobj;

import java.util.TreeSet;


public class Runner_SS {

		public static void main(String[] args) {
			
			
			TreeSet<Runner> run = new TreeSet<Runner>();
			
			for (int i = 0; i < 100; i++) {
				run.add(new Runner());
			}
			
			System.out.println(run);
			//run.descendingSet();
			//System.out.println(run);
			
			System.out.println(run.size());
			
			Runner from = new Runner();
			Runner to = new Runner();
			
			from.run_result = 10.0;
			to.run_result = 11.5;
			
			
			System.out.println(run.subSet(from, to));
			System.out.println(run.subSet(from, to).size());
		}
}
