package org.zhudro.fiftyone;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by mikalai on 08.02.16.
 */
public class PaswordStrenthIndicatorTest {
    @Test
    public void very_weak_password_contains_only_numbers_and_fever_than_8_characters() {
        Assert.assertEquals(PasswordStrenthIndicator.calculatePasswordStrentgh(null), PasswordStrength.VERY_WEAK);
    }
    @Test
    public void very_weak_password_contains_only_numbers_and_fever_than_8_characters2() {
        Assert.assertEquals(PasswordStrenthIndicator.calculatePasswordStrentgh(""), PasswordStrength.VERY_WEAK);
    }
    @Test
    public void very_weak_password_contains_only_numbers_and_fever_than_8_characters3() {
        Assert.assertEquals(PasswordStrenthIndicator.calculatePasswordStrentgh("1"), PasswordStrength.VERY_WEAK);
    }
    @Test
    public void weak_password_contains_only_letters_and_fever_than_8_characters3() {
        Assert.assertEquals(PasswordStrenthIndicator.calculatePasswordStrentgh("a"), PasswordStrength.WEAK);
    }
    @Test
    public void strong_password_contains_at_least_one_number_and_at_least_8_characters() {
        Assert.assertEquals(PasswordStrenthIndicator.calculatePasswordStrentgh("1qwertyu1"), PasswordStrength.STRONG);
    }
}
