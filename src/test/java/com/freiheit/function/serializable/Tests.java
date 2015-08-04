package com.freiheit.function.serializable;

import java.io.Serializable;
import java.util.Set;

import org.junit.Test;
import org.reflections.Reflections;

import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Some tests for the functions.
 * 
 * @author Michael Bohn (initial creation)
 */
public class Tests {

    private static final String PACKAGE_NAME = "com.freiheit.function.serializable";

    /**
     * see test name.
     * 
     * Looky silly, but it is very easy to forget the serializable interface in
     * an interface definition.
     */
    @Test
    public void allFunctionsShouldImplementSerializable() throws Exception {
        final Reflections reflections = new Reflections( PACKAGE_NAME );
        final Set<Class<?>> functions = reflections.getTypesAnnotatedWith( FunctionalInterface.class );

        for ( final Class<?> function : functions ) {
            assertThat( function.getName(), Serializable.class.isAssignableFrom( function ) );
        }
    }

    /**
     * see test name.
     */
    //@Test under construction
    public void shouldCoverAllFunctionsFromJDKPackage() throws Exception {

        final Reflections reflections = new Reflections( "java.util.function" );
        final Set<Class<?>> test = reflections.getTypesAnnotatedWith( FunctionalInterface.class );

        //TODO Returns always a set of size 0 - Bug?: https://github.com/ronmamo/reflections/issues/88

        System.out.println( test.size() );
        for ( final Class<?> jdkFunction : test ) {
            System.out.println( jdkFunction.getSimpleName() );
        }
    }
}
