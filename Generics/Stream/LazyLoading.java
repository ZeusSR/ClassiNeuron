package in.Generics.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class LazyLoading {

	public static void main(String[] args) {

		List<Integer> al =  Arrays.asList(11,224,244,256,287,399,457,154);
		
		Stream<Integer> stream = al.stream();

		
		System.out.println(al);
		System.out.println(stream);		
		
		
		
		Function<Integer,Integer> func = new Function<Integer,Integer>(){

			@Override
			public Integer apply(Integer t) {
				System.out.println(t);
				return t-t/2;
			}
			
		};


		//stream.filter((n)->n%2==0).map(func); 
/*		Here the computation for map has not started unless the output is required by reduce method*/
		
		System.out.println(stream.filter((n)->n%2==0).map(func).reduce(0,(s,d)->s%d));
//		stream.filter((n)->n%2==0).map(func).reduce(0,(s,d)->s%d);
	}

}
