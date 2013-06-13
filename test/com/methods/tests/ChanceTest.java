package com.methods.tests;

import com.methods.src.Chance;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: emily
 * Date: 6/13/13
 * Time: 2:06 AM
 * To change this template use File | Settings | File Templates.
 */
public class ChanceTest {
    @Test
    public void chanceShouldBeEqualToItself(){
        Chance chance = new Chance(0.5);
        boolean equals = chance.equals(chance);

        assertThat(equals, is(true) );
    }

    @Test
    public void shouldNotBeEqualToNull(){
        Chance chance = new Chance(0.1);

        assertThat(chance.equals(null), is(false));
    }

    @Test
    public void shouldNotBeEqualToADifferentObject(){
        Chance chance = new Chance(0.2);
        Object o = new Object();

        assertThat(chance.equals(o), is(false));
    }
    @Test
    public void shouldNotEqualChanceWithDifferentProbability(){
        Chance chance1 = new Chance(0.2);
        Chance chance2 = new Chance(0.1);

        assertThat(chance1.equals(chance2), is(false));
    }
    @Test
    public void shouldEqualToChanceWithSameProbability(){
        Chance chance1 = new Chance(0.8);
        Chance chance2 = new Chance(0.8);

        assertThat(chance1.equals(chance2), is(true));
    }
}
