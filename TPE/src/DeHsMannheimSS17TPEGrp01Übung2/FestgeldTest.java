package DeHsMannheimSS17TPEGrp01�bung2;

import static org.junit.Assert.*;

import org.junit.Test;

public class FestgeldTest {

	@Test
	public void test() {
		Festgeld fg = new Festgeld("Sedat", 100, "15.11");
		long output = fg.zins();
		assertEquals(162, output);
	}

}
