package test.api.model.reference;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import stravajava.api.v3.model.reference.StravaResourceState;

/**
 * @author dshannon
 *
 */
public class StravaResourceStateTest {
	@Test
	public void testGetId() {
		for (StravaResourceState type : StravaResourceState.values()) {
			assertNotNull(type.getId());
			assertEquals(type, StravaResourceState.create(type.getId()));
		}
	}

	@Test
	public void testGetDescription() {
		for (StravaResourceState type : StravaResourceState.values()) {
			assertNotNull(type.getDescription());
		}
	}

}