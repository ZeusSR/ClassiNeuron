package in.Generics.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class LaunchMain {

	public static void main(String[] args) {

		
		List<Integer> al =  Arrays.asList(12,34,44,56,87,99,87,54);
		
		Stream<Integer> stream = al.stream();

		
		System.out.println(al);
		System.out.println(stream);		
		
		
		
//		Consumer<Integer> consumer = new Consumer<Integer>()  //annonymous inner class
//				{
//
//					@Override
//					public void accept(Integer t) {
//
//						System.out.println(t);
//					}
//			
//				};
		
//		Consumer<Integer> consumer =  (t)->System.out.println(t); //Lambda Expression
//		stream.forEach(consumer);
		stream.forEach(n->System.out.println(n));

	
		
		
		Stream<Integer> stream1 = al.stream();
		System.out.println();
		
		Stream<Integer> stream2 = stream1.filter((i)-> i%2==0);
		stream2.forEach(y->System.out.println(y));
		
		System.out.println();
		Stream<Integer> stream3 = al.stream();
		Stream<Integer> stream4 = stream3.map((i)-> i*2);
		stream4.forEach(y->System.out.println(y));
	}

}
