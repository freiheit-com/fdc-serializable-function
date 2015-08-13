package com.freiheit.function.serializable;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;

import org.junit.Test;
import org.reflections.Reflections;

import static org.hamcrest.MatcherAssert.assertThat;

import sun.misc.Launcher;

/**
 * Some tests for the functions.
 * 
 * @author Michael Bohn (initial creation)
 */
@ParametersAreNonnullByDefault
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
        final Set<Class<?>> functions = serializableFunctions();

        for ( final Class<?> function : functions ) {
            assertThat( function.getName(), Serializable.class.isAssignableFrom( function ) );
        }
    }

    /**
     * see test name.
     */
    @Test
    public void shouldCoverAllFunctionsFromJDKPackage() throws Exception {

        final Reflections reflections = new Reflections( "java.util.function", Launcher.getBootstrapClassPath().getURLs() );
        final Set<Class<?>> jdkFunctions = reflections.getTypesAnnotatedWith( FunctionalInterface.class );

        final Set<Class<?>> serializableFunctions = serializableFunctions();

        final Set<Class<?>> notFoundJdkFunctions = new HashSet<>();
        for ( final Class<?> jdkFunction : jdkFunctions ) {
            final Class<?> correspondingSerializableFunction =
                    findSerializableVariantOf( jdkFunction.getSimpleName(), serializableFunctions );
            if ( correspondingSerializableFunction == null ) {
                notFoundJdkFunctions.add( jdkFunction );
            }
        }

        assertThat( String.format( "Not covered ( %s ): %s ", notFoundJdkFunctions.size(), notFoundJdkFunctions ),
                notFoundJdkFunctions.isEmpty() );
    }

    //helper methods

    @CheckForNull
    private Class<?> findSerializableVariantOf( final String name, final Set<Class<?>> classes ) {
        final String serializableName = "Serializable" + name;
        for ( final Class<?> clazz : classes ) {
            if ( clazz.getSimpleName().equals( serializableName ) ) {
                return clazz;
            }
        }
        return null;
    }

    @Nonnull
    private Set<Class<?>> serializableFunctions() {
        final Reflections reflections = new Reflections( PACKAGE_NAME );
        return reflections.getTypesAnnotatedWith( FunctionalInterface.class );
    }
}
