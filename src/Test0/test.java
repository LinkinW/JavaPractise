/**
 * 
 */
package Test0;

/**
 * @author LJ
 *
 */
public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleLocation ls = new SimpleLocation(10.2,12.2);
		SimpleLocation ls0 = new SimpleLocation();
		
//		ls.latitude = 100.0;
		
		System.out.println(ls.getLatitude());
		System.out.println(ls.getLongtitude());
		System.out.println(ls0.getLatitude());
		System.out.println(ls0.getLatitude());
		
		ls0.setLatitude(190.2);
		System.out.println(ls0.getLatitude());
	}

}
