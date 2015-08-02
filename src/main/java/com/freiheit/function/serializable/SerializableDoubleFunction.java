package com.freiheit.function.serializable;

import java.io.Serializable;
import java.util.function.DoubleFunction;

/**
 * Serializable version of {@link DoubleFunction}.
 * 
 * @param <R>
 *            the type of the result of the function
 * 
 * @see DoubleFunction
 * @author Michael Bohn (initial creation)
 */
@FunctionalInterface
public interface SerializableDoubleFunction<R> extends DoubleFunction<R>, Serializable {
    //nothing
}
