package com.freiheit.function.serializable;

import java.io.Serializable;
import java.util.function.ToDoubleBiFunction;

/**
 * Serializable version of {@link ToDoubleBiFunction}.
 * 
 * @param <T>
 *            the type of the first argument to the function
 * @param <U>
 *            the type of the second argument to the function
 * 
 * @see ToDoubleBiFunction
 * @author Michael Bohn (initial creation)
 */
@FunctionalInterface
public interface SerializableToDoubleBiFunction<T, U> extends ToDoubleBiFunction<T, U>, Serializable {
    //nothing
}
