package DeHsMannheimSS17TPEGrp01�bung2;

import static org.junit.Assert.*;

import org.junit.Test;

public class AktieTest {

	@Test
	public void test() {
		Aktie as = new Aktie("Sedat", 100, "10.12", 1.5, 3);
		long output = as.aktuellerStand();
		assertEquals(100, output);
	}

}
