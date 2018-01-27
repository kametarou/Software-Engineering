
import soft.mapping.Map;
import soft.mapping.MappingFactory;
import soft.mapping.impl.MappingFactoryImpl;

public class MainTest {

	
	public static void main(String[] args) {
		MappingFactory factory = MappingFactoryImpl.init();
		
		Map myMap = factory.createMap();
		
		myMap.init(100, 100, null);
		for(int x = 0; x<100;x++) {
			for(int y=0; y<100; y++) {
				System.out.println(myMap.getCells()[x][y].toString());
			}
		}
	}
}
