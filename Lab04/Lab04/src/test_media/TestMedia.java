package test_media;
import java.util.*;
import media.*;
//Nguyen Van Dung20215013
public class TestMedia {
   public static void main(String[] args) {
	   List<media> mediae = new ArrayList<media>();
	   book books = new book ("Nha gia kim", "Literature", 29.90f);
	   media cd = new CompactDisc("Christmas","Music", "Leroy Sane","ABC",20.4f);
	   media dvd = new DigitalVideoDisc("The lord","Animation","Tom MN",50, 21.5f);
	   mediae.add(dvd);
	   mediae.add(cd);
	   mediae.add(books);
	   
	   Collections.sort(mediae, media.COMPARE_BY_COST_TITLE);
	   for(media m: mediae) {
		   System.out.println(m.toString());
	   }
	   
	   System.out.println();
	   System.out.println();
	   
	   Collections.sort(mediae, media.COMPARE_BY_TITLE_COST);
	   for(media m: mediae) {
		   System.out.println(m.toString());
	   }
   }
}
