package hashtable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicateTest {

    ContainsDuplicate containsDuplicate = new ContainsDuplicate();

    @Test
    void itShouldReturnTrue_IfArrayContainsDuplicate() {
        int[] nums = {1, 2, 3, 1};
        assertTrue(containsDuplicate.containsDuplicate(nums), "Should return true for duplicate elements");
    }

    @Test
    void itShouldReturnFalse_IfArrayDoesNotContainDuplicate() {
        int[] nums = {1, 2, 3, 4};
        assertFalse(containsDuplicate.containsDuplicate(nums), "Should return false for unique elements");
    }

    @Test
    void itShouldThrowsRuntimeException_IfInputIsNull() {
        assertThrows(RuntimeException.class, () -> containsDuplicate.containsDuplicate(null));
    }

    @Test
    void itShouldThrowsRuntimeException_IfInputIsEmpty() {
        int[] nums = {};
        assertThrows(RuntimeException.class, () -> containsDuplicate.containsDuplicate(nums));
    }

}