package javainterview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * 
 * [confounded, incumbent, jailer, perjury, skimming, sporadic]

	List<String> phrases = Arrays.asList(
        "sporaacdic perjury",
        "confounded skimming",
        "incumbent jailer",
        "confounded jailer");
 * */
public class M12
{
	public static void main(String[] args)
	{
		List<String> list = Arrays.asList("sporaacdic perjury","confounded skimming","incumbent jailer","confounded jailer");
		List<String> list1 = list.stream().flatMap(p->Arrays.stream(p.split(" "))).map(x->x).sorted().distinct().collect(Collectors.toList());
		System.out.println(list1);
	}
}
