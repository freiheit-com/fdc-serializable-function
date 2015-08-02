package com.freiheit.function.serializable;

import java.io.Serializable;
import java.util.function.IntFunction;

/**
 * Serializable version of {@link IntFunction}.
 * 
 * @param <R>
 *            the type of the result of the function
 * 
 * @see IntFunction
 * @author Michael Bohn (initial creation)
 */
@FunctionalInterface
public interface SerializableIntFunction<R> extends IntFunction<R>, Serializable {
    //nothing
}
