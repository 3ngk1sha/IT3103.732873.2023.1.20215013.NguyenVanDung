package test_disc;
import disc.DigitalVideoDisc;
//Nguyen Van Dung-20215013
public class TestPassingParameter {

	public static void main(String[] args) {
		
		DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
		DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");

		swap(jungleDVD, cinderellaDVD);
		
		System.out.println("jungle dvd title: " + jungleDVD.getTitle());
		System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());
		
		changeTitle(jungleDVD, cinderellaDVD.getTitle());
		System.out.println("jungle dvd title: " + jungleDVD.getTitle());
//Nguyen Van Dung20215013
	}
	
	public static void swap(Object o1, Object o2) {
		Object tmp = o1;
		o1 = o2;
		o2 = tmp;
	}
	
//	public static void swap(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2)
//	{
//		String title_1 = dvd1.getTitle();
//		dvd1.setTitle(dvd2.getTitle());
//		dvd2.setTitle(title_1);
//	}
	
	public static void changeTitle(DigitalVideoDisc dvd, String title) {
		String oldTitle = dvd.getTitle();
		dvd.setTitle(title);
		dvd = new DigitalVideoDisc(oldTitle);
	}

}

