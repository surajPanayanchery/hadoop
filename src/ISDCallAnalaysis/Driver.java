package ISDCallAnalaysis;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.mapreduce.Job;

public class Driver {

	public static void main(String[] args)throws Exception {	
		Configuration conf = new Configuration();
		Job job = new Job(conf,"My Word Count Program");
		System.out.println("First Program");
	}	

}
